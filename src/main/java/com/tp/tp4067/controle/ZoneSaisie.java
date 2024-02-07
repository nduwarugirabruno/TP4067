package com.tp.tp4067.controle;

import java.util.Scanner;

public class ZoneSaisie extends Controle {
    Scanner reader = new Scanner(System.in);

    public ZoneSaisie(String nom) {
        super(nom);
    }

    public void saisie() {
        System.out.print("Saisie de " + nom + ": ");
        valeur = reader.nextLine();
        this.modifie();
    }
}