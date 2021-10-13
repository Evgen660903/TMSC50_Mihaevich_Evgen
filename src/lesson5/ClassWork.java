package lesson5;

public class ClassWork {

    public static void main(String[] args) {
        String test = "";
        long beforeString = System.currentTimeMillis();
        for (int i = 0; i <= 100_000; i++) {
            test += i;
        }
        long afterString = System.currentTimeMillis();
        System.out.println(afterString - beforeString);
        StringBuilder builder = new StringBuilder();
        long beforeStringBuilder = System.currentTimeMillis();
        for (int i = 0; i <= 100_000; i++) {
            builder.append(i);
        }
        long afterStringBuilder = System.currentTimeMillis();
        System.out.println(afterStringBuilder - beforeStringBuilder);

    }
}
