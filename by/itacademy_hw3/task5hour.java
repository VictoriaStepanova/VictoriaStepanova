package by.itacademy_hw3;

import java.util.Scanner;

public class task5hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        if (hour >= 0 && hour <= 14){
            System.out.println("Первая четверть часа");
        }else if (hour >= 15 && hour <= 29){
            System.out.println("Вторая четверть часа");
        }else if (hour >= 30 && hour <= 44){
            System.out.println("Третья четверть часа");
        }else if (hour >= 45 && hour <= 59){
            System.out.println("Четвертая четверть часа");
        }else{
            System.out.println("Число не входит в диапазон одного часа");
        }
    }
}
