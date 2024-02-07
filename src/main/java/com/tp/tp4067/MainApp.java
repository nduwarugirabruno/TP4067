package com.tp.tp4067;

import com.tp.tp4067.catalogue.Vehicule;
import com.tp.tp4067.config.DataLoader;
import com.tp.tp4067.vehicule.VehiculeElectric;
import com.tp.tp4067.vehicule.VehiculeEssence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainApp {

    static List<Vehicule> vehiculeList = DataLoader.getInstance().loadData();

    public static void main(String[] args) {

        System.out.println("                                                                                          ");
        System.out.println("******************************************************************************************");
        System.out.println("**** Annee académique                                           Université de yaounde ****");
        System.out.println("**** 2023/2024                                                   Faculté des Sciences ****");
        System.out.println("****                                                       Département d'Informatique ****");
        System.out.println("****                                                                                  ****");
        System.out.println("****                                   ~TP INF4067~                                   ****");
        System.out.println("****                                 ~DESIGN PATTERN~                                 ****");
        System.out.println("****                                                                                  ****");
        System.out.println("****          Participants: TOUKAM Aurel, NDUWARUGIRA Bruno et MARRE Yasmine          ****");
        System.out.println("******************************************************************************************");
        System.out.println("                                                                                          ");
        Scanner scanner = new Scanner(System.in);
        String rep = "";
        do {
            switch (menuPrincipal()) {
                case 1 -> printArray((ArrayList<?>) vehiculeList);
                case 2 -> {
                    if (menuCreation() == 1) {
                        VehiculeElectric vehiculeElectric = new VehiculeElectric();
                        System.out.print("Description: ");
                        String descriptif = scanner.nextLine();
                        System.out.print("Prix: ");
                        double prix = scanner.nextDouble();
                        scanner.nextLine();

                        Vehicule vehicule = vehiculeElectric.createAuto(descriptif, prix);
                        vehiculeList.add(vehicule);
                        System.out.print("Added" + vehicule);
                    } else {
                        VehiculeEssence vehiculeEssence = new VehiculeEssence();
                        System.out.print("Description: ");
                        String descriptif = scanner.nextLine();
                        System.out.print("Prix: ");
                        double prix = scanner.nextDouble();
                        scanner.nextLine();

                        Vehicule vehicule = vehiculeEssence.createAuto(descriptif, prix);
                        vehiculeList.add(vehicule);
                        System.out.print("Added" + vehicule);
                    }
                }
                case 3 -> {
                    System.out.println("Commande initialisée....");

                    if (menuCommande() > 0) {
                        Vehicule vehicule = vehiculeList.get(menuCommande() - 1);
                        System.out.print("Commande: ");
                        int commande = scanner.nextInt();
                        scanner.nextLine();
                    }
                }
                case 9 -> DataLoader.getInstance().saveData((ArrayList<?>) vehiculeList);
                default -> System.out.println("Case Default");
            }

            System.out.print("\nVoulez-vous continuer ? O/N : ");
            rep = scanner.nextLine();
        } while (rep.charAt(0) == 'o' || rep.charAt(0) == 'O' || rep.charAt(0) == 'Y' || rep.charAt(0) == 'y');

    }

    private static int menuPrincipal() {
        int choix;
        Scanner scanner = new Scanner(System.in);
        System.out.println("                            ******* MENU PRINCIPAL ********                               ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("1- Voir le catalogue des véhicules........................................................");
        System.out.println("2- Créer un nouveau vehicule .............................................................");
        System.out.println("3- Commander un vehicule .................................................................");
        System.out.println("9- Sauvegarder et quitter ................................................................");
        System.out.print("Quel est votre choix ??? ");

        choix = scanner.nextInt();
        scanner.nextLine();
        while (choix < 1 || choix > 9) {
            System.out.println("Choix invalide... Choisissez l'option entre 1 ou 9 !!!");
            System.out.print("Quel est votre choix ???................");
            choix = scanner.nextInt();
            scanner.nextLine();
        }
        return choix;
    }

    private static int menuCreation() {
        int choix;
        Scanner scanner = new Scanner(System.in);
        System.out.println("                             ******* MENU CREATION *******                                ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("1- Vehicule Electric......................................................................");
        System.out.println("2- Vehicule à Essence.....................................................................");
        System.out.println("3- Retour.................................................................................");
        System.out.print("Quel est votre choix ??? ");

        choix = scanner.nextInt();
        scanner.nextLine();
        while (choix < 1 || choix > 3) {
            System.out.println("Choix invalide... Choisissez l'option entre 1 ou 9 !!!");
            System.out.print("Quel est votre choix ???................");
            choix = scanner.nextInt();
            scanner.nextLine();
        }
        return choix;
    }

    private static int menuCommande() {
        int choix;
        Scanner scanner = new Scanner(System.in);
        System.out.println("                             ******* MENU COMMANDE *******                                ");
        System.out.println("------------------------------------------------------------------------------------------");
        for (int i = 0; i < vehiculeList.size(); i++) {
            System.out.println((i+1)+"- "+vehiculeList.get(i).getDescription()+"......................................................................");
        }
        System.out.print("Quel est votre choix ??? ");

        choix = scanner.nextInt();
        scanner.nextLine();
        while (choix < 1 || choix > vehiculeList.size()) {
            System.out.println("Choix invalide... Choisissez l'option entre 1 ou "+vehiculeList.size()+" !!!");
            System.out.print("Quel est votre choix ???................");
            choix = scanner.nextInt();
            scanner.nextLine();
        }
        return choix;
    }

    private static void printArray(ArrayList<?> list) {
        list.forEach(System.out::println);
    }

}
