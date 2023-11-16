package com.vti.lesson5;

public class TangGiamGiaTri {
    public static void main(String[] args) {
        // i++ <=> i = i +1
        // ++i <=> i = i + 1
        // vậy nó khác nhau như thế nào??
        int i = 0;
        i++;
        System.out.println("i++ = " + i);

        i = 0;
        ++i;
        System.out.println("++i = " + i);

        i = 0;
        printValueI(++i);

        System.out.println("==========================================");
        i = 0;
        printValueI(i++);

        // Khái niệm
        // i++ gán trước rồi cộng sau.
        // ++i cộng trước gán sau

    }

    public static void printValueI(int i ){
        System.out.println("Giá trị của i là " + i);
    }
}
