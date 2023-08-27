package scr.Java;

import java.util.Scanner;

public class Dollar {
    Scanner inp = new Scanner(System.in);
    public void howMuch(){
        System.out.println("how much money you want to convert");
        int n  = inp.nextInt();
        dollarTo(n);
    }

    private void dollarTo(int n) {
        System.out.print("in which currency you want to convert your Rupee");
        System.out.println(
                "\n1. Dirham\n 2. Kuwaiti Dinar\n 3. British pound \n 4. Euro \n 5. Rupee\n (choose any one number)");

        switch (inp.nextInt()) {
            case 1 -> {
                dollarToDirham(n);
            }
            case 2 -> {
                dollarToDinar(n);
            }
            case 3 -> {
                dollarToPound(n);
            }
            case 4 -> {
                dollarToEuro(n);
            }
            case 5 ->{
                dollarToRupee(n);
            }
            default -> {
                System.out.println("invaild choise try again");
                return;
            }

        }
        
        
    }

    private void dollarToRupee(int n) {
        double exchangeRate = 82.55;
        double rupees = n * exchangeRate;
        System.out.println(n + " dollars is equal to " + rupees + " rupees.");
    }


    private void dollarToDirham(int n) {
        double exchangeRate = 3.67;
        double dirhams = n * exchangeRate;
        System.out.println(n + " dollars is equal to " + dirhams + " United Arab Emirates Dirhams.");
    }

    private void dollarToDinar(int n) {
        double exchangeRate = 0.31;
        double dinars = n * exchangeRate;
        System.out.println(n + " dollars is equal to " + dinars + " Kuwaiti Dinars.");
    }

    private void dollarToPound(int n) {
        double exchangeRate = 0.79;
        double pounds = n * exchangeRate;
        System.out.println(n + " dollars is equal to " + pounds + " Pound Sterling.");
    }

    private void dollarToEuro(int n) {
        double exchangeRate = 0.93;
        double euros = n * exchangeRate;
        System.out.println(n + " dollars is equal to " + euros + " Euros.");
    }

}
