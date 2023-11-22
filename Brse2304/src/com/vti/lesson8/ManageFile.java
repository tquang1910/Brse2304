package com.vti.lesson8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ManageFile {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\File\\LTQ.txt");
        if (file.exists()){
            System.out.println("File tồn tại");
        } else
            System.out.println("Không tồn tại file");
        //
        FileInputStream fileInputStream = new FileInputStream("E:\\File\\LTQ.txt");
        byte[] arrByte = new byte[1024];
        int length = fileInputStream.read(arrByte);
        System.out.println("Độ dài là: " +length);
        while (length > -1){
            String content = new String(arrByte, 0, length);
            System.out.println(content);
            length = fileInputStream.read(arrByte);
            System.out.println("length_1: " + length);
        }
fileInputStream.close();
        // Cách 2: nhược điểm là không đọc được kí tự enter
//        Scanner myReader = new Scanner(file);
//        while (myReader.hasNextLine()) {
//            String data = myReader.nextLine();
//            System.out.println(data);
//        }
//        myReader.close();
//        fileInputStream.close();


/*
        File file1 = new File("E:\\File\\Test.txt");
        if (file1.exists())
            System.out.println("File Test tồn tại");
         else {
            System.out.println("Không tồn tại file Test");
            System.out.println("Bắt đầu tạo file");
            if (file1.createNewFile()){
                System.out.println("Tạo file thành công");
            } else
                System.out.println("Tạo file thất bại");
        }
*/
        // Viết 1 nội dung vào file đã tồn tại
        String content = "Youtube.csdsom";
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\File\\LTQ.txt", false);
        fileOutputStream.write(content.getBytes());
        fileOutputStream.close();




    }
}
