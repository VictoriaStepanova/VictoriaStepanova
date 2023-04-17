package by.itacademy_hw3;

import java.util.Scanner;

public class task2number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        number(a);

    }

    public static double number(double a) {
        if (a % 2 == 1) {
            System.out.println(Math.signum(a) + " " + "Число нечетное положительное: ");
            System.out.println();
        } else if (a % 2 == 0){
            System.out.println(Math.signum(- a) + " " + "Число четное отридцательное: ");
            System.out.println();
        }
        return 0;
    }
}
