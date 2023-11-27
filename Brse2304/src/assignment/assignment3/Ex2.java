package assignment.assignment3;

import java.time.LocalDate;

public class Ex2 {
    public static void main(String[] args) {
        ques1();
    }
public static void  ques1(){
    Account[] accArray = new Account[5];
    for (int i = 0; i < accArray.length; i++){
        Account acc = new Account();
        acc.email = "Email " + (i+1);
        acc.username = "User name " + (i+1);
        acc.fullname = "Full name " + (i+1);
        acc.createddate = LocalDate.now();
        System.out.println("Email: " + acc.email +"\n" + "User name : " + acc.username + "\n" +
                acc.fullname + "\n"  + acc.createddate);
    }
}
}
