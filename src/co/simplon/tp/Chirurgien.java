package co.simplon.tp;

public class Chirurgien extends Personnage {

    public void soigner(){
        if(this.sacDesoin.equals("gros sac"))
        System.out.println("Je fais des merveilles");
        else
            System.out.println("Je fais des operations");

    }
}
