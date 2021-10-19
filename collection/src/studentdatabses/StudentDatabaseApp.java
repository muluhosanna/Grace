package studentdatabses;
//import com.java.bankapplication.*;
import com.java.bankapplication.CheckingAccount;
import com.java.bankapplication.SavingAccount;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args){
        //examplesOnstudent();
        //examplesOnEmail();
        examplesOnCheking();

    }
    public static void examplesOnstudent(){
       // Student st = new Student();

        System.out.println("enter the number of new students to enrolled;");

                Scanner yami = new Scanner(System.in);
                int numberOfStudents = yami.nextInt();


        Student[] student1=  new Student[numberOfStudents];
        for (int n = 0;n< numberOfStudents;n++){
            student1[n] = new Student();
            student1[n].enroll();
            student1[n].payTution();
            System.out.println(student1[n].toString());
           // System.out.println(student1[1].toString());
           // System.out.println(student1[2].toString());
            //System.out.println(student1[3].toString());

        }

    }
    public static void examplesOnEmail(){
        Email email = new Email();
    }
    public static void examplesOnCheking(){
        //CheckingAccount check1 = new CheckingAccount("mulu","789345014",250);
        SavingAccount saving1 = new SavingAccount("Tom","678900321",2500);
        //saving1.showInfo();
        //saving1.printBalance();
        //saving1.getBaseRate();
       // saving1.setSafetyDepositBox();

       // System.out.println(check1.getClass());
    }

}
