package com.tp.tp4067.commande;

public abstract class Commande {
    protected double montantHt;
    protected double montantTva;
    protected double montantTtc;
    protected String state;

    public Commande(double montantHt) {
        this.montantHt = montantHt;
    }

    public void calculeMontantTtc() {
        this.calculeTva();
        montantTtc = montantHt + montantTva;
        this.setState("en cours");
    }

    protected abstract void calculeTva();

    public abstract boolean valide();

    public abstract void payer();

    public void setState(String state) {
        this.state = state;
    }
}
