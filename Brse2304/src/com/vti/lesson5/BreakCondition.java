package com.vti.lesson5;

public class BreakCondition {
    public static void main(String[] args) {
        // Câu lệnh break
        // Tác dụng: Để kết thúc vòng lặp hoặc để kết thúc câu điều kiện trong switch case
        // Break thường được dùng để check điều kiện khi nào dùng vòng lặp.
        // Đối với vòng lặp lồng nhau, lệnh break chỉ

        for (int i = 0; i <10 ; i++){
            System.out.println(i);
            break;
        }

        for (int i = 0; i <10 ; i++){
            System.out.println(i);
            if ( i == 6){
                break;
            }
        }

    }
}
