
public class Ami {

    //Attributs
    private final String noms;
    private int nbrBierre;

    //Constructeur
    public Ami (String noms, int nbrBierre){
        this.noms = noms;
        this.nbrBierre = nbrBierre;
    }

    public String getNoms(){
        return noms;
    }

    public void setNbrBierre(int nbrBierre){
        this.nbrBierre = nbrBierre;
    }
        
    public int getNbrBierre(){
        return nbrBierre;
    }

    //methode boit une bierre
    public void boitUneBierre(){
        if (nbrBierre > 0) {
            nbrBierre--;
            System.out.println(noms + " boit une bierre");
        }
        else{
            System.out.println(noms + " Ne peut plus boire de bierre");
        }

    }
}
