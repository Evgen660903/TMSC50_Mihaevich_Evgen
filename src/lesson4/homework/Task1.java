package lesson4.homework;

import java.util.Scanner;

import static lesson4.homework.Task2.isNotEmpty;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите тестируемую строку");
        Scanner scanner = new Scanner(System.in);
        String testString = scanner.next();
        if (isNotEmpty(testString)) {
            String revers = getRevers(testString);
            boolean palindrom = testString.equals(revers);
            if (palindrom == true) {
                System.out.println("Введенная строка является палиндромом");
            } else {
                System.out.println("Введенная строка не является палиндромом");
            }
        } else {
            System.out.println("String is empty");
        }
    }

    public static String getRevers(String wordToProcess) {
        StringBuilder builder = new StringBuilder(wordToProcess);
        builder.reverse();
        System.out.println(builder);
        return builder.toString();
    }
}





