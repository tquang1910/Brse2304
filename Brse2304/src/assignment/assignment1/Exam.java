package assignment.assignment1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exam {
    int id;
    String code;
    String title;
    CategoryQuestion category;
    int duration;
    Account creator;
    LocalDate createddate;
    Question[] questions;
}
