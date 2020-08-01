package com.juan.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter =
                LocalDateTime.of(2020,07,31,
                        12,0,0,0);
        LocalDateTime leave =
                LocalDateTime.of(2020,07,31,
                        14,0,0,0);
        Car car = new Car("AAA-0001",enter);
        car.setLeave(leave); //設定離場時間
        System.out.println(car.getDuration());//計算停留分鐘數
        long hours = (long)Math.ceil(car.getDuration()/60.0);//計算停留幾小時 Math.ceil()無條件進位
        System.out.println(hours);
        System.out.println(30*hours);
        //java8();
        //java();
    }

    private static void java8() {
        Instant instant = Instant.now(); // 帶有時區的物件
        System.out.println(instant);
        //lacal 本地時間物件
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");//設定格式
        System.out.println(formatter.format(now)); //  把本地時間格式化
        System.out.println(now.plus(Duration.ofHours(3))); //   時間加3小時
        LocalDateTime other = LocalDateTime.of(2020,07,31,16,07);//指定時間
        System.out.println(other);
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s = "2020/07/31 08:00:00" ;
        Date other = null;
        try {
            other = sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //System.out.println(other);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,9); //一月份為0，二月份為2，十月份為9....以此類推
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }
}
