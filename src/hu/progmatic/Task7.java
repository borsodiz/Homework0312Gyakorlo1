package hu.progmatic;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Írd ki a képernyőre a számokat n-től 0-ig!
        //n egy pozitív egész szám.
        //A kiírás történhet számonként külön sorba, de akár egy sorba is.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int counter = 0;

        while (counter <= n) {
            System.out.println(n-counter);
            counter ++;
        }
    }
}
