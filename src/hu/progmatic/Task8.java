package hu.progmatic;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // Számítsd ki egy pozitív egész szám faktoriálisát, és az eredményt írd ki a képernyőre!
        //Faktoriális:
        //a számnál kisebb/egyenlő pozitív egész számok szorzata
        //például 5 faktoriális = 5 * 4 * 3 * 2 * 1 = 120

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        int number = scanner.nextInt();;
        scanner.nextLine();

        int counter = 1;
        int factorial = 1;

        while (counter <= number) {
            factorial = factorial * counter;
            counter ++;

        }System.out.println(factorial);
    }
}
