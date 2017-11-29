package co.simplon.tp;

import co.simplon.comportement.CombatPistolet;
import co.simplon.comportement.Deplacement;
import co.simplon.comportement.EspritCombatif;
import co.simplon.comportement.Soin;

public class Guerrier extends Personnage {

    public Guerrier(){
        this.espritCombatif = new CombatPistolet();

    }

    public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep){
        super(esprit,soin, dep);
    }
}
