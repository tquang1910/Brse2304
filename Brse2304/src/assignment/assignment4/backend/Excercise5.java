package assignment.assignment4.backend;

import java.util.Scanner;

public class Excercise5 {
    public static void question01_02() {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm cán bộ theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo tên");
            System.out.println("5. Thoát chương trình ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                qlcb.themCanBo();
            } else if (menu == 2)
                qlcb.timKiemCanBoTheoHoTen();
            else if (menu == 3) {
                qlcb.hienThiDSCB();
            } else if (menu == 4) {
                qlcb.xoaCanBoTheoTen();
            } else if (menu == 5) {
                scanner.close();
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng");
            }


        }


    }
}