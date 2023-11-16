package assignment.assignment3;



public class Ex3 {
    public static void main(String[] args) {
        ques1();
    }
    public static void ques1() {
        Integer salary = 5000;
        float fSalary = salary.floatValue();
        System.out.printf("Lương của bạn là  %.2f " , fSalary);
    }

    public static void ques2() {
        String s = "1234567";
        int i = Integer.parseInt(s);
        System.out.println("s = " + s);
    }

    public static void ques3() {
        Integer n = Integer.valueOf("1234567");
        int b = n.intValue();
        System.out.println("b = " + b);
    }
}
