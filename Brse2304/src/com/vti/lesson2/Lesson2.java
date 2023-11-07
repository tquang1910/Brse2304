package com.vti.lesson2;

public class Lesson2 {

    public static void main(String[] args) {
        // ôn lại kiến thức về toán tử trong java
        // 1. Toán tử quan hệ
        int x = 2;
        int y = 2;
        // 1.1. Toán tử !=
        System.out.println(x != y );

        //1.2 Toán tử <=
        x = 4;
        y = 10;
        System.out.println(x <= y);

        //1.3. Chia lấy phần dư
    tong2So();
    int z = hieu2So(2, 4);
        System.out.println("z = " + z);

       int c =  tich2So(3,4);
        System.out.println("c = " + c);


        System.out.println("Diện tích hình tròn: " + Ex1.tinhSHinhTron(4.3F) );
    }



    public static void tong2So(){
        System.out.println("Tổng số 2 và 3 là: " + (2+3));
    }

    public static int hieu2So(int x, int y){
        int hieu = y - x;
        return hieu;
    }
    public static int tich2So(int a , int b){
        return a*b;
    }

    public static int tich2So(int c){
        return c * 6;
    }
}
