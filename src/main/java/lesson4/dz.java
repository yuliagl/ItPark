package lesson4;

import java.util.Scanner;

public class dz {
        public static void main(String[] args) {
            System.out.println("Напишите число!");
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            System.out.println("Вы ввели число:" + value);
            int koren = value;
            System.out.println(koren);

        }
        private static long value(int i) {
            return i * i;
        }
    }
