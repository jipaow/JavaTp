package co.simplon.tp;

import co.simplon.comportement.Deplacement;
import co.simplon.comportement.EspritCombatif;
import co.simplon.comportement.Soin;

public class Civil extends Personnage {

    public Civil(){}

    public Civil(EspritCombatif esprit, Soin soin, Deplacement dep){
        super(esprit,soin,dep);

    }



}
