package com.bot;

import com.petersamokhin.bots.sdk.clients.Group;
import com.petersamokhin.bots.sdk.objects.Message;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        Group group = new Group(194194997, Prop.getDataFromProp("vk_key"));
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("w");
        AtomicInteger id = new AtomicInteger();
        String sms = "";

        group.onSimpleTextMessage(message ->
                new Message()
                        .from(group)
                        .to(message.authorId())
                        .text("Пожалуйста, пиши команды правильно, ошибок мне и без твоих хватает")
                        .send()
        );

        group.onPhotoMessage(message ->
                new Message()
                        .from(group)
                        .to(message.authorId())
                        .text("Я умею только читать( Но есть шанс ,что твоя картинка мне нравится")
                        .send()
        );
        group.onCommand("!kalendar" , message ->
                new Message()
                .from(group)
                .to(message.authorId())
                        .text(WeekCheck.getDay())
                .photo(Kalendar.getKalendar())
                .send()

                );
        group.onCommand("!changeGroup\\s\\w{3}-\\d{3}"  , message -> {
            id.set(message.authorId());
            new Message()
                    .from(group)
                    .to(message.authorId())
                    .text(id)
                    .send();
        });

        group.onCommand("!help", message ->
                new Message()
                        .from(group)
                        .to(message.authorId())
                        .text(Helper.getHelp())
                        .send()
        );
        group.onCommand("!date", message ->
                        new Message()

                                .from(group)
                                .to(message.authorId())
                                .text("Идёт " +WeekCheck.getNumberOfWeek() + "ая неделя , " + WeekCheck.getEvenWeek() + ". " + WeekCheck.getDay())
                                .send()
        );


        }
}
