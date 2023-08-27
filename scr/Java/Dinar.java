package scr.Java;

import java.util.Scanner;

public class Dinar {
    Scanner inp = new Scanner(System.in);
    public void howMuch(){
        System.out.println("how much money you want to convert");
        int n  = inp.nextInt();
        dinarTo(n);
    }

    private void dinarTo(int n) {
        System.out.print("in which currency you want to convert your Rupee");
        System.out.println(
                "\n1. Dirham \n 2. British pound \n 3. Euro \n 4.United States Dollar\n5. Indian Rupees\n (choose any one number)");
        switch (inp.nextInt()) {
            case 1 -> {
                dinarToDirham(n);
            }
            case 2 -> {
                dinarToRupee(n);
            }
            case 3 -> {
                dinarToPound(n);
            }
            case 4 -> {
                dinarToEuro(n);
            }
            case 5 -> {
                dinarToDollar(n);
            }
            default -> {
                System.out.println("invaild choise try again");
                return;
            }

        }
    }

    private void dinarToRupee(int n) {
        double exchangeRate = 267.77;
        double rupees = n * exchangeRate;
        System.out.println(n + " Kuwaiti Dinars is equal to " + rupees + " Indian Rupees.");
    }

    private void dinarToPound(int n) {
        double exchangeRate = 2.58;
        double pounds = n * exchangeRate;
        System.out.println(n + " Kuwaiti Dinars is equal to " + pounds + " Pound Sterling.");
    }

    private void dinarToEuro(int n) {
        double exchangeRate = 3.01;
        double euros = n * exchangeRate;
        System.out.println(n + " Kuwaiti Dinars is equal to " + euros + " Euros.");
    }

    private void dinarToDollar(int n) {
        double exchangeRate = 3.24;
        double dollars = n * exchangeRate;
        System.out.println(n + " Kuwaiti Dinars is equal to " + dollars + " United States Dollars.");
    }

    private void dinarToDirham(int n) {
        double exchangeRate = 11.91;
        double dirhams = n * exchangeRate;
        System.out.println(n + " Kuwaiti Dinars is equal to " + dirhams + " United Arab Emirates Dirhams.");
    }

}
