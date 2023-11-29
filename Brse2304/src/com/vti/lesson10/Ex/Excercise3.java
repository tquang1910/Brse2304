package com.vti.lesson10.Ex;

import java.sql.*;

public class Excercise3 {
    public static void main(String[] args) throws SQLException {
        String fbUrl = "jdbc:mysql://localhost:3306/testing_system";
        String user = "root";
        String password = "root";

        Connection myConn = DriverManager.getConnection(fbUrl, user, password);
        if (myConn != null) {
            System.out.println("Kết nối thành công");
            String sqlUpdate = "UPDATE `account` SET Fullname = ?  ," +
                    "Email = ?  WHERE AccountID = ?;";
            PreparedStatement preparedStatement = myConn.prepareStatement(sqlUpdate);
            preparedStatement.setString(1,"Đào Văn Lộc");
            preparedStatement.setString(2,"baloc@gmail.com");
            preparedStatement.setInt(3,5);
            //ExcuteUpdate: Trả về số lượng bản ghi đã được thay đổi
            int newRecordByPrepare =  preparedStatement.executeUpdate();
            if (newRecordByPrepare > 0) {
                ResultSet result = preparedStatement.executeQuery("SELECT * FROM `account` WHERE accountid = 5");
                while (result.next()) {
                    System.out.println(result.getString("email"));
                    System.out.println(result.getString("username"));
                    System.out.println(result.getString("fullname"));
                    System.out.println(result.getInt("departmentid"));
                    System.out.println(result.getInt("positionid"));
                }
            } else
                System.out.println("Không có bản ghi nào được cập nhật");
        } else
            System.out.println("Kết nối thất bại");
        System.out.println("Kết thúc chương trình");
    }


    }

