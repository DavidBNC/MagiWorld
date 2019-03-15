package David;

public class Rodeur extends Personnage {

    public Rodeur(int niveau, int force, int agilite, int intelligence) {
        super(niveau, force, agilite, intelligence);
    }
    public String toString() {
        return "Hey, je suis le rodeur ";
    }
}
