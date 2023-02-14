package by.itacademy_hw2;

public class task4cast {
    public static void main(String[] args) {
        byte a = 35;
        short b = a;
        System.out.println(a);
        cast1(a, b);
        byte c = 45;
        int d = c;
        System.out.println(c);
        cast2(c, d);
        byte i = 55;
        long f = i;
        System.out.println(i);
        cast3(i, f);
        float g = 48.8f;
        double j = g;
        System.out.println(g);
        cast4(g, j);
    }

    public static void cast1(byte a, short b) {
        a = 35;
        b = a;
    }

    public static void cast2(byte c, int d) {
        c = 45;
        d = c;
    }

    public static void cast3(byte i, long f) {
        i = 55;
        f = i;
    }

    public static void cast4(float g, double j) {
        g = 48.8f;
        j = (double) g;
    }
}
