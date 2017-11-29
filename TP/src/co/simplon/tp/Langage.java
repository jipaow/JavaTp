package co.simplon.tp;

public enum Langage {

    JAVA("Langage JAVA"),
    C("Langage C"),
    Cplus("Langage Cplus"),
    PHP("Langage PHP");

    private String name ="";

    //constrcuteur

    Langage(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
