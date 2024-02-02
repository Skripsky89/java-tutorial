package prvocisla_hruba_metoda;


import java.util.Scanner;

public class zkopirovano_piskota {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Zadej, od kterého čísla chceš vypsat prvočísla:");
        int odcisla = sc.nextInt();
        System.out.println("Zadej, do kterého čísla chceš vypsat prvočísla:");
        int docisla = sc.nextInt();
        int zbytek = 0;
        int pocet = 0;
        //System.out.println(); Tento řádek je tu zbyteřně nee??

        for (int x = odcisla; x <= docisla; x++) {
            pocet = 0;
            for (int z = 1; z <= x; z++) {
                zbytek = x%z;
                if (zbytek == 0) {
                    pocet = pocet + 1;
                }
            }
            if (pocet == 2) {
                System.out.print(x + ", ");
            }
        }
    }
}