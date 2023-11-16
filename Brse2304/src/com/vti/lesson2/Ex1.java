package com.vti.lesson2;

public class Ex1 {
    public static float tinhSHinhTron(float r){
        float dienTich = r*r*3.14F;
        return dienTich;
    }
    public static int tinhDientich(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {

        float s = tinhDienTichHinhTron(5.5F);
        System.out.println("Dien tich hinh tron la: " + s);

        inRaHoVaTen("Nguyễn Anh Dũng");
        System.out.println("Tuổi hiện tại của bạn là: " + tinhSoTuoiHienTai(1993));

//        inRaTenVaTuoi(1993);
    }

    public static float tinhDienTichHinhTron(float r) {
        float dienTich = r*r*3.14F;
        return dienTich;
    }

    public static void inRaHoVaTen(String fullName) {
        System.out.println("Hello " + fullName);
    }

    public static void customerName() {
        System.out.println("Xin chào Nguyễn Anh Dũng");
    }

    public static int tinhSoTuoiHienTai(int namSinh) {
        return 2023 - namSinh;
    }

    public static void inRaTenVaTuoi(int namSinh) {
        customerName();
        System.out.println("Tuổi của bạn là: " + tinhSoTuoiHienTai(namSinh));
    }

}
