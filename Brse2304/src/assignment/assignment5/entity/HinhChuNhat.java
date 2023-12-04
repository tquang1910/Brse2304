package assignment.assignment5.entity;

public class HinhChuNhat {
    protected double width;
    protected double height;

    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double tinhChuVi(){
    return (width + height)*2;
    }

    public double tinhDienTich(){
        return width * height;
    }
}
