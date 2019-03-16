package David;

public class Guerrier extends Personnage {

    public Guerrier(int niveau, int force, int agilite, int intelligence) {
        super(niveau, force, agilite, intelligence);
    }

    public String toString(){
        return "SALUT ! Je suis le puissant guerrier ";
    }

    public int attSpe(Guerrier guerrier) {
        int dommage = getVie() - getForce();
        return dommage;
    }
}
