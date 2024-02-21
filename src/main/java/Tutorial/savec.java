package Tutorial;

public class savec {

    private  int vek;
    private  int vaha;

    public savec(){
        System.out.println("Savec:");
        vek = 5 ;
        vaha = 60;
    }
    public void pohyb(){
    System.out.println("savec se pohybuje");
    }

    public int getVaha() {
        return vaha;
    }

    public void setVaha(int vaha) {
        this.vaha = vaha;
    }



    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }



}




