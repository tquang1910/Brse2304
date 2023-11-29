package com.vti.lesson10.Ex;

import java.sql.*;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws SQLException {
        String fbUrl = "jdbc:mysql://localhost:3306/testing_system";
        String user = "root";
        String password = "root";

        Connection myConn = DriverManager.getConnection(fbUrl, user, password);
        Scanner scanner = new Scanner(System.in);

        if (myConn != null) {
            System.out.println("Kết nối thành công");
            System.out.println("Nhập 10 giá trị");
            String sql = "INSERT INTO `account` (Email, Username, Fullname, DepartmentID, PositionID, CreatedDate)" +
                    "VALUES (?, ? , ? , ? , ?, sysdate())";
            PreparedStatement preparedStatement = myConn.prepareStatement(sql);
            for (int i = 0; i < 10; i++) {
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
                scanner.nextLine();
                int newRecordByPrepare =  preparedStatement.executeUpdate();
                System.out.println("newRecordByPrepare = " + newRecordByPrepare);
            }

            ResultSet result  = preparedStatement.executeQuery("SELECT * FROM account WHERE 5 < accountid < 20");
           while (result.next()) {
               System.out.println(result.getString("email"));
               System.out.println(result.getString("username"));
               System.out.println(result.getString("fullname"));
               System.out.println(result.getInt("departmentid"));
               System.out.println(result.getInt("positionid"));
           }

        }

        else {
            System.out.println("Kết nối thất bại");
        }scanner.close();
        System.out.println("Kết thúc chương trình");
    }

}