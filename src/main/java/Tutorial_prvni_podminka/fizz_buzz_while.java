package Tutorial_prvni_podminka;

public class fizz_buzz_while
{
    public static void main (String[] args)
    {
        int i = 0;
        int n = 99;
        while ( i <= n)
        {
            i =i+1;
            if  (i% 3 == 0  && i% 5 == 0 )
            {
                System.out.println("FIZZBUZZ");
            }
            else if
            (i% 5 == 0)
            {
                System.out.println("BUZZ");
            }
            else if  (i% 3 == 0)
            {
                System.out.println("FIZZ");
            }
            else{
                System.out.println(i);

            }



        }
        System.out.println("Právě jsme vypsali případ FizzBuzz");
    }
}
