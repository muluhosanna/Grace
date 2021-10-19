package studentdatabses;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private Scanner gena;
    public Email(){
        Scanner gena = new Scanner(System.in);
        System.out.println("enter first name");
        this.firstName = gena.next();
        System.out.println("enter last name");
        this.lastName = gena.next();
        System.out.println("1-Math\n2-Comp\n3-Bio");
        //System.out.println("enter department");
        this.department =gena.next();
        System.out.println("email :" +lastName + "" + department + "@" + "."+ "com");



    }
}
