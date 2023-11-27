package com.vti.lesson9;

public class TestOverride {
    public static void main(String[] args) {
        //Kiểm tra tính kế thừa
        Employee emp = new Employee();
        emp.setName("Quang");
        emp.setAge(23);
        System.out.println(emp.getName() + " " + emp.getAge());

        Student student = new Student();
        student.setName("Trí");
        student.setAge(25);
        System.out.println(student.getName() + " " + student.getAge());

        Person p1 =new Person();
        p1.setAge(18);
        p1.setName("Hùng");
    /*
        Khái niệm:
        Kế thừa là khả năng thừa hưởng lại những biến và hàm của 1 class khác.
        class kế thừa gọi là subclass (class con) và class được kế thừa gọi là superclass (class cha)
        superclass có thể có nhiều subclass nhưng subclass chỉ có duy nhất 1 superclass.
         */

        int luongP1 = p1.salary(400000);
        System.out.println(p1.salary(luongP1));
        int luongEmp = emp.salary(400000);
        System.out.println(luongEmp);
        int luongStudent = student.salary(400000);
        System.out.println(luongStudent);

        // Test constructor không sử dụng tham số
        Employee emp2 = new Employee("Samsung");
        System.out.println(emp2.getName() + " " + emp2.getAge() + " "+ emp2.getCongTy());

        Employee emp3 = new Employee("Quang",31,"FPT");
        System.out.println(emp3.getName() + " " + emp3.getAge() + " "+ emp3.getCongTy());



    }
}
