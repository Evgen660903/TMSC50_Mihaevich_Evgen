package homework1;

import static java.lang.Math.abs;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целое число");
        int inputNumber = scanner.nextInt();
        inputNumber = abs(inputNumber);
        int digitSum = 0;
        while ( inputNumber >= 10 ) {
            int curDigit = inputNumber % 10;
            digitSum = curDigit + digitSum;
            inputNumber = inputNumber / 10;
        }
        digitSum = inputNumber + digitSum;
        System.out.print("Сумма цифр введенного вами числа равна " + digitSum);
       }
}


