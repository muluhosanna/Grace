package studentdatabses;

import java.util.Scanner;

public class Student {
    private String firsttName;
    private String lastName;
    private String studentId;
    private int balance;
    private int costOfcourse = 600;
    private int titutionBalance = 0;
    private String courses = null;
    private Scanner yami;
    private String gradeyear;
    private static int id = 1000;

    //ask the user how many students will enroll
    //ask the department
    //enroll
    //view status;
    //generate Id;
    //view balance
    public Student() {
        id++;
        yami = new Scanner(System.in);
        System.out.print("enter first name:");
        this.firsttName = yami.next();
        System.out.print("enter last name:");
        this.lastName = yami.next();
        System.out.print("1-freshman\n2-sophomore\n3-junior\n4-senior\n enter grade level:");
        this.gradeyear = yami.next();
        setStudentId();

        System.out.println(firsttName + " " + lastName + " " + gradeyear + "" + " " + studentId);


    }

    public void setStudentId() {
        id++;
        this.studentId = gradeyear + "" + id;
    }

    public void enroll() {

        do {
            System.out.println("enter courses to enroll (Q to quit):");
            Scanner in = new Scanner(System.in);
            String courses = in.nextLine();
            if (!courses.equals("Q")) {
                courses = courses + "\n" + courses;
                titutionBalance = titutionBalance + costOfcourse;
            } else {
                System.out.println("break");
                break;


            }
            System.out.print("ENROLLED IN :" + courses);

        } while (1 < 2);

    }


    // System.out.println("TUTION BALANCE" + titutionBalance);


    public void viewBalance() {
        System.out.println("your balance is :" + titutionBalance);


    }

    public void payTution() {
        System.out.println("enter your payment");
        Scanner like = new Scanner(System.in);
        int payment = like.nextInt();
        titutionBalance = titutionBalance - payment;
        System.out.println("Thank you for payment:" + "$" + payment);
        viewBalance();

    }

        public String toString () {
            return "Name:" + firsttName + "" + lastName + "\n gradelevel:" + gradeyear + "\n Student Id:" + studentId
                    + "\ncourses enrolled :" + courses + "\n Balance:" + titutionBalance;
        }

}
