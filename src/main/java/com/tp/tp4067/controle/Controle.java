package com.tp.tp4067.controle;


public abstract class Controle {
    protected String valeur = "";
    protected Formulaire directeur;
    protected String nom;

    public Controle(String nom) {
        this.nom = nom;
    }

    public abstract void saisie();

    public String getNom() {
        return nom;
    }

    public void setDirecteur(Formulaire directeur) {
        this.directeur = directeur;
    }

    public String getValeur() {
        return valeur;
    }

    protected void modifie() {
        directeur.controleModifie(this);
    }
}
