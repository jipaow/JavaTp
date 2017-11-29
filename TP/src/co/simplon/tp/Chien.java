package co.simplon.tp;

import javax.jws.soap.SOAPBinding;

public class Chien extends Canin implements Rintintin {
    //public Chien(){

    //}

    public Chien(String couleur , int poids){
        this.couleur = couleur;
        this.poids = poids;
    }

    void crier(){
        System.out.println("J'aboie sans raison !");
    }

    public void faireCalin(){
        System.out.println("je fais un Gros calin");
    }

    @Override
    public void faireLechouille() {
        System.out.println("je fais des grosses lechouilles...");
    }

    @Override
    public void faireLebeau() {
        System.out.println("je fais le beau !");

    }


}
