package co.simplon.tp;

import co.simplon.comportement.Deplacement;
import co.simplon.comportement.EspritCombatif;
import co.simplon.comportement.PremierSoin;
import co.simplon.comportement.Soin;

public class Medecin extends Personnage {

    public Medecin(){
        this.soin = new PremierSoin();
    }

    public Medecin(EspritCombatif esprit , Soin soin , Deplacement dep){
        super(esprit,soin, dep);

    }
}
