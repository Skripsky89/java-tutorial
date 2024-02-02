package Tutorial_prvni_podminka;

public class and_or_xor
{
    public static void main (String[] args)
    {
        int Promena_1 = 10;
        int Promena_2 = 15;
        int Promena_3 = 5;

        if (Promena_2 == Promena_1 && Promena_2 > Promena_3)
        //|| operátor or; && operátor and; !  negace proměné

        {
            System.out.println( "čísla jsou schodná");
        }
        else
        {
            System.out.println("Proměné se nerovnají");
        }
    }
}
