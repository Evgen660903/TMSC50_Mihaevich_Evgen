package lesson4.homework;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Введите число в римском формате в пределах от 1 до 3999");
        Scanner scanner = new Scanner(System.in);
        String testString = scanner.next();
        if (isNotEmpty(testString)) {
            int arabicNumberFormat = getRomanToArabic(testString);
            if (arabicNumberFormat > 0 && arabicNumberFormat < 4000) {
                System.out.println("Полученное число в арабском формате");
                System.out.println(arabicNumberFormat);
            } else System.out.println("Введена некорректная информация");
        } else {
            System.out.println("пустая строка");
        }
    }

    public static int getRomanToArabic(String anyString) {
        int start = 0;
        int end = anyString.length();
        char[] dst = new char[end - start];
        anyString.getChars(start, end, dst, 0);
        int[] arrayToProcess = new int[dst.length];
        for (int i = 0; i < arrayToProcess.length; i++) {
            if (dst[i] == 'M') {
                arrayToProcess[i] = 1000;
            } else if (dst[i] == 'D') {
                arrayToProcess[i] = 500;
            } else if (dst[i] == 'C') {
                arrayToProcess[i] = 100;
            } else if (dst[i] == 'L') {
                arrayToProcess[i] = 50;
            } else if (dst[i] == 'X') {
                arrayToProcess[i] = 10;
            } else if (dst[i] == 'V') {
                arrayToProcess[i] = 5;
            } else if (dst[i] == 'I') {
                arrayToProcess[i] = 1;
            }
        }

        for (int i = 0; i < arrayToProcess.length - 1; i++) {
            arrayToProcess[i] = arrayToProcess[i] < arrayToProcess[i + 1] ? -arrayToProcess[i] : arrayToProcess[i];
        }

        int sum = 0;
        for (int i = 0; i < arrayToProcess.length; i++) {
            sum += arrayToProcess[i];
        }
        return sum;
    }

    public static boolean isNotEmpty(String anyString) {
        return !"".equals(anyString) && anyString != null;
    }
}

