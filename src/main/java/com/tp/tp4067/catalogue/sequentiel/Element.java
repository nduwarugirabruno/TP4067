package com.tp.tp4067.catalogue.sequentiel;

public abstract class Element {

    protected String description;
    protected double prix;

    public Element(String description, double prix) {
        setDescription(description);
        setPrix(prix);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public boolean motCleValide(String motCle) {
        return description.contains(motCle);
    }
}
