package com.tp.tp4067.catalogue;

public class Vehicule extends Sujet {
    protected String description;
    protected double prix;

    public Vehicule(String description, double prix) {
        setDescription(description);
        setPrix(prix);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.notifie();
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
        this.notifie();
    }

}
