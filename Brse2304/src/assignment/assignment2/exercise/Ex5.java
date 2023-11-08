package assignment.assignment2.exercise;



import assignment.assignment1.Department;
import assignment.assignment2.Account;
import assignment.assignment2.Position;
import assignment.assignment2.PositionName;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex5 {
    public static void ques1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên thứ nhất: ");
        int sc1 = scanner.nextInt();
        System.out.println("Nhập vào số nguyên thứ hai: ");
        int sc2 = scanner.nextInt();
        System.out.println("Nhập vào số nguyên thứ ba: ");
        int sc3 = scanner.nextInt();
    }
    public static void ques2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thực thứ nhất: ");
        float sc1 = scanner.nextFloat();
        System.out.println("Nhập vào số thực thứ hai: ");
        float sc2 = scanner.nextFloat();
    }
    public static void ques3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ và tên ");
        String fullName = scanner.nextLine();
        System.out.println("Họ và tên là " + fullName);
    }

    public static void ques4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào ngày sinh của bạn");
        int day = scanner.nextInt();
        System.out.println("Nhập vào tháng sinh của bạn");
        int month = scanner.nextInt();;
        System.out.println("Nhập vào năm sinh của bạn");
        int year = scanner.nextInt();
        LocalDate birthDay = LocalDate.of(year, month, day);
        System.out.println("Sinh nhật của bạn là: " +birthDay);
    }
    public static void ques5(){
    Scanner scanner = new Scanner(System.in);
    Account account = new Account();
        System.out.println("Nhập vào id của account");
        account.id = scanner.nextInt();

        System.out.println("Nhập vào username của account");
        account.userName = scanner.next();


        System.out.println("Nhập vào email của account");
       account.email = scanner.next();

        scanner.nextLine();
        System.out.println("Nhập vào họ và tên của account");
        account.fullName = scanner.nextLine();

        System.out.println("Nhập vào vị trí của account ");
        System.out.println("1. Dev");
        System.out.println("2. Test");
        System.out.println("3. Scrum Master");
        System.out.println("4. PM");

        int index = scanner.nextInt();
        Position position = new Position();
        position.name = PositionName.values()[index - 1];
        account.position =position;
        System.out.println("Id = " + account.id);
        System.out.println("Username = " + account.userName);
        System.out.println("Email = " + account.email);
        System.out.println("FullName = " + account.fullName);
        System.out.println("Position Name = " + account.position.name);

    }

    public static void ques6(){
        Scanner scanner = new Scanner(System.in);
        Department department = new Department();
        System.out.println("Mời nhập vào id của phòng ban");
         department.id = scanner.nextInt();
         scanner.nextLine();
        System.out.println("Mời nhập vào tên phòng ban");
        department.name = scanner.nextLine();
        System.out.println("Thông tin phòng ban của bạn là: " + "\n" + "Id: "  + department.id
                + "\n" + "Name: " + department.name);
    }

    public static void ques7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Hãy nhập vào số chẵn");
        int i = scanner.nextInt();
        if ((i % 2) == 0){
            System.out.println("Bạn vừa nhập vào " + i);
        } else {
            System.out.println("Bạn đã nhập sai!");
        }

    }

    public static void ques8(){
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        Department department = new Department();
        System.out.println("Mời bạn nhập vào chức năng muốn sử dụng");
        System.out.println("1. Account" + "\n" + "2. Department");
        int i = scanner.nextInt();
        if (i == 1) {
            ques5();
        } else {
            ques6();
        }

    }

    // Thiếu từ 9 - 11
}
