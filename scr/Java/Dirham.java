package scr.Java;

import java.util.Scanner;

public class Dirham {
    Scanner inp = new Scanner(System.in);

    public void howMuch() {
        System.out.println("how much money you want to convert");
        int n = inp.nextInt();
        dirhamTo(n);
    }

    private void dirhamTo(int n) {
        System.out.print("in which currency you want to convert your Rupee");
        System.out.println(
                "\n 1. Kuwaiti Dinar\n 2. British pound \n 3. Euro \n 4.United States Dollar\n (choose any one number)");

        switch (inp.nextInt()) {
            case 1 -> {
                dirhamToDinar(n);
            }
            case 2 -> {
                dirhamToPound(n);
            }
            case 3 -> {
                dirhamToEuro(n);
            }
            case 4 -> {
                dirhamToDollar(n);
            }
            default -> {
                System.out.println("invaild choise try again");
                return;
            }

        }
    }

    private void dirhamToDollar(int n) {
        float exchangeRate = 3.67f;
        System.out.println(n + " dirham in Dollar is " + String.format("%.2f", n / exchangeRate) + "$");
    }

    private void dirhamToEuro(int n) {
        float exchangeRate = 3.97f;

        System.out.println(n + " dirham in Euro is " + String.format("%.2f", n / exchangeRate) + "€");

    }

    private void dirhamToPound(int n) {
        float exchangeRate = 4.62f;
        System.out.println(n + " dirham in pound is " + String.format("%.2f", n / exchangeRate) + "£");

    }

    private void dirhamToDinar(int n) {
        float exchangeRate = 11.91f;
        System.out.println(n + " dirham in dinar is " + String.format("%.2f", n / exchangeRate));
    }
}
