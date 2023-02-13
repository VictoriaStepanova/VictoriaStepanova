package by.itacademy_hw3;

import java.util.Scanner;

public class task6triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a <= (b + c) && b <= (a + c) && c <= (a + b)) {
            System.out.println("Треугольник существует!");
        }else {
            System.out.println("Треугольник не существует");
        }
    }
}
