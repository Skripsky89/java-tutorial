package Tutorial;

public class faktorial {
    public static void main(String[] args) {
        System.out.println(f(6));
        System.out.println(faktorialRekuzze(6));
    }
        public static int f(int cislo){
            for (int a = cislo - 1; a > 0; a--){
                cislo *= a;
            }
        return cislo;
            }
        public static int faktorialRekuzze (int cislo) {
            if (cislo == 1)
            return 1;

            return cislo * faktorialRekuzze(cislo - 1);
        }
    }

