package lesson1;

public class MainHW {
    public static void main(String[] args) {

        byte byteValue = 120;
        short shortValue = 23280;
        int intValue = 1;
        long longValue = 999999999999L;
        float floatValue = 10.5f;
        double doubleValue = 15.55555;
        char charValue = 'a';
        boolean booleanValue = false;

        System.out.println(math(2, 3, 3, 1));
        System.out.println(range(10, 4));
        negativeOrPositive(0);
        System.out.println(negativeTrue(-3));
        hello_name("Джон");
        bissextile(1900);

    }

    static float math(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

/*    static boolean range(int a, int b) {
        if (10 <= (a + b) && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }*/

    public static boolean range(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }

    public static void negativeOrPositive(int x) {
        if (x >= 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }
    }

    public static boolean negativeTrue(int x) {
        return x < 0;
    }

    static void hello_name(String name) {
//        System.out.println("Привет, " + name + "!");
        System.out.printf("Привет, %s !\n ", name);
    }

    /*static void bissextile(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не високосный");
        } else if (year % 4 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }*/

    static void bissextile(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }
}
