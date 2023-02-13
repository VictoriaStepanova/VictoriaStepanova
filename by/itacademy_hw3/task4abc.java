package by.itacademy_hw3;

import java.util.Scanner;

public class task4abc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x;
        if (a > b) {
            x = a;
            a = b;
            b = x;
        }
        if (b > c) {
            x = b;
            b = c;
            c = x;
        }
        System.out.println( a + " " + b + " " + c);
    }
}
