package hu.progmatic;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {

        int[] numbers = {1, 4, 9};
        String coma = "";


        for (int i = 0; i < numbers.length; i++) {
            coma += numbers[i];

            if (i < numbers.length - 1) {
                coma += ", ";

            }
        }


            System.out.println("[" + coma + "]");
        }
    }
