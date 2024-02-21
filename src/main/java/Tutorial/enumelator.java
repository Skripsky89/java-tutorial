package Tutorial;

public class enumelator
{
    enum barvy { cervena, zelena, modra}
    public static void main (String[]args)
    {
     barvy barvicky =  barvy.cervena;
     if (barvicky == barvy.cervena)
         System.out.println("Poteče krev.");
    }

}
