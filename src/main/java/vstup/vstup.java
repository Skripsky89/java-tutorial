package vstup;

import java.util.Scanner;

public class vstup
{
    public static void main(String[]args)
    {
        Scanner in =new Scanner(System.in);
        String retezec;
        System.out.println("Zadej jméno příjmení");
        retezec = in.nextLine();
        System.out.println("Dobrý den pane" + retezec);
    }
}
