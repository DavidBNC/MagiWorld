package David;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Personnage guerrier = new Guerrier(0, 0, 0, 0);

        System.out.println("Création du personnage Joueur 1");
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
        int choix = sc.nextInt();
        System.out.println("Niveau du personnage :");
        guerrier.setNiveau(sc.nextInt());
        System.out.println("Force du personnage :");
        guerrier.setForce(sc.nextInt());
        System.out.println("Agilité du personnage :");
        guerrier.setAgilite(sc.nextInt());
        System.out.println("Intelligence du personnage :");
        guerrier.setIntelligence(sc.nextInt());
        System.out.println("Je suis le guerrier de niveau " + guerrier.getNiveau() + ", j'ai " + guerrier.getVie() +
                " de vitalité, " + guerrier.getForce() + " de force, " + guerrier.getAgilite() + " d'agilité et " + guerrier.getIntelligence() +
                " d'intelligence.");
    }
}
