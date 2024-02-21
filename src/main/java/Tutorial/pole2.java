package Tutorial;

public class pole2
{
    public static void main (String[]args)
    {
        int[] cisla = new int[4];
        cisla[0] = 0;
        cisla[1] = 1;
        cisla[2] = 5;
        cisla[3] = 7;

        cisla = pole(cisla);
        System.out.println(cisla[1] );
        
    }
    public static int[] pole( int[] celacisla)
    {
        int [] novepole = celacisla;
        for (int a = 0; a < novepole.length; a++ ){
            novepole [a] += 5;

        }
    return novepole;
    }
}
