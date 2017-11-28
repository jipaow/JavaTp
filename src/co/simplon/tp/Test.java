package co.simplon.tp;

public class Test {

    public static void main(String[] args) {

      Personnage[] tPerso ={new Guerrier(), new Chirurgien(), new Civil(), new Sniper(), new Medecin()};
      String[] tArmes ={"pistolet","pistolet","couteau","fusil à pompe","couteau"};


      for(int i =0; i< tPerso.length; i++){

          System.out.println("\n Instance de "+ tPerso[i].getClass().getName());
          System.out.println("*************************************************************");
          tPerso[i].combattre();
          tPerso[i].setArmes(tArmes[i]);
          tPerso[i].combattre();
          tPerso[i].seDeplacer();
          tPerso[i].soigner();
      }
    }
}
