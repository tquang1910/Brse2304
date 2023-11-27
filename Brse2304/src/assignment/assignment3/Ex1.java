package assignment.assignment3;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
//        ques1();
//        ques2();
//        ques3();
        ques4();
    }
    public static void ques1(){
        float acc1Salary = 5240.5f;
        float acc2Salary = 10970.055f;
        int luongAcc1 = (int) acc1Salary;
        int luongAcc2 = (int) acc2Salary;
        System.out.printf( "lương acc1 là %d%n", luongAcc1);
        System.out.printf(" lương acc2 là %d%n" ,luongAcc2 );

    }

    // In ra 1 số bất kỳ, thêm các chữ số 0 sao cho số chữ số in ra đều có 5 chữ số
    public static String ques2(){
        Random random = new Random();
        int x = random.nextInt(10000);
        String soDaConvert = String.format("%05d", x);
        System.out.println("Số ngẫu nhiên: " + soDaConvert);
        return soDaConvert;
    }

    public static void ques3(){
    String s = ques2();
        System.out.println(" 2 số cuối ngẫu nhiên của 5 chữ số là: " + s.substring(3));
    }

    public static void ques4(){
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số nguyên a");
       a = scan.nextInt();
        System.out.println("Nhập số nguyên b");
        do {
            b = scan.nextInt();
            if (b == 0 )
                System.out.println("Bạn không thể nhập số 0. Vui lòng nhập lại");
        } while ( b == 0 );
        scan.close();
        System.out.println(" Thương của a/b là: " + ((float) a/b));
    }
}
