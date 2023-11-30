package com.vti.lesson11;

import java.sql.*;
import java.util.ArrayList;

public class MainAccount {
    public static void main(String[] args) throws SQLException {
        String fbUrl = "jdbc:mysql://localhost:3306/testing_system";
        String user = "root";
        String password = "root";

        Connection myConn = DriverManager.getConnection(fbUrl, user, password);

        if (myConn != null) {
            Statement myStmt = myConn.createStatement();
            ResultSet result = myStmt.executeQuery("SELECT * FROM account");

            ArrayList<Account> listAccount = new ArrayList<>();
            while (result.next()) {
                Account accObject = new Account();

                accObject.setAccountId(result.getInt("accountId"));
                accObject.setEmail(result.getString("email"));
                accObject.setUserName(result.getString("userName"));
                accObject.setFullName(result.getString("fullName"));
                accObject.setDepartmentId(result.getInt("departmentId"));
                accObject.setPositionId(result.getInt("positionId"));
        
       listAccount.add(accObject);
            }
            myStmt.close();
            result.close();
            System.out.println("In ra danh sach account trong database");
            System.out.println("Tổng số account là: " + listAccount.size());
            for (Account item : listAccount){
                System.out.println(item.getAccountId() + " :" + item.getEmail() + " - " + item.getUserName()
                + " - " + item.getFullName() + " - " + item.getDepartmentId() + " - " + item.getPositionId() );
            }
        } else
            System.out.println(" Kết nối thất bại");
        myConn.close();
        System.out.println("Kết thúc chương trình");
    }
}
