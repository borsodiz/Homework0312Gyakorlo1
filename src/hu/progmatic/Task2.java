package hu.progmatic;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        // Adott egy egész szám.
        //Csökkentsd a szám értékét 1-gyel, amennyiben a szám nagyon 0-nál.
        //Ha a szám kisebb 0-nál, ne történjen változás.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        int userNumber = scanner.nextInt();
        scanner.nextLine();

        if (userNumber > 0) {
            System.out.println(userNumber-1);
        } else {
            System.out.println(userNumber);
        }

    }
}
