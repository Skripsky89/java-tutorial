package Tutorial;

import java.util.Scanner;

public class metodaVraciHodnotu {
    public static void main(String[] args)
    {
        int vek;
        float vaha;
        float vyska;
        Scanner in = new Scanner(System.in);
        System.out.println("Zadej věk");
        vek = in.nextInt();
        System.out.println("Zadej váhu");
        vaha = in.nextInt();
        System.out.println("Zadej výšku");
        vyska = in.nextInt();
        System.out.println("Budeš platit");
        if (vek > 17)
        {
            System.out.println(vypocitej(vaha, vyska));

        }
        else
        {
            System.out.println(0);
        }
    }

    public static float vypocitej(float arg1 , float arg2)
    {
    System.out.println();
    float temp = (arg1 / arg2)*1000 ;
    return temp;
    }
}
