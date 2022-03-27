package hu.progmatic;

public class Task9 {
    // Fűzd össze szöveggé az angol ábécé első n betűjét az ‘a’-tól kezdve.
    //n egy pozitív egész szám.

    public static void main(String[] args) {

        int n = 26;
        String text = "";

        for (char letter = 97; letter < 97+ n; letter++) {

            text += letter;

        }
        System.out.println(text);
    }
}
