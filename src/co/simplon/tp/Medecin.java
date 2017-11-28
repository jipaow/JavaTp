package co.simplon.tp;

public class Medecin extends Personnage {

    @Override
    public void combattre() {
        if(this.armes.equals("Pistolet"))
            System.out.println("Attaque au pistolet !");
        else
            System.out.println("vive le scalpel !");
    }

    public void soigner(){
        if(this.sacDesoin.equals("petit sac"))
            System.out.println("Je peux recoudre des blessures");
        else
            System.out.println("Je soigne les blessures");
    }
}
