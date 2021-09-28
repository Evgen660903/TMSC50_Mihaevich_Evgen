package homework1;
import static java.lang.Math.abs;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целое число");
        int x = scanner.nextInt();
        x = abs(x);
        int z = 0;
        while ( x >= 10 ) {
            int y = x % 10;
            z = y + z;
            x = x / 10;
        }
        z = x + z;
        System.out.print("Сумма цифр введенного вами числа равна " + z);
       }
}


