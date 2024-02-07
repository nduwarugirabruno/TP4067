package com.tp.tp4067.controle;

import java.util.Scanner;

public class Bouton extends Controle {
    Scanner reader = new Scanner(System.in);

    public Bouton(String nom) {
        super(nom);
    }

    public void saisie() {
        System.out.print("Désirez-vous activer le bouton " + nom + " ?(oui/non): ");
        String response = reader.nextLine();
        if (response.equals("oui"))
            this.modifie();
    }
}