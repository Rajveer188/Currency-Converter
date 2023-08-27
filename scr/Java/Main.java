package scr.Java;
import java.util.Scanner;

public class Main {
    public static void choice(int n){
     switch(n){
         case 1->{
             Rupee rupee = new Rupee();
             rupee.howMuch();
             break;
         }
         case 2->{
             Dirham dirham = new Dirham();
             dirham.howMuch();
             break;
         }
         case 3->{
             Dinar dinar = new Dinar();
             dinar.howMuch();
             break;
         }
         case 4->{
             Pound pound = new Pound();
             pound.howMuch();
             break;
         }
         case 5->{
             Euro euro = new Euro();
             euro.howMuch();
             break;
         }
         case 6->{
             Dollar dollar = new Dollar();
             dollar.howMuch();
             break;
         }
         default -> {System.out.println("invailed choise please try again :) ");}

     }
    }
    public static void main(String arg[]){
        System.out.println("                                 ---------Welcome-----------");
        System.out.println("here you can  easily conversion of currency values based on present-day exchange rates");
        Scanner input = new Scanner(System.in);
        System.out.println("which currency you want to convert : \n 1. Indian Rupee\n 2. Dirham\n 3. Kuwaiti Dinar\n 4. British pound \n 5. Euro \n 6.United States Dollar\n (choose any one number)");
        choice(input.nextInt());
    }
//    public static void choice(int n){
//
//    }
}
