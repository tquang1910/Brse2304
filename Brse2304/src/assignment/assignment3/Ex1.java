package assignment.assignment3;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
//        ques1();
        ques2();
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
    public static void ques2(){
        Random random = new Random();
        int x = random.nextInt(100);
        String soDaConvert = String.format("%05d", x);
        System.out.println("Số ngẫu nhiên: " + soDaConvert);

    }
}
