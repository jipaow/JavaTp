package co.simplon.tp;

public class Sniper extends Personnage {

    @Override
    public void combattre() {
        if(this.armes.equals("fusil à pompe"))
            System.out.println("Attaque au pompe !");
        else
            System.out.println("Je me sers de mon fusil à lunette");

    }
}
