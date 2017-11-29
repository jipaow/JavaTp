package co.simplon.tp;

public class City {
    protected String nomVille;//variables d'instance//
    protected String nomPays;
    protected int nbreHabitants;
    protected char categorie;//variables d'instance//
    public static int nbreInstances =0;//variables de classe : sont déclarées en static
    protected static int nbreInstancesBis =0;//variables de classe



    public City() {

        nomVille = " inconnu";
        nomPays = "inconnu";
        nbreHabitants = 0;
        this.setCategorie();
        nbreInstances++;
        nbreInstancesBis++;
    }

    public City(String pNom, int pNbre, String pPays)
        throws NombreHabitantException , NomDeVillleExecption{
            if(pNbre < 0)
                throw new NombreHabitantException(pNbre);

            if(pNom.length() < 3)
                throw new NomDeVillleExecption("le nom de la ville est inférieur à 3 caractères ! nom =" +pNom);

            if(!pNom.matches("[a-zA-Z]+") || pNom.equals(""))
                throw new NomDeVillleExecption("le nom de la ville n'est pas valide ! nom =" +pNom);
            else
            {
                nbreInstances++;
                nbreInstancesBis++;

                nomVille = pNom;
                nomPays = pPays;
                nbreHabitants = pNbre;
                this.setCategorie();
            }
        }




    //******* METHODES D'INSTANCE*********
    public String toString(){
        return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitants => elle est donc de categorie : "
                +this.categorie;
    }

    public String comparer(City city1){
        String str = new String();
        if (city1.getNbreHabitants() > this.nbreHabitants)
            str = city1.getNom()+ " est une villle plus peuplée que "+this.nomVille;

        else
            str = this.nomVille+" est une ville plus peuplée que "+city1.getNom();

        return str;
    }



//*************** ACCESSEURS ********************


    public String getNom() {
        return nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public int getNbreHabitants() {
        return nbreHabitants;
    }

    public char getCategorie() {
        return categorie;
    }

    public static int getNbreInstancesBis() { // est aussi déclaré en static: Toutes les méthodes de classe n'utilisant que des variabes de classe doivent etre declarées en static
                                               // on les appelle des methodes de classe, car il n'y en a qu'une pour toutes les instances.
                                              // ce n'est plus une methode classe si elle utilise des variables d'instance en plus des variables de classe.
        return nbreInstancesBis;
    }

//************** MUTATEURS ***************


    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public void setNbreHabitants(int nbre) {
        this.nbreHabitants = nbre;
        this.setCategorie();
    }

    private void setCategorie() {

        int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};

        char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        int i = 0;
        while (i<bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i] )
            i++;

        this.categorie = categories[i];
    }






}