package co.simplon.tp;

import co.simplon.comportement.*;

public class Test {

    public static void main(String[] args) {

      Personnage[] tPerso ={new Guerrier(), new Civil(), new Medecin()};
        for(int i = 0; i < tPerso.length; i++) {

            System.out.println("\nInstance de " + tPerso[i].getClass().getName());

            System.out.println("*****************************************");
            
            tPerso[2].setEspritCombatif(new CombatPistolet());
            tPerso[2].setDeplacement(new Courir());
            tPerso[2].setSoin(new Operation());
            tPerso[0].setDeplacement(new Courir());
            tPerso[0].setSoin(new PremierSoin());
            tPerso[i].combattre();
            tPerso[i].seDeplacer();
            tPerso[i].soigner();

        }








    }
}
