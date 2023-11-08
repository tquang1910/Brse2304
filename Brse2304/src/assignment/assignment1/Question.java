package assignment.assignment1;

import java.time.LocalDate;

public class Question {
    int id;
    String content;
    CategoryQuestion category;
    TypeQuestion type;
    Account creator;
    LocalDate createddate;
    Exam[] exams;
}
