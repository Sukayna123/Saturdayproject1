package project.week1;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println( "Enter item and its price");
        String item1=scan.nextLine();
        double price1= scan.nextDouble();
        String w =scan.nextLine();
//        System.out.println(item1 +"" +price1);
        System.out.println("Enter item2 and its price:");
        String item2=scan.nextLine();
        double price2 = scan.nextDouble();
        String A=scan.nextLine();

//        System.out.println(item2 +"" +price2);

        System.out.println("Enter item3 and its price:");
        String item3=scan.nextLine();
        double price3=scan.nextDouble();
//        System.out.println(item3 +"" + price3);
        double totalprice= price1+price2+price3;

        System.out.print("Item1:" + item1   +   "price:"  + price1+ ",");
        System.out.print("Item2:" + item2   +   "price:"  + price2+",");
        System.out.println("Item3:" + item3   +   "price:"  + price3+ ",");
        System.out.println("Total price:" + totalprice);
    }
}
