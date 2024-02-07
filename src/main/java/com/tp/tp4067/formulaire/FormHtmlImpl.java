package com.tp.tp4067.formulaire;

import java.util.Scanner;

public class FormHtmlImpl implements FormulaireImpl {
    Scanner reader = new Scanner(System.in);

    public void dessineTexte(String texte) {
        System.out.println("HTML : " + texte);
    }

    public String gereZoneSaisie() {
        return reader.next();
    }
}

