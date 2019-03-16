package David;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Personnage joueur1 = new Personnage(0,0,0,0);
        Personnage guerrier1 = new Guerrier(0,0,0,0);
        Personnage rodeur1 = new Rodeur(0,0,0,0);
        Personnage mage1 = new Mage(0,0,0,0);

        System.out.println("Création du personnage Joueur 1");
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
        int choixPerso1 = sc.nextInt();
        System.out.println("Niveau du personnage :");
        joueur1.setNiveau(sc.nextInt());
        System.out.println("Force du personnage :");
        joueur1.setForce(sc.nextInt());
        System.out.println("Agilité du personnage :");
        joueur1.setAgilite(sc.nextInt());
        System.out.println("Intelligence du personnage :");
        joueur1.setIntelligence(sc.nextInt());
        if (choixPerso1 == 1)
            System.out.println(guerrier1.toString() + " de niveau " + joueur1.getNiveau() + ", j'ai " + joueur1.getVie() +
                    " de vitalité, " + joueur1.getForce() + " de force, " + joueur1.getAgilite() + " d'agilité et " + joueur1.getIntelligence() +
                    " d'intelligence.");
        else if (choixPerso1 == 2)
            System.out.println(rodeur1.toString() + " de niveau " + joueur1.getNiveau() + ", j'ai " + joueur1.getVie() +
                    " de vitalité, " + joueur1.getForce() + " de force, " + joueur1.getAgilite() + " d'agilité et " + joueur1.getIntelligence() +
                    " d'intelligence.");
        else if (choixPerso1 == 3)
            System.out.println(mage1.toString() + " de niveau " + joueur1.getNiveau() + ", j'ai " + joueur1.getVie() +
                    " de vitalité, " + joueur1.getForce() + " de force, " + joueur1.getAgilite() + " d'agilité et " + joueur1.getIntelligence() +
                    " d'intelligence.");
        else
            System.err.println("Vous n'avez pas choisi de classe.");

        Personnage joueur2 = new Personnage(0,0,0,0);
        Personnage guerrier2 = new Guerrier(0,0,0,0);
        Personnage rodeur2 = new Rodeur(0,0,0,0);
        Personnage mage2 = new Mage(0,0,0,0);

        System.out.println("Création du personnage Joueur 2");
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
        int choixPerso2 = sc.nextInt();
        System.out.println("Niveau du personnage :");
        joueur2.setNiveau(sc.nextInt());
        System.out.println("Force du personnage :");
        joueur2.setForce(sc.nextInt());
        System.out.println("Agilité du personnage :");
        joueur2.setAgilite(sc.nextInt());
        System.out.println("Intelligence du personnage :");
        joueur2.setIntelligence(sc.nextInt());
        if (choixPerso2 == 1)
            System.out.println(guerrier2.toString() + " de niveau " + joueur2.getNiveau() + ", j'ai " + joueur2.getVie() +
                    " de vitalité, " + joueur2.getForce() + " de force, " + joueur2.getAgilite() + " d'agilité et " + joueur2.getIntelligence() +
                    " d'intelligence.");
        else if (choixPerso2 == 2)
            System.out.println(rodeur2.toString() + " de niveau " + joueur2.getNiveau() + ", j'ai " + joueur2.getVie() +
                    " de vitalité, " + joueur2.getForce() + " de force, " + joueur2.getAgilite() + " d'agilité et " + joueur2.getIntelligence() +
                    " d'intelligence.");
        else if (choixPerso2 == 3)
            System.out.println(mage2.toString() + " de niveau " + joueur2.getNiveau() + ", j'ai " + joueur2.getVie() +
                    " de vitalité, " + joueur2.getForce() + " de force, " + joueur2.getAgilite() + " d'agilité et " + joueur2.getIntelligence() +
                    " d'intelligence.");
        else
            System.err.println("Vous n'avez pas choisi de classe.");

        System.out.println("");
        System.out.println("Joueur 1 (" + joueur1.getVie() + " Vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");


    }
}
