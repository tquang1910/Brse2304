package assignment.assignment1;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
       // question 2
        /*
        department
         */
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();


        department1.id = 1;
        department1.name = "Giám Đốc";
        department2.id = 2;
        department2.name = "Sale";
        department3.id = 3;
        department3.name = "Marketing";

        /*
            Position
         */

        Position position1= new Position();
        Position position2 = new Position();
        Position position3 = new Position();

        position1.id = 1;
        position1.name =PositionName.DEV;
        position2.id = 2;
        position2.name = PositionName.PM;
        position3.id = 3;
        position3.name = PositionName.TEST;

        /*
            Account
         */
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();

        account1.id = 1;
        account1.email = "quanghai@gmail.com";
        account1.username = "quanghai";
        account1.fullname = "Nguyen Quang Hai";
        account1.department = department2;
        account1.position = position1;
        account1.createddate = LocalDate.of (2021, 5, 20 );

        account2.id = 2;
        account2.email = "vanhau@gmail.com";
        account2.username = "Van Hau";
        account2.fullname = "Doan Van Hau";
        account2.department = department1;
        account2.position = position3;
        account2.createddate = LocalDate.now();

        account3.id = 3;
        account3.email = "quanganh@gmail.com";
        account3.username = "quanganh";
        account3.fullname = "Nguyen Quang Anh";
        account3.department = department3;
        account3.position = position2;
        account3.createddate = LocalDate.of (2017, 3, 16 );

        /*
            Group
         */

        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();

        group1.id = 1;
        group1.name = "Group 1";
        group1.creator = account3;
       group1.createddate = LocalDate.now();

        group2.id = 2;
        group2.name = "Group 2";
        group2.creator = account1;
        group2.createddate = LocalDate.of(2000, 10,20);

        group3.id = 3;
        group3.name = "Group 3";
        group3.creator = account2;
        group3.createddate = LocalDate.of(2010, 2,10);



        /*
        GroupAccount
         */





        /*
        TypeQuestion
         */
        TypeQuestion type1 = new TypeQuestion();
        TypeQuestion type2 = new TypeQuestion();
        TypeQuestion type3 = new TypeQuestion();

        type1.id = 1;
        type1.name = TypeName.ESSAY;
        type2.id = 2;
        type2.name = TypeName.MULTIPLE_CHOICE;
        type3.id = 3;
        type3.name = TypeName.ESSAY;

        /*
        CategoryQuestion
         */

        CategoryQuestion category1 = new CategoryQuestion();
        CategoryQuestion category2 = new CategoryQuestion();
        CategoryQuestion category3 = new CategoryQuestion();

        category1.id = 1;
        category1.name = "JAVA";

        category2.id = 2;
        category2.name = "SQL";

        category3.id = 3;
        category3.name = "POSTMAN";

        /*
        Question
         */
        Question question1 = new Question();
        Question question2 = new Question();
        Question question3 = new Question();

        question1.id = 1;
        question1.content = "Question about JAVA";
        question1.category = category2;
        question1.type = type1;
        question1.creator = account3;
        question1.createddate = LocalDate.now();

        question2.id = 2;
        question2.content = "Question about NET";
        question2.category = category1;
        question2.type = type1;
        question2.creator = account1;
        question2.createddate = LocalDate.of(2018, 6, 15);

        question3.id = 3;
        question3.content = "Question about POSTMAN";
        question3.category = category3;
        question3.type = type2;
        question3.creator = account2;
        question3.createddate = LocalDate.now();

        /*
        Answer
         */

        Answer answer1 = new Answer();
        Answer answer2 = new Answer();
        Answer answer3 = new Answer();

        answer1.id = 1;
        answer1.content = "Câu trả lời 1";
        answer1.question = question2;
        answer1.iscorrect = Boolean.FALSE;

        answer2.id = 2;
        answer2.content = "Câu trả lời 2";
        answer2.question = question3;
        answer2.iscorrect = Boolean.TRUE;

        answer3.id = 3;
        answer3.content = "Câu trả lời 3";
        answer3.question = question1;
        answer3.iscorrect = Boolean.TRUE;

        /*
        Exam
         */
        Exam exam1 = new Exam();
        Exam exam2 = new Exam();
        Exam exam3 = new Exam();

        exam1.id = 1;
        exam1.code = "MA SO 01";
        exam1.title = "DE 01";
        exam1.category = category2;
        exam1.duration = 90;
        exam1.creator = account3;
        exam1.createddate = LocalDate.now();

        exam2.id = 2;
        exam2.code = "MA SO 02";
        exam2.title = "DE 02";
        exam2.category = category3;
        exam2.duration = 90;
        exam2.creator = account1;
        exam2.createddate = LocalDate.now();

        exam1.id = 3;
        exam1.code = "MA SO 03";
        exam1.title = "DE 03";
        exam1.category = category1;
        exam1.duration = 60;
        exam1.creator = account2;
        exam1.createddate = LocalDate.now();



        // question 3:
        System.out.println("----Thông tin phòng ban 1.----" );
        System.out.println("ID : " +department2.id);
        System.out.println("NAME : " + department2.name);

        System.out.println("----Thông tin chức vụ.----" );
        System.out.println("ID: " + position1.id);
        System.out.println("NAME: " + position1.name);

        System.out.println("----Thông tin nhân viên.----" );
        System.out.println("ID: " + account3.id);
        System.out.println("EMAIL: " + account3.email);
        System.out.println("USERNAME: " + account3.username);
        System.out.println("FULLNAME: " + account3.fullname);
        System.out.println("DEPARTMENT: " + account3.department.name);
        System.out.println("POSITION: " + account3.position.name);
        System.out.println("CREATED DATE: " + account3.createddate);

        System.out.println("----Thông tin nhóm.----" );
        System.out.println("ID: " +group1.id);
        System.out.println("NAME: " +group1.name);
        System.out.println("CREATOR: " +account3.fullname);
        System.out.println("CREATED DATE: " +group1.createddate);

        System.out.println("----Thông tin loại câu hỏi----");
        System.out.println("ID: " + type2.id);
        System.out.println("NAME: " + type2.name);

        System.out.println("----Thông tin chủ đề câu hỏi----");
        System.out.println("ID: " +category3.id);
        System.out.println("NAME: " +category3.name);

        System.out.println("----Thông tin câu hỏi----");
        System.out.println("ID: " + question2.id);
        System.out.println("CONTENT: " + question2.content);
        System.out.println("CATEGORY NAME : " + question2.category.name );
        System.out.println("TYPE NAME : " + question2.type.name);
        System.out.println("CREATOR NAME : " + question2.creator.fullname);
        System.out.println("CREATED DATE : " + question2.createddate);

        System.out.println("----Thông tin câu trả lời----");
        System.out.println("ID: " + answer3.id);
        System.out.println("CONTENT: " + answer3.content);
        System.out.println("QUESTION CONTENT: " + answer3.question.content );
        System.out.println("IS CORRECT: " + answer3.iscorrect);

        System.out.println("----Thông tin thi----");
        System.out.println("ID: " + exam1.id);
        System.out.println("CODE: " + exam1.code);
        System.out.println("TITLE: " + exam1.title);
        System.out.println("CATEGORY NAME: " + exam1.category.name);
        System.out.println("DURATION: " + exam1.duration);
        System.out.println("CREATOR: " + exam1.creator.fullname );
        System.out.println("CREATED DATE: " + exam1.createddate);

    }
}
