package com.tp.tp4067.catalogue.sequentiel;

public class Vehicule extends Element {
    public Vehicule(String description, double prix) {
        super(description, prix);
    }

    public void affiche() {
        System.out.println("Description du véhicule : " +
                description);
    }
}
