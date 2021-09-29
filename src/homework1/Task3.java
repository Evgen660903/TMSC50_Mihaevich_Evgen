package homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста количество дней");
        int N = scanner.nextInt();
        int maxDayRain = 0, aver, total = 0, n = 0;
        System.out.println("Введите пожалуйста количество осадков, выпавшее за каждый день ");
        for (int i = 1; i <= N; i++) {
            ++n;
            System.out.print(n + ".");
            int dayRain = scanner.nextInt();
            if (maxDayRain < dayRain) {
                maxDayRain = dayRain;
            }
            total = total + dayRain;
        }
        aver = total / N;
        System.out.println("За " + N + " дней выпало " + total + "мм осадков");
        System.out.println("Максимальное количество осадков за день " + maxDayRain + " мм");
        System.out.println("Среднее количество осадков за день " + aver + " мм");
    }
}

