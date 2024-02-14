package kalkulacka;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class kalkulacka
{
    static boolean ukoncit = false;
    static Scanner in = new Scanner(System.in);

    public static void main (String[]args)
    {
        while (!ukoncit)
        {
            ukazmenu();
        }
    System.out.println("Systém se ukončuje");
    }

    public static void ukazmenu()
    {
        System.out.print("\n\n");
        System.out.print(" 1) Sčítaní \n 2) Odčítání \n 3) Nasobení \n 4) Dělění \n 5) Mocnina \n 6) Odmocnina \n 0) ukonččení programu \n");
        switch (in.nextInt())
        {
            case 1:
                scitej();
                break;
            case 2:
                odcitej();
                break;
            case 3:
                nasob();
                break;
            case 4:
                del();
                break;
            case 5:
                umocni();
                break;
            case 6:
                odmocni();
                break;
            case 0:
                ukoncit =true;
                break;
            default:
                ukazmenu("Neplatná volba zadej znovu");
        }
    }
    public static void ukazmenu(String zprava)
    {
        System.out.println(zprava);
        ukazmenu();
    }
    public static void scitej()
    {
        System.out.println("První číslo");
        double prvni = in.nextDouble();
        System.out.println("Druhé číslo");
        double druhé = in.nextDouble();
        double pamet = prvni +druhé;
        System.out.println("Výsledek je:" + pamet);

    }
    public static void odcitej()
    {
        System.out.println("První číslo");
        double prvni = in.nextDouble();
        System.out.println("Druhé číslo");
        double druhe = in.nextDouble();
        double pamet = prvni - druhe;
        System.out.println("Výsledek je:" + pamet);

    }
    public static void nasob()
    {
        System.out.println("Od čeho chceš odečíst");
        double prvni = in.nextDouble();
        System.out.println("Co chceš odečíst");
        double druhe = in.nextDouble();
        double pamet = prvni *druhe;
        System.out.println("Výsledek je:" + pamet);

    }
    public static void del()
    {
        System.out.println("Co cheš dělit");
        double prvni = in.nextDouble();
        System.out.println("Čím chceš dělit");
        double druhe = in.nextDouble();
        double pamet = prvni /druhe;
        System.out.println("Výsledek je:" + pamet);

    }
    public static void umocni()
    {
        System.out.println("co cheš umocnit");
        double prvni = in.nextDouble();

        double pamet = prvni*prvni ;
        System.out.println("Výsledek je:" + pamet);

    }
    public static void odmocni()
    {
        System.out.println("Co chceš odmocnit");
        double prvni = in.nextDouble();

        double pamet = sqrt(prvni) ;
        System.out.println("Výsledek je:" + pamet);

    }
}
