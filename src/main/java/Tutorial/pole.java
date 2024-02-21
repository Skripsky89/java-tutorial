package Tutorial;

public class pole
{
public static void main (String[]args)
    {
    int[] cisla = new int[4];
    cisla[0] = 0;
    cisla[1] = 1;
    cisla[2] = 5;
    cisla[3] = 7;
    System.out.println(cisla[2] );
    pole(cisla);
    }
public static void pole( int[] celacisla)
    {
    for (int a = 0; a < celacisla.length; a++ ){
        celacisla [a] += 5;
        System.out.println(celacisla[a]);
    }
    }
}
