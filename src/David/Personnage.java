package David;

public class Personnage {

    protected int niveau;
    protected int force;
    protected int agilite;
    protected int intelligence;
    protected int vie;

    public Personnage(int niveau, int force, int agilite, int intelligence) {
        this.niveau = niveau;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getVie() {
        vie = niveau * 5;
        return vie;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public String toString(){
        return "Je suis un Personnage";
    }


    public int attSpe(int dommage) {
        return dommage;
    }

    public int attBas(int effect){
        return effect;
    }
}
