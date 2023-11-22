package com.vti.lesson8;


import java.io.*;

public class Exercise {
    public static void main(String[] args) throws IOException {
        // Homework:
        // Dùng vòng lặp for tạo 10 file khác nhau và viết nội dung vào 10 file đó, in ra nội dung của từng file

        int i;
        byte[] arrByte = new byte[1024];
        for (i = 1; i < 11; i++) {
            String fileName = "Test" + i + ".txt";
            File file = new File("E:\\File\\" + fileName);
            if (file.exists())
                System.out.println("File Test tồn tại");
            else {
                System.out.println("Bắt đầu tạo file");
                if (file.createNewFile()) {
                    System.out.println("Tạo file thành công");
                    String content = "Test file thứ " + i;
                    FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                    fileOutputStream.write(content.getBytes());
                    FileInputStream fileInputStream = new FileInputStream(file);

                    int length = fileInputStream.read(arrByte);
                    if (length > -1) {
                        String content1 = new String(arrByte, 0, length);
                        length = fileInputStream.read(arrByte);
                        System.out.println(content);
                        System.out.println("length_1: " + length);

                    }
                    fileInputStream.close();
                    fileOutputStream.close();
                } else
                    System.out.println("Tạo file thất bại");
            }
        }
    }
}
