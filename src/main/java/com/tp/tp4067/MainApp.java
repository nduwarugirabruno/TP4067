package com.tp.tp4067;

import com.tp.tp4067.catalogue.Vehicule;
import com.tp.tp4067.config.DataLoader;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainApp {

    public static void main(String[] args) {

        List<Vehicule> vehiculeList = DataLoader.getInstance().loadData();

        System.out.println("                                                                                          ");
        System.out.println("        **************************************************************************        ");
        System.out.println("        **** Annee académique                           Université de yaounde ****        ");
        System.out.println("        **** 2023/2024                                   Faculté des Sciences ****        ");
        System.out.println("        ****                                       Département d'Informatique ****        ");
        System.out.println("        ****                                                                  ****        ");
        System.out.println("        ****                           ~TP INF4067~                           ****        ");
        System.out.println("        ****                         ~DESIGN PATTERN~                         ****        ");
        System.out.println("        ****                                                                  ****        ");
        System.out.println("        ****  Participants: TOUKAM Aurel, NDUWARUGIRA Bruno et MARRE Yasmine  ****        ");
        System.out.println("        **************************************************************************        ");
        System.out.println("                                                                                          ");

        switch (menuP()) {
            case 1 -> System.out.println("Case 1");
            case 2 -> System.out.println("Case 2");
            case 3 -> System.out.println("Case 3");
            default -> System.out.println("Case Default");
        }
    }

    private static int menuP() {
        int choix;
        Scanner scanner = new Scanner(System.in);
        System.out.println("                             *******MENU PRINCIPAL********                                ");
        System.out.println("        --------------------------------------------------------------------------        ");
        System.out.println("        __________________________________________________________________________        ");
        System.out.println("        1- Voir le catalogue des véhicules........................................        ");
        System.out.println("        2- .......................................................................        ");
        System.out.println("        9- Quitter................................................................        ");
        System.out.println("        Quel est votre choix ???................");

        choix = scanner.nextInt();
        scanner.nextLine();
        while (choix < 1 || choix > 9) {
            System.out.println("Choix invalide... Choisissez l'option entre 1 ou 9 !!!");
            System.out.println("        Quel est votre choix ???................");
            choix = scanner.nextInt();
            scanner.nextLine();
        }
        return choix;
    }
}
