package by.itacademy_hw2;

import java.util.Scanner;

public class task3second {
    public static void main(String[] args) {
        Scanner second = new Scanner(System.in);
        long week;
        long day;
        long hour;
        long min;
        long sec;
        System.out.println("Enter seconds ");
        sec = second.nextInt();
        week = sec / 604800;
        day = sec / 86400;
        hour = sec / 3600;
        min = (sec % 3600) / 60;
        sec = (sec % 3600) % 60;
        System.out.println("The time entered in weeks, days, hours, minutes and seconds is: ");
        System.out.println("week(s): " + week + ";" + " day(s): " + day + ";" + " hour(s): " + hour + ";" + " minute(s): " + min + ";" + " second(s): " + sec+ ".");
    }
}

