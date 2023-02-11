package project.week1;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter AreaCode");
        //    String areaCode=scan.nextLine();
        int areaCode=scan.nextInt();

        System.out.println("Enter LocalNumber");
//        String localNumber=scan.nextLine();
        int localNumber = scan.nextInt();
        System.out.println("Calling Number"+ "(" + areaCode +")" +"-"+ localNumber);



    }
}
