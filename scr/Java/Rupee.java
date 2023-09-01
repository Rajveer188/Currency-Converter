package scr.Java;

import java.util.Scanner;

public class Rupee {
    // float rupee;
    Scanner inp = new Scanner(System.in);

    Rupee() {
    }

    public void howMuch() {
        System.out.println("how much money you want to convert");
        int n = inp.nextInt();
        rupeeTo(n);
    }

    private void rupeeTo(int n) {
        System.out.print("in which currency you want to convert your Rupee");
        System.out.println(
                "\n1. Dirham\n 2. Kuwaiti Dinar\n 3. British pound \n 4. Euro \n 5.United States Dollar\n (choose any one number)");
        switch (inp.nextInt()) {
            case 1 -> {
                rupeeToDirham(n);
            }
            case 2 -> {
                rupeeToDinar(n);
            }
            case 3 -> {
                rupeeToPound(n);
            }
            case 4 -> {
                rupeeToEuro(n);
            }
            case 5 -> {
                rupeeToDollar(n);
            }
            default -> {
                System.out.println("invaild choise try again");
                return;
            }

        }

    }

    private void rupeeToDollar(int INR) {
        float exchangeRate = 82.55f;
        System.out.println(INR + " rupee in Dollar is " + String.format("%.2f", INR / exchangeRate) + "$");
    }

    private void rupeeToEuro(int INR) {
        float exchangeRate = 89.11f;
        System.out.println(INR + " rupee in Euro is " + String.format("%.2f", INR / exchangeRate) + "€");

    }

    private void rupeeToDinar(int INR) {
        float exchangeRate = 267.77f;
        System.out.println(INR + " rupee in Dinar is " + String.format("%.2f", INR / exchangeRate) + "Dinar");

    }

    private void rupeeToPound(int INR) {
        float exchangeRate = 103.85f;
        System.out.println(INR + " rupee in Pound is " + String.format("%.2f", INR / exchangeRate) + "£");

    }

    private void rupeeToDirham(int INR) {
        float exchangeRate = 22.47f;
        System.out.println(INR + " rupee in Dirhar is " + String.format("%.2f", INR / exchangeRate) + "Dirham");

    }
}
