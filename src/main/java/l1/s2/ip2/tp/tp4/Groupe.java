package l1.s2.ip2.tp.tp4;

public class Groupe {
    private Cellule chefDeFile;

    /**
     * Question 2.1: Un constructeur qui crée un groupe vide
     */
    public Groupe(){
        this.chefDeFile = null;
    }

    /**
     * Question 3.1 : Une méthode qui permet d'afficher la description de tout le groupe.
     */
    public void afficher(){
        if(this.chefDeFile != null) {
            System.out.println("Le chef : " + this.chefDeFile);
        }else{
            System.out.println("Il n'a pas de chef ds le group");
        }
    }

    public void ajouteNouveau(){

    }
}
