package co.simplon.tp;

import co.simplon.comportement.*;

public abstract class Personnage {

    //instances de comportement
    protected EspritCombatif espritCombatif = new Pacifiste();
    protected Soin soin =  new AucunSoin();
    protected Deplacement deplacement =  new Marcher();


    // constructeur par défaut
    public Personnage(){}


    // constructeur avec parametres
    public Personnage(EspritCombatif espritCombatif,Soin soin,Deplacement deplacement){
        this.espritCombatif = espritCombatif;
        this.soin = soin;
        this.deplacement = deplacement;
    }

    // Méthode de déplacement de personnage
    public void seDeplacer(){
        deplacement.deplacer();
    }

    //Méthode que les combattants utilisent
    public void combattre(){
        espritCombatif.combat();
    }

    //Méthode de soin
    public void soigner(){
        soin.soigne();
    }

    // redéfinit le comportement au combat

    public void setEspritCombatif(EspritCombatif espritCombatif) {
        this.espritCombatif = espritCombatif;
    }

    public void setSoin(Soin soin) {
        this.soin = soin;
    }

    public void setDeplacement(Deplacement deplacement) {
        this.deplacement = deplacement;
    }
}
