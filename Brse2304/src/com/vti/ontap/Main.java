package com.vti.ontap;

public class Main {
    public static void main(String[] args) {
        // Chuyển đổi kiểu dữ liệu từ long -> int
//        long x = 2133333312;
//        int i = (int) x;

        Integer y =  Integer.valueOf(20);
        int x = y.intValue();
        System.out.println("x = " + x);
    }
}
