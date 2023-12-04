package assignment.assignment5.bakcend;

import assignment.assignment5.entity.VietnamesePhone;

import java.util.Scanner;

public class Excercise6 {
    public static void quesstion01(){
        Scanner scanner= new Scanner(System.in);
        VietnamesePhone vietnamesePhone = new VietnamesePhone();
        while (true){
        System.out.println("Mời bạn chọn chức năng");
        System.out.println("1. Thêm liên hệ");
        System.out.println("2. Xóa liên hệ");
        System.out.println("3. Cập nhật liên hệ");
        System.out.println("4. Tìm kiếm liên hệ");
        System.out.println("5. Thoát khỏi chương trình");
        System.out.println("Chọn chức năng");

        int menu = scanner.nextInt();

            if (menu == 1 ) {
                System.out.println("Mời bạn nhập vào thông tin liên hệ");
                System.out.println("Nhập vào name");
               String name = scanner.next();
                System.out.println("Nhập vào phone");
                String phone = scanner.next();
                vietnamesePhone.insertContact(name, phone);
            } else if (menu == 2) {
                System.out.println("Mời bạn nhập vào tên cần xóa");
                System.out.println("Nhập vào name");
                String name = scanner.next();
               vietnamesePhone.removeContact(name);
            } else if ( menu == 3 ) {
                System.out.println("Mời bạn nhập vào thông tin liên hệ");
                System.out.println("Nhập vào name");
                String name = scanner.next();
                System.out.println("Nhập vào phone");
                String newPhone = scanner.next();
                vietnamesePhone.updateContact(name, newPhone);
            } else if ( menu == 4 ) {
                System.out.println("Mời bạn nhập vào thông tin liên hệ");
                System.out.println("Nhập vào name");
                String name = scanner.next();
                vietnamesePhone.searchContact(name);
            } else if (menu == 5 ) {
                System.out.println("Bạn đã thoát khỏi chương trình");
                scanner.close();
               return;
            } else {
                System.out.println("Vui lòng nhập lại");
            }
        }

    }
}
