package assignment.assignment2.exercise;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Random;

public class Ex4 {
    public static void question01() {
        Random random = new Random();
        System.out.println("Số nguyên ngẫu nhiên : " + random.nextInt());

    }
    public static void question02() {
        Random random = new Random();
        System.out.println("Số thực ngẫu nhiên : " + random.nextFloat());
    }
        public static void question03() {
        Random random = new Random();
    String[] names = {"Trang", "Hằng", "Duy", "Đức", "Hoàng"};
    // 0 <= index(Chỉ số) < = length -1
    int i = random.nextInt(names.length);
            System.out.println("Tên ngẫu nhiên: " + names[i]);
    }
        public static void question04(){
        Random random = new Random();
            LocalDate minDate = LocalDate.of(1995, 07, 24);
            LocalDate maxDate = LocalDate.of(1995, 12,20);
            int minDay = (int) minDate.toEpochDay();
            int maxDay = (int) maxDate.toEpochDay();
            int randomDay = minDay + random.nextInt(maxDay - minDay +1);
             LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
            System.out.println("Random Date: " + randomDate);
        }
    public static void question05(){
        Random random = new Random();
        LocalDate minDate = LocalDate.now().minusYears(1);
        LocalDate maxDate = LocalDate.now();
        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay +1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("Random Date: " + randomDate);
    }

    public static void question06(){
        Random random = new Random();
        LocalDate maxDate = LocalDate.now();
        int minDay = 0;
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay );
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("Random Date: " + randomDate);
    }

    public static void question07(){
        Random random = new Random();
        int min = 100;
        int max = 999;
        int randomNumber = min + random.nextInt(max-min +1);
        System.out.println("Random Number = " + randomNumber);
    }
}
