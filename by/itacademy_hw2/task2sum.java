package by.itacademy_hw2;

import java.util.Scanner;

public class task2sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a, b);
        System.out.println((a + b) + a * b);
    }

    public static int sum(int a, int b) {
        return (a + b) + a * b;
    }
}
