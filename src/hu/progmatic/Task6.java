package hu.progmatic;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        // Írd ki a képernyőre a számokat 1-től n-ig!
        //n egy pozitív egész szám.
        //A kiírás történhet számonként külön sorba, de akár egy sorba is.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy pozitív egész számot: ");
        int number = scanner.nextInt();
        int baseNumber = 1;
        int counter = 0;

        while (counter < number) {
            System.out.print((baseNumber+counter) +", ");
            counter ++;


        }
    }
}
