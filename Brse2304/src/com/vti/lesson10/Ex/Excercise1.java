package com.vti.lesson10.Ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Excercise1 {

        public static void main(String[] args) throws SQLException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 10 values:");

            String fbUrl = "jdbc:mysql://localhost:3306/testing_system";
            String user = "root";
            String password = "root";

            Connection myConn = DriverManager.getConnection(fbUrl, user, password);
            if(myConn != null) {
                System.out.println("Kết nối thành công");

                // 1.

                    String sql = "INSERT INTO `account` (Email, Username, Fullname, DepartmentID, PositionID, CreatedDate)" +
                        "VALUES (?, ? , ? , ? , ?, sysdate())";
                    PreparedStatement preparedStatement = myConn.prepareStatement(sql);
                System.out.println("Nhập vào email");
                    preparedStatement.setString(1, scanner.nextLine());
                System.out.println("Nhập vào username");
                    preparedStatement.setString(2, scanner.nextLine());
                System.out.println("Nhập vào họ và tên");
                    preparedStatement.setString(3, scanner.nextLine());
                System.out.println("Nhập vào department id ");
                    preparedStatement.setInt(4,scanner.nextInt());
                System.out.println("Nhập vào Position id");
                    preparedStatement.setInt(5,scanner.nextInt());

                int newRecordByPrepare =  preparedStatement.executeUpdate();
                System.out.println("newRecordByPrepare = " + newRecordByPrepare);
                }
             else{
                System.out.println("Kết nối thất bại");
            }

            System.out.println("Kết thúc chương trình");


        }
        }




