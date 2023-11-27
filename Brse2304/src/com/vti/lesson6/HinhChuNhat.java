package com.vti.lesson6;

public class HinhChuNhat {
    // các biến chứa từ khóa static được gọi là biến class/biến static
    static int chieuDai = 5;

    // Hàm static hay hàm class (chứa từ khóa static)
    public static int dienTich(int a, int b){
        return (a*b);
    }
    public static float dienTich(float cd, float cr, float h){
        return cd*cr*h;
    }

    public static int getChieuDai() {
        return chieuDai;
    }

    public static void setChieuDai(int chieuDai) {
        HinhChuNhat.chieuDai = chieuDai;
    }

    public int getDem() {
        return dem;
    }

    public void setDem(int dem) {
        this.dem = dem;
    }

    // Khai báo biến instance và hàm instance
    int dem = 7;
    public int chuVi(int a, int b){
        return ((a+ b) *2);
    }

    public static void main(String[] args) {
        System.out.println(HinhChuNhat.chieuDai);
        System.out.println(HinhChuNhat.dienTich(5,8));

        HinhChuNhat hcn = new HinhChuNhat();
       int chuVi =  hcn.chuVi(6,7);
        System.out.println(chuVi);


        HinhChuNhat hcn2 = new HinhChuNhat();
        hcn2.setDem(89);
        System.out.println(hcn2.dem);

    }
}
