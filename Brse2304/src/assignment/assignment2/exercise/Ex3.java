package assignment.assignment2.exercise;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class Ex3 {

//Câu 1 được fix nhưng nhiều syntax mới nên cần ôn lại
    public static void question1() {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        // LocalDateTime -> Date
        Date out = Date.from(today.atZone(ZoneId.systemDefault()).toInstant());
        // date --> String
        Locale locale = new Locale("vi", "VN");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String dateString = dateFormat.format(out);
        System.out.println("Today is : " + dateString);
    }
    public static void question2(){
        LocalDateTime today = LocalDateTime.now();
        String pattern = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formated =formatter.format(today);
        System.out.println("today = " + formated);
    }

    public static void question3(){
        LocalDate today = LocalDate.now();
        String pattern = "yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formated =formatter.format(today);
        System.out.println("today = " + formated);
    }

    public static void question4(){
        LocalDate today = LocalDate.now();
        String pattern = "yyyy-MM";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formated =formatter.format(today);
        System.out.println("today = " + formated);
    }


    public static void question5() {
        LocalDate today = LocalDate.now();
        String pattern = "MM-dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formated = formatter.format(today);
        System.out.println("today5 = " + formated);
    }
}