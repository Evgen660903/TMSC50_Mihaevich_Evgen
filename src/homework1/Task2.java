package homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число до которого необходимо отобразить все числа Фибоначчи");
        int x = scanner.nextInt();
        int numFib1 = 0;
        int numFib2 = 1;
        int numFib = 0;
        System.out.println(" Числа Фибоначчи лежащие левее " +  x);
        while ( numFib < x) {
            System.out.println(numFib);
            numFib = numFib1 + numFib2;
            if (numFib == 1 && numFib < x) {
                System.out.println(numFib);
            }
            numFib1 = numFib2;
            numFib2 = numFib;
        }
    }
}
