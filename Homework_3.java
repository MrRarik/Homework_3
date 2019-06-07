/**
 * level 1, lesson 3.
 * @author Maluy Yaroslav
 * @version data 07.06.19
 */

import java.util.Random;
import java.util.Scanner;

public class Homework_3 {

    public static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        int a = 0;
        comparisonInt();
        System.out.println("Продолжить 1 или уйти 0:");
        checkInt();
    }
//1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    public static void checkInt() {
        int c = scan.nextInt();
        while (true) {
            switch (c) {
                case 1:
                    comparisonInt();
                    System.out.println("Продолжить 1 или уйти 0:");
                    c = scan.nextInt();
                    break;
                default:
            }
        }
    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int b;
        do {
            System.out.println(message);
            b = scan.nextInt();
        } while (b < min || b > max);
        return b;
    }


    public static void comparisonInt() {
        Random rand = new Random(System.currentTimeMillis());
        int a = rand.nextInt(10);
        for (int j = 3; j > 0; j--) {
            int b = getNumberFromScanner("Введи число от 0 до 9: ", 0, 9);
            if (a < b) {
                System.out.println("Число больше за загаданое!");
            } else if (a > b) {
                System.out.println("Число менше за загаданое!");
            }
            for (int i = 3; i > 0; i--) {

                if (a == b) {
                    System.out.println("Победа!");
                    break;
                }
                if (i == 0)
                    break;
              }
            }
          }
        }