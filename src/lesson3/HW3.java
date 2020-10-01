package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HW3 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int answer = random.nextInt(9);
        int tryCount = 0;
        int userAnswer;
        do {
            System.out.println("Введите число от 0 д 9. У вас есть 3 попытки. ");
            System.out.println(answer);
            userAnswer = sc.nextInt();
            tryCount++;
            if (userAnswer > answer) {
                System.out.println("Загаданное число меньше");
            } else if (userAnswer < answer) {
                System.out.println("Загаданное число больше");
            } else tryCount = 3;
        } while (tryCount < 3);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        userAnswer = sc.nextInt();
        if (userAnswer > 0) tryCount = 0;
    }


}
