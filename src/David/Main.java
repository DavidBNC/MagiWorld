package David;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Personnage joueur1 = new Personnage("Joueur 1");
        Personnage guerrier = new Guerrier("");
        Personnage rodeur = new Rodeur("");
        Personnage mage = new Mage("");

        System.out.println("Création du personnage " + joueur1.nomDuPerso);
        System.out.println("Choisissez la classe de votre personnage :" + " 1- " + guerrier.getClass().getSimpleName()
        + " 2- " + rodeur.getClass().getSimpleName() + " 3- " + mage.getClass().getSimpleName());

        System.out.println("Niveau du personnage ?");
        joueur1.niveau = sc.nextInt();
        System.out.println("Force du personnage ?");
        joueur1.force = sc.nextInt();
        System.out.println("Agilite du personnage ?");
        joueur1.agilite = sc.nextInt();
        System.out.println("Intelligence du personnage ?");
        joueur1.intelligence = sc.nextInt();
        joueur1.vie = joueur1.niveau * 5;
        System.out.println("Je suis un personnage " + joueur1.nomDuPerso +  " de niveau " + joueur1.niveau + " je possède "
                + joueur1.vie + " de vitalité, " + joueur1.force + " de force, " + joueur1.agilite + " d'agilité et "
                + joueur1.intelligence + " d'intelligence !");


        Personnage joueur2 = new Personnage("Joueur 2");

        System.out.println("Création du personnage " + joueur2.nomDuPerso);
        System.out.println("Choisissez la classe de votre personnage :" + " 1- " + guerrier.getClass().getSimpleName()
                + " 2- " + rodeur.getClass().getSimpleName() + " 3- " + mage.getClass().getSimpleName());

        System.out.println("Niveau du personnage ?");
        joueur2.niveau = sc.nextInt();
        System.out.println("Force du personnage ?");
        joueur2.force = sc.nextInt();
        System.out.println("Agilite du personnage ?");
        joueur2.agilite = sc.nextInt();
        System.out.println("Intelligence du personnage ?");
        joueur2.intelligence = sc.nextInt();
        joueur2.vie = joueur2.niveau * 5;
        System.out.println("Je suis un personnage " + joueur2.nomDuPerso +  " de niveau " + joueur2.niveau + " je possède "
                + joueur2.vie + " de vitalité, " + joueur2.force + " de force, " + joueur2.agilite + " d'agilité et "
                + joueur2.intelligence + " d'intelligence !");
    }
}
