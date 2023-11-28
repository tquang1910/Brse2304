package com.vti.lesson10;
import java.sql.*;
import java.util.Scanner;

public class TestMySql {
    public static void main(String[] args) throws SQLException {
        String fbUrl = "jdbc:mysql://localhost:3306/testing_system";
        String user = "root";
        String password = "root";


        Connection myConn = DriverManager.getConnection(fbUrl, user, password);

        if(myConn != null) {
            System.out.println("Kết nối thành công");

            // Sử dụng đối tượng Statement
            Statement myStmt = myConn.createStatement();
            ResultSet result = myStmt.executeQuery("SELECT * FROM account WHERE accountid = 1");
            while (result.next()) {
                System.out.println(result.getString("email"));
                System.out.println(result.getString("username"));

                System.out.println(result.getString(2));
            }

//            String sqlInsert = "INSERT INTO `account` (Email, Username, Fullname, DepartmentID, PositionID, CreatedDate)"
//                    +
//            "VALUES ('quang@vtiacademy.com', 'quang1', 'Nguyen Van Quang', 2, 3, sysdate())";
//
//            int newRecord = myStmt.executeUpdate(sqlInsert);
//            System.out.println("Giá trị của new record: " + newRecord);

            // Sử dụng đối tượng PrepareStatement
         /*   String sql = "INSERT INTO `account` (Email, Username, Fullname, DepartmentID, PositionID, CreatedDate)" +
                    "VALUES (?, ? , ? , ? , ?, sysdate())";
            PreparedStatement preparedStatement = myConn.prepareStatement(sql);
            preparedStatement.setString(1,"dungna@gmail.com");
            preparedStatement.setString(2, "dungna4");
            preparedStatement.setString(3,"Nguyễn Minh Dũng");
            preparedStatement.setInt(4,3);
            preparedStatement.setInt(5,2);

            int newRecordByPrepare = preparedStatement.executeUpdate();
            System.out.println("newRecordByPrepare = " + newRecordByPrepare);*/
        }
        else{
            System.out.println("Kết nối thất bại");
        }

        System.out.println("Kết thúc chương trình");


    }
}
