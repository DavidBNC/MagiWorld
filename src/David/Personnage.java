package David;


public class Personnage {

    String nomDuPerso;
    int niveau;
    int vie;
    int force;
    int agilite;
    int intelligence;

    public Personnage(String nomDuPerso) {
        this.nomDuPerso = nomDuPerso;
        this.niveau = 0;
        this.vie = 5;
        this.force = 0;
        this.agilite = 0;
        this.intelligence = 0;

}
    public Personnage(int niveau, int vie, int force, int agilite, int intelligence) {
        this.niveau = niveau;
        this.vie = vie;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }

    public void choixClasse(int nbClasse){
        switch (nbClasse){
            case 1:
                System.out.println("Guerrier");
                break;
            case 2:
                System.out.println("Rodeur");
                break;
            case 3:
                System.out.println("Mage");
                break;
            default:
                System.out.println("Inconnu");
                break;
        }
    }
}
