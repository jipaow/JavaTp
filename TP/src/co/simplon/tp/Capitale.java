package co.simplon.tp;

public class Capitale extends City {

    private String monument;


    public Capitale(){
        super();
        monument ="aucun";
    }

    public Capitale(String nom, int hab, String pays, String monument) {
        super(nom, hab, pays);
        this.monument = monument;
    }

    /**
     * Description d'une capitale
     * @return String retourne la description de l' objet
     */

    public String toString() {
        String str = super.toString()+"\n \t ==>>" +this.monument+" en est un monument";

        return str;

    }

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }
}
