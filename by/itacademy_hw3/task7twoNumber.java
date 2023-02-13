package by.itacademy_hw3;

import java.util.Scanner;

public class task7twoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 0 && a < 9 && b > 0 && b < 9) {
            System.out.println("Каков результат умножения первого числа на второе?: " );
            int d = sc.nextInt();
            int c = a * b;
            if (c == d){
                System.out.println("Pravilno");
            }
            else{
                System.out.println("Ne provilno");
            }
        }
        else {
            System.out.println("Числа неоднозначны");
        }
    }
}
