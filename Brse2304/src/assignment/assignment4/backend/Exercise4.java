package assignment.assignment4.backend;

import assignment.assignment4.entity.Student;

public  class Exercise4 {
    public static void ques01() {
        Student student = new Student();
        student.setScore(5.0);
        student.showInfo();
        student.plusScore(5.0);
        student.showInfo();
    }
}
