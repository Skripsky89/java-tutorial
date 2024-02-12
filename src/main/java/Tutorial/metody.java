package Tutorial;

import java.util.Scanner;

public class metody {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jmeno;
        String vek;
        String adresa;
        String rodne_cislo;
        String prijmeni;
        System.out.println("Zadej jméno");
        jmeno = in.nextLine();
        System.out.println("Zadej Příjmení");
        prijmeni = in.nextLine();
        System.out.println("Zadejte věk");
        vek = in.nextLine();
        System.out.println("Zadejte rodné číslo");
        rodne_cislo = in.nextLine();
        System.out.println("Zadejte adresu");
        adresa = in.nextLine();


        metoda(jmeno);
        System.exit(0);
    }

    public static void metoda(String arg) {
        System.out.println("Ahoj " + arg +"!");
    }
}