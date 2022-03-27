package hu.progmatic;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        //Adott egy szöveg, amely egy hónapot jelöl.
        //Írj programkódot, amely megmondja, hogy ez a hónap mely évszakhoz tartozik,
        // és az évszak nevét kiírja a képernyőre.
        //téli hónapok: december, január, február
        //tavaszi hónapok: március, április, május
        //nyári hónapok: június, július, augusztus
        //őszi hónapok: szeptember, október, november
        //minden más esetben azt írja ki, hogy "nem meghatározható"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a hónapot: ");
        String month = scanner.nextLine();

        switch (month) {
            case "január":
                System.out.println("tél");
                break;
            case "február":
                System.out.println("tél");
                break;
            case "március":
                System.out.println("tavasz");
                break;
            case "április":
                System.out.println("tavasz");
                break;
            case "május":
                System.out.println("tavasz");
                break;
            case "június":
                System.out.println("nyár");
                break;
            case "július":
                System.out.println("nyár");
                break;
            case "agusztus":
                System.out.println("nyár");
                break;
            case "szeptember":
                System.out.println("ősz");
                break;
            case "október":
                System.out.println("ősz");
                break;
            case "november":
                System.out.println("ősz");
                break;
            case "december":
                System.out.println("tél");
                break;

            default:
                System.out.println("Nem meghatározható.");
            }
        }
    }

