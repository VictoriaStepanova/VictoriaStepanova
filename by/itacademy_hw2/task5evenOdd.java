package by.itacademy_hw2;

import java.util.Scanner;

public class task5evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int  b = 2;
        evenOdd(a, b);

    }

    public static int evenOdd(int a, int b) {
        if (a % 2 == 0) {
            System.out.println(0);
            System.out.println();
        } else {
            System.out.println(a % b);
        }
        return 0;
    }
}











