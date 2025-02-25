public class Application {
    public static void main(String[] args) {
        Amis ami1 = new Amis("Jul", 5);
        Amis ami2 = new Amis("Dylan", 2);
        Amis ami3 = new Amis("Tomas", 6);

        ami1.boitUneBierre();
        ami2.boitUneBierre();
        ami3.boitUneBierre();

        //Correction
        Ami amis = new Ami("Bob", 2);
        Ami amis2 = new Ami("ff", 5);
        Ami amis3 = new Ami("gg", 3);

        amis.boitUneBierre();
        
    }
}
