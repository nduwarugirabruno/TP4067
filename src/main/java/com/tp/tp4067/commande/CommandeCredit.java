package com.tp.tp4067.commande;

public class CommandeCredit extends Commande {
    public CommandeCredit(double montant) {
        super(montant);
    }

    @Override
    protected void calculeTva() {

    }

    @Override
    public void payer() {
        if (valide()) {
            setState("validée");
            System.out.println("Le paiement de la commande au crédit de : " + montantHt + " est effectué.");
        } else System.out.println("Demande de crédit impossible... Voici les bornes [1000.0, 5000.0]");
    }

    @Override
    public boolean valide() {
        return (montantHt >= 1000.0) && (montantHt <= 5000.0);
    }
}
