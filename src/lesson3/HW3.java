package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HW3 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int max = 10;
        int userAnswer;
        do {
            int answer = random.nextInt(max);
            boolean guess = false;
            System.out.printf("Введите число от 0 до %d. У вас есть 3 попытки.", max - 1);
            System.out.println();
            for (int i = 0; i < 3; i++) {
                userAnswer = sc.nextInt();
                if (userAnswer > answer) {
                    System.out.println("Загаданное число меньше");
                }
                if (userAnswer < answer) {
                    System.out.println("Загаданное число больше");
                }
                if (userAnswer == answer) {
                    guess = true;
                    break;
                }
            }
            if (guess) {
                System.out.println("Вы угадали!");
            } else {
                System.out.println("Вы неугадали! Ответ: " + answer);
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            userAnswer = sc.nextInt();
        } while (userAnswer == 1);

    }


}
