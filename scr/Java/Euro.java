package scr.Java;

import java.util.Scanner;

public class Euro {
    Scanner inp = new Scanner(System.in);
    public void howMuch(){
        System.out.println("how much money you want to convert");
        int n  = inp.nextInt();
        euroTo(n);
    }

    private void euroTo(int n) {
        System.out.print("in which currency you want to convert your Rupee");
        System.out.println(
                "\n1. Dirham\n 2. Kuwaiti Dinar\n 3. British pound \n 4. Rupee \n 5.United States Dollar\n (choose any one number)");
        switch (inp.nextInt()) {
            case 1 -> {
                euroToDirham(n);
            }
            case 2 -> {
                euroToDinar(n);
            }
            case 3 -> {
                euroToPound(n);
            }
            case 4 -> {
                euroToRupee(n);
            }
            case 5 -> {
                euroToDollar(n);
            }
            default -> {
                System.out.println("invaild choise try again");
                return;
            }

        }
    }

    private void euroToDollar(int n) {
        double exchangeRate = 1.08;
        double dollars = n * exchangeRate;
        System.out.println(n + " Euros is equal to " + dollars + " United States Dollars.");
    }

    private void euroToRupee(int n) {
        double exchangeRate = 89.11;
        double rupees = n * exchangeRate;
        System.out.println(n + " Euros is equal to " + rupees + " Indian Rupees.");
    }

    private void euroToDinar(int n) {
        double exchangeRate = 0.33;
        double dinars = n * exchangeRate;
        System.out.println(n + " Euros is equal to " + dinars + " Kuwaiti Dinars.");
    }

    private void euroToPound(int n) {
        double exchangeRate = 0.86;
        double pounds = n * exchangeRate;
        System.out.println(n + " Euros is equal to " + pounds + " Pound Sterling.");
    }

    private void euroToDirham(int n) {
        double exchangeRate = 3.97;
        double dirhams = n * exchangeRate;
        System.out.println(n + " Euros is equal to " + dirhams + " United Arab Emirates Dirhams.");
    }

}
