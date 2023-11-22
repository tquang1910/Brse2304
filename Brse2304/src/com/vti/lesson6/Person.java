package com.vti.lesson6;

public class Person {
    String name;
    int age;
    String address;

    public Person() {

    }

    // Hàm instance (Hàm đối tượng) không có từ khóa static
    // Muốn khởi tạo đối tượng thì dùng từ khóa new
    public void walk(String name) {
        System.out.println(name + " đi bộ. ");
    }

    public void setName(String ten) {
        this.name = ten;
    }

    public String getName() {
        return name;
    }


    // constructor và constructor mặc định
    // tương tự như hàm nhưng được sử dụng để khởi tạo giá trị cho các instance


    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        new Person(); // Đối tượng 1
        Person p1 = new Person(); // Đối tượng 2
        Person p2 = new Person(); // Đối tượng 3
        //p1 và p2 là 2 đối tượng hoàn toàn độc lập
        p1.walk("Quang");
        p2.walk("Hiền");

        // p1 và p2 có thể gọi được các hàm instance
        Person p3 = new Person();
        p3.setName("Len");
        System.out.println(p3.name);

        // Gán giá trị cho biến instance bằng cách sử dụng constructor
        Person p4 = new Person();
        p4.setName("Long");
        p4.setAddress("Việt Nam");
        p4.setAge(40);

        System.out.println(" Tên: " + p4.getName() + "\n " + "Tuổi: " + p4.getAge() +
                " \n " + "Địa chỉ: " + p4.getAddress());

        Person p5 = new Person("Quang", 30, "Hàn Quốc");
        System.out.println(p5.getAddress());
        System.out.println(" Tên: " + p5.getName() + "\n " + "Tuổi: " + p5.getAge() +
                " \n " + "Địa chỉ: " + p5.getAddress());
    }
}
