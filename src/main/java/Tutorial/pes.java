package Tutorial;

public class pes extends savec {
    private int vek;
    private int vyska;
    private String rasy;
    public static String ahoj= "Ahoj haf haf";

    public pes (){
        vek = 4;
        vyska = 60;
        rasy = "kokrspanel";
        System.out.println("Pes:");
    }
    public int ziskejvek(){
        return vek;
    }


    public int ziskejvysku(){
        return vyska;
    }
    public void nastavrasu(String druh){
        rasy = druh;
    }
    public void nastavek(int zivotnost){
        vek = zivotnost;
    }
    public void nastavvek(int vek){
        this.vek = vek;
    }
    public static void pozdrav(){
        System.out.println(ahoj);
    }

}
