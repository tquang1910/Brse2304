package assignment.assignment5.entity;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(double width) {
        super(width, width);
    }

    @Override
    public double tinhChuVi() {
        System.out.println("Tính chu vi theo hình vuông");
        return super.tinhChuVi();
    }

    @Override
    public double tinhDienTich() {
        System.out.println("Tính diện tích theo hình vuông");
        return super.tinhDienTich();
    }
}
