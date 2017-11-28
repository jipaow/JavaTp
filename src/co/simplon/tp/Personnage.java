package co.simplon.tp;

public abstract class Personnage {

    protected String armes ="",chaussure="",sacDesoin="";

    public  void seDeplacer(){
        System.out.println("Je me deplace à pied.");
    }

    public  void combattre(){
        System.out.println("Je ne combats pas !");
    }

    public void soigner(){
        System.out.println("Je ne soigne pas.");
    }

    public void setArmes(String armes) {
        this.armes = armes;
    }

    public void setChaussure(String chaussure) {
        this.chaussure = chaussure;
    }

    public void setSacDesoin(String sacDesoin) {
        this.sacDesoin = sacDesoin;
    }
}
