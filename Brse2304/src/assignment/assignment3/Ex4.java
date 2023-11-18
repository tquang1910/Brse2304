package assignment.assignment3;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
//        ques1();
//        ques3();
//        ques5();
//    ques6();
        ques8();
        ques9();
    }

    // Cách nhiều space đếm được nhưng cách 1 space không đếm được
    public static void ques1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 xâu kí tự");
        System.out.println("Nhập vào 1 xâu kí tự");
        String s = scanner.nextLine();
        String[] words = s.split("\\s+");
        System.out.println("Số từ là " + words.length);

    }

    public static void ques2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 xâu kí tự");

        System.out.println("Nhập vào 1 xâu kí tự thứ 1: ");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào 1 xâu kí tự thứ 1: ");
        String s2 = scanner.nextLine();
        System.out.println("Nối 2 kí tự lại  " + (s1 + s2) );
    }

    public static void ques3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên");
        String name = scanner.next();
        // C1: quang => q + uang => Q + uang (substring)
        String name1 = name.substring(0,1).toUpperCase() + name.substring(1);
        System.out.println(" Question 3 - cách 1 " + name1);
        // C2: %C
        System.out.printf("Question 3 - cách 2: %C%s%n", name1.charAt(0), name.substring(1));

    }
    public static void ques4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên");
        String name = scanner.next();
     // Chưa xong

        }
     public static void ques5() {
             Scanner scanner = new Scanner(System.in);
             System.out.println("Mời bạn nhập vào họ và tên");
             System.out.println("Nhập vào họ: ");
             String s1 = scanner.nextLine();
             System.out.println("Nhập vào tên: ");
             String s2 = scanner.nextLine();
             System.out.println("Họ và tên là  " + (s1 + s2) );
     }
    public static void ques6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ và tên");
        System.out.println("Nhập vào họ và tên: ");
        String fullName = scanner.nextLine();
        int indexOfFirstSpace = fullName.indexOf(' ');
        int indexOfLastSpace = fullName.lastIndexOf(' ');
        String firstName = fullName.substring(0, indexOfFirstSpace);
        String midName = fullName.substring(indexOfFirstSpace + 1, indexOfLastSpace);
        String lastName = fullName.substring(indexOfLastSpace + 1);
        System.out.println("Họ là: " + firstName);
        System.out.println("Tên đệm là: " + midName);
        System.out.println("Tên là: " + lastName);
    }

    public static void ques8(){
        String[] groups = {"Java", "Java core", "Java advanced", "Database", "Front end" };
        for (String group : groups) {
            if(group.contains("Java"))
                System.out.println("-Group có chứa chữ Java: " + group);

        }
    }

    public static void ques9(){
        String[] groups = {"Java", "Java core", "Java advanced", "Database", "Front end" };
        for (String group : groups) {
            if(group.equals("Java"))
                System.out.println("-Group Java: " + group);

        }
    }



}
