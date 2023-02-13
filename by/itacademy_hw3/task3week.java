package by.itacademy_hw3;

import java.util.Scanner;

public class task3week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        switch (b) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6,7:
                System.out.println("Выходной");
            default:
                System.out.println("Дня недели под таким номером не существует");
        }
    }
}