package project.week1;

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("welcome to the patient portal!");
        System.out.println("please enter your personal information");
        System.out.println("Enter your first name");
        String firstName=scan.nextLine();
        System.out.println("Enter your last name");
        String lastName=scan.nextLine();
        System.out.println("Enter your email");
        String email=scan.nextLine();
        System.out.println("enter your street");
        String street=scan.nextLine();
        System.out.println("enter your city ");
        String city =scan.nextLine();
        System.out.println("enter your state");
        String state=scan.nextLine();
        System.out.println("enter your zip code");
        int zipCode=scan.nextInt();
        System.out.println("enter your work phone number");
        Long workNumber=scan.nextLong();
        System.out.println("enter your personal phone number");
        Long personalNumber=scan.nextLong();
        System.out.println("enter your age");
        int age=scan.nextInt();
        System.out.println("enter your height");
        double height=scan.nextDouble();
        System.out.println("enter your weight");
        double weight=scan.nextDouble();
        String a=scan.nextLine();
        System.out.println("are you married");
        boolean isMarried=scan.nextBoolean();
        System.out.println("            Patient personal information           ");
        System.out.println("Full name:"+  firstName + ","  +  lastName);
        System.out.println("Address: "  + street + "," + city+ ","+state  + zipCode);
        System.out.println("Contacts: " + " work phone number "+" - " + workNumber  +  " personal phone number " +" - "+ personalNumber);
        System.out.println("Email: " + email);
        System.out.println("Age:"+ age);
        System.out.println("Height:" + height);
        System.out.println("Weight: " +weight +  " pounds ");
        System.out.println("married?:" + isMarried);

    }
}
