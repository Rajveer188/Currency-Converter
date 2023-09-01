package scr.Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pound {
    Scanner inp = new Scanner(System.in);

    public void howMuch() {
        System.out.println("how much money you want to convert");
        int n = inp.nextInt();
        poundTo(n);
    }

    private void poundTo(int n) {
        System.out.print("in which currency you want to convert your Pound");
        System.out.println(
                "\n1. Dirham\n 2. Kuwaiti Dinar\n 3. Indian Rupee \n 4. Euro \n 5.United States Dollar\n (choose any one number)");
        switch (inp.nextInt()) {
            case 1 -> {
                poundToDirham(n);
            }
            case 2 -> {
                poundToDinar(n);
            }
            case 3 -> {
                poundToRupee(n);
            }
            case 4 -> {
                poundToEuro(n);
            }
            case 5 -> {
                poundToDollar(n);
            }
            default -> {
                System.out.println("invaild choise try again");
                return;
            }

        }
    }

    private void poundToDollar(int n) {
        float exchangeRate = 1.26f;
        System.out.println(n + " pound in Dollar is " + String.format("%.2f", n * exchangeRate) + "$");
    }

    private void poundToEuro(int n) {
        float exchangeRate = 1.17f;
        System.out.println(n + " pound in Euro is " + String.format("%.2f", n * exchangeRate) + "€");

    }

    private void poundToRupee(int n) {
        float exchangeRate = 103.83f;
        System.out.println(n + " pound in rupee is " + String.format("%.2f", n * exchangeRate) + "₹");

    }

    private void poundToDinar(int n) {
        float exchangeRate = 0.39f;
        System.out.println(n + " pound in Dinar is " + String.format("%.2f", n * exchangeRate) + " Dinar");

    }

    private void poundToDirham(int n) {
        float exchangeRate = 4.62f;
        System.out.println(n + " pound in Dirhar is " + String.format("%.2f", n * exchangeRate) + " Dirham");

    }
}
