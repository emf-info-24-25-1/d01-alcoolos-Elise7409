public class Amis {
    
    private String nom;
    private int nbrBierreSupporter;

    public Amis(String nom, int nbrBierreSupporter){
        this.nom = nom;
        this.nbrBierreSupporter = nbrBierreSupporter;
    }

    public String getNom(){
        return this.nom;
    }
    public int getNbrBierreSupporter(){
        return this.nbrBierreSupporter;
    }

    public void boitUneBierre(){
        nbrBierreSupporter--;
        System.out.println(nom + " boira une bière");
        System.out.println(nom + " peut encore boire : " + nbrBierreSupporter + " bières");
    }
    
}
