package co.simplon.comportement;

public class PremierSoin implements Soin {
    @Override
    public void soigne() {
        System.out.println("Je donne les premiers soins. ");
    }
}
