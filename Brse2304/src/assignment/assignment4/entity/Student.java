package assignment.assignment4.entity;

import java.util.Scanner;

    // Câu a
public class Student {
    private int id;
    private String name;
    private String homeTown;
    private double score;

    // Câu b
    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin");

        System.out.println("Nhập vào tên");
        this.name = scan.next();

        scan.nextLine();
        System.out.println("Nhập vào hometown");
        this.homeTown = scan.nextLine();

        this.score = 0.0;
    }

    // Câu c
    public void setScore(double score) {
        this.score = score;
    }

    // Câu d
    public void plusScore(double score) {
        this.score += score;
    }

    // Câu e
    public void showInfo(){
        String rank;
        if (score < 4.0) {
            rank = "yếu";
        } else if (score < 6.0) {
            rank = "Trung bình";
        } else if (score < 8.0) {
            rank = "Khá";
        }else  {
            rank = "Giỏi";
        }
        System.out.printf("%s: %s%n", name , rank);

    }

}
