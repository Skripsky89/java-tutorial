package prvocisla_hruba_metoda;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class verze_1
{
    public static void main(String []args)
    {
        int zbytek = 0;

        int krok = 0;

        int k =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Zde zadejte číslo od kterého chcete kontrolovat prvočísla");
        int odkolika = in.nextInt();
        System.out.println("Zde zadejte číslo do kterého chcete kontrolovat prvočísla");
        int dokolika = in.nextInt();


        for (int x = odkolika; x <= dokolika; x++)
        {
            krok = 0;
            for (int z = 1; z <= Math.sqrt(x); z++) {
                zbytek = x%z;
                if (zbytek == 0) {krok = krok + 1;}
            }            if (krok == 1)
            {
                System.out.print(x + ", ");
            }
        }
    }
}
