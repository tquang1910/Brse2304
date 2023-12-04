package assignment.assignment4.backend;

import assignment.assignment4.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> canBoList = new ArrayList<>();

    public void themCanBo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mời bạn nhập chọn loại cán bộ.");
        System.out.println("1. Thêm công nhân" + "\n" + "2. Thêm kỹ sư "
                + "\n" + "3. Thêm nhân viên ");
        System.out.println("Chọn chức năng");
        int menu = scan.nextInt();
        if (menu == 1) {
            System.out.println("Mời bạn nhập vào thông tin công nhân");
            System.out.println("Nhập vào họ tên.");
            scan.nextLine();
            String hoTen = scan.nextLine();

            System.out.println("Nhập vào tuổi");
            int tuoi = scan.nextInt();

            System.out.println("Nhập vào giới tính");
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            System.out.println("3. Khác");
            GioiTinh gioiTinh = GioiTinh.values()[scan.nextInt() - 1];

            scan.nextLine();
            System.out.println("Nhập vào địa chỉ");
            String diaChi = scan.nextLine();

            System.out.println("Nhập vào bậc");
            int bac = scan.nextInt();

            CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
            canBoList.add(congNhan);

        } else if (menu == 2) {
            System.out.println("Mời bạn nhập vào thông tin kỹ sư");
            System.out.println("Nhập vào họ tên.");
            scan.nextLine();
            String hoTen = scan.nextLine();

            System.out.println("Nhập vào tuổi");
            int tuoi = scan.nextInt();

            System.out.println("Nhập vào giới tính");
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            System.out.println("3. Khác");
            GioiTinh gioiTinh = GioiTinh.values()[scan.nextInt() - 1];

            scan.nextLine();
            System.out.println("Nhập vào địa chỉ");
            String diaChi = scan.nextLine();

            System.out.println("Nhập vào ngành đào tạo");
            String nganhDaoTao = scan.nextLine();

            KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
            canBoList.add(kySu);
        } else if (menu == 3) {
            System.out.println("Mời bạn nhập vào thông tin nhân viên");
            System.out.println("Nhập vào họ tên.");
            scan.nextLine();
            String hoTen = scan.nextLine();

            System.out.println("Nhập vào tuổi");
            int tuoi = scan.nextInt();

            System.out.println("Nhập vào giới tính");
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            System.out.println("3. Khác");
            GioiTinh gioiTinh = GioiTinh.values()[scan.nextInt() - 1];

            scan.nextLine();
            System.out.println("Nhập vào địa chỉ");
            String diaChi = scan.nextLine();

            System.out.println("Nhập vào công việc");
            String congViec = scan.nextLine();

            NhanVien nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
            canBoList.add(nhanVien);
        }
    }


    public void timKiemCanBoTheoHoTen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ tên cần tìm");
        String hoTen = scan.nextLine();
        for (CanBo canBo : canBoList) {
            if (canBo.getHoTen().equals(hoTen)) {
                System.out.println("- Cán bộ: " + canBo);
            }
        }
    }

    public void hienThiDSCB() {
        for (CanBo canBo : canBoList) {
            System.out.println("- Cán bộ: " + canBo);
        }
    }

        public void xoaCanBoTheoTen () {
            Scanner scan = new Scanner(System.in);
            System.out.println("Mời bạn nhập vào họ tên cần xóa");
            String hoTen = scan.nextLine();

            //lambda java 8
            canBoList.removeIf(canBo -> canBo.getHoTen().equals(hoTen));

        }


    }
