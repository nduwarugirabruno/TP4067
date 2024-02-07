package com.tp.tp4067.commande;

public class CommandeComptant extends Commande {
    public CommandeComptant(double montant) {
        super(montant);
    }

    @Override
    protected void calculeTva() {

    }

    @Override
    public void payer() {
        System.out.println("Le paiement de la commande au comptant de : " + montantHt + " est effectué.");
    }

    @Override
    public boolean valide() {
        setState("validée");
        return true;
    }
}
