package hu.progmatic;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        // Adott két egész szám.
        //Oszd el az első számot a másodikkal, és az eredményt írd ki a képernyőre!
        // De csak akkor végezd el a műveletet, ha a második szám nem 0!
        //Ha a második szám 0, akkor írd ki a képernyőre, hogy "Nullával nem osztunk!"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg 2 számot: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        int num2 = scanner.nextInt();
        scanner.nextLine();

        if (num2 !=0) {
            System.out.println("Ha a két számot elosztjuk, az eredmény: " + (num1 / num2));
        } else {
            System.out.println("Nullával nem osztunk!");
        }
    }
}
