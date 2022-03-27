package hu.progmatic;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Adott egy egész szám.
        //Határozd meg a számról, hogy az negatív, pozitív vagy nulla-e!
        //ha negatív, írd ki a képernyőre, hogy "negatív"
        //ha pozitív, akkor azt írd ki, hogy "pozitív"
        //ha pedig az értéke pontosan 0, akkor azt, hogy "nulla"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy egész számot: ");
        int userNumber = scanner.nextInt();
        scanner.nextLine();

        if (userNumber == 0) {
            System.out.println("nulla");
        }
            else if (userNumber < 0) {
            System.out.println("negatív");
            }
            else {
            System.out.println("pozitív");
        }
    }
}
