package assignment.assignment2;

import java.time.LocalDate;

public class Account {
    public String email;
   public int id;
    public String userName;
    public String fullName;
    public Department department;
    public  Position position;
    public LocalDate createDate;
    public Group[] groups;

    public Account(String email, int id, String userName, String fullName, Department department, Position position, LocalDate createDate) {
        this.email = email;
        this.id = id;
        this.userName = userName;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
        this.groups = groups;
    }


    public Account() {

    }
}
