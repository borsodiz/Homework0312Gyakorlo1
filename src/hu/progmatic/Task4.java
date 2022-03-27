package hu.progmatic;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Adott egy szöveg, amely egy közlekedési lámpa színét jelképezi.
        //Írj programkódot, amely ezt a szöveget vizsgálja,
        // és az értékének megfelelően kiírja a képernyőre az alábbi szövegeket:
        //ha a szöveg az, hogy "zöld" - kiírja, hogy "SZABAD"
        //ha "sárga", akkor: "LASSÍTS"
        //ha "piros", akkor: "MEGÁLLJ"
        //minden más esetben ezt írja ki: "NEM TUDOM"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a közlekedési lámpa színét: ");
        String traffLight = scanner.nextLine();

        if (traffLight.equalsIgnoreCase("zöld")) {
            System.out.println("SZABAD");

        } else if (traffLight.equalsIgnoreCase("sárga")) {
            System.out.println("LASSÍTS");
            } else if (traffLight.equalsIgnoreCase("piros")) {
            System.out.println("MEGÁLLJ");
        } else {
            System.out.println("NEM TUDOM");
        }
    }
}
