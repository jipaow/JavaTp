package co.simplon.tp;

import co.simplon.comportement.*;

import java.util.*;

public class Test {

    public static void main(String[] args) {
//--------------------- Exercice pattern strategy ----------------------------------------
     /* Personnage[] tPerso ={new Guerrier(), new Civil(), new Medecin()};
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

        }*/

 //-------------------- Exercice try/catch ----------------------------------------------------------
     /*City c = null;
     try{
          c = new City("Re",-120000,"France");


     }catch(NombreHabitantException  | NomDeVillleExecption e){
         System.out.println(e.getMessage());
     }
     finally{
         if(c == null)
             c = new City();
     }

        System.out.println(c.toString());
        */

     //------------------------- Exercice enum ----------------------------------------------------

        /*for (Langage lang : Langage.values()){
            if(Langage.JAVA.equals(lang))
                System.out.println("J'aime le : " + lang);
            else
                System.out.println(lang);
        }*/


// ----------------------- Collections -------------------------------------------------------------
        // linkedList

      /*List l = new LinkedList();
      l.add(12);
      l.add("toto  !!");
      l.add(12.20f);

      for ( int i =0; i < l.size();i++)
          System.out.println("Element à l'index  "+i+" = " + l.get(i));

      System.out.println("\n \tPracours avec un itérateur ");
      System.out.println("-----------------------------------");
      ListIterator li = l.listIterator();

      while(li.hasNext())
          System.out.println( li.next());*/

      // ArrayList

        /*ArrayList al = new ArrayList();
        al.add(12);
        al.add("une chaine de caracteres");
        al.add(12.20f);
        al.add('d');

        for ( int i = 0; i < al.size(); i++){
            System.out.println("donnée à l'indice "+i+" = "+al.get(i));
        }*/

     // Hashtable

      /*  Hashtable ht = new Hashtable();
        ht.put(1,"printemps");
        ht.put(10,"été");
        ht.put(12, "automne");
        ht.put(45,"hiver");

        Enumeration e = ht.elements();

        while (e.hasMoreElements())
            System.out.println(e.nextElement());
        e = ht.keys();

        while (e.hasMoreElements())
            System.out.println(e.nextElement());

        if(ht.contains("septembre"))
            System.out.println(ht.size());
        else
            System.out.println(" septembre n'est pas dans la table"); */

      // HashMap les deux objets Map sont, à peu de choses près, équivalents.
        // sauf que Hashmap : accepte le valeur null et n'est pas thread Safe.


       //HashSet

       HashSet hs = new HashSet();
       hs.add("toto");
       hs.add(12);
       hs.add('d');

       Iterator it = hs.iterator();
       while(it.hasNext())
           System.out.println(it.next());

       System.out.println("\nParcours avec un tableau d'objet");
       System.out.println("------------------------------------");


       Object[] obj = hs.toArray();
       for(Object o : obj)
           System.out.println(o);






























    }
}
