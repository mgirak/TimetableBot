package com.bot;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Kalendar {
    public static String getKalendar(){
        Date dateNow = new Date();
        SimpleDateFormat MonthNow = new SimpleDateFormat("M");
        String month = MonthNow.format(dateNow);
        String result = "";
        switch (Integer.parseInt(month)){
            case 1 :
                result = "1";
                break;
            case 2:
                result = "2";
                break;
            case 3:
                result = "Морти, мы не в той времянной вселенной";
            break;
            case 4:
                result = "src/main/resources/pictures/4.png";
            break;
            case 5:
                result = "src/main/resources/pictures/5.png";
            break;
            case 6:
                result = "src/main/resources/pictures/6.png";
            break;
            case 7:
                result = "src/main/resources/pictures/7.png";
            break;
            case 8:
                result = "src/main/resources/pictures/8.png";
            break;
            case 9:
                result = "src/main/resources/pictures/9.png";
            break;
            case 10:
                result = "src/main/resources/pictures/10.png";
            break;
            case 11:
                result = "src/main/resources/pictures/11.png";
            break;
            case 12:
                result = "src/main/resources/pictures/12.png";
            break;

        }
       return result;
    }
}
