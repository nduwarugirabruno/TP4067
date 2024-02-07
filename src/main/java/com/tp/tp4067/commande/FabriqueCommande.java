package com.tp.tp4067.commande;

public class FabriqueCommande {
    private static final int TYPE_COMMANDE_COMPTANT = 1;
    private static final int TYPE_COMMANDE_CREDIT = 2;

    public Commande getCommande(int typeCommande, double montant) {
        return switch (typeCommande) {
            case 1 -> new CommandeComptant(montant);
            case 2 -> new CommandeCredit(montant);
            default -> throw new IllegalArgumentException("Type de commande inconnu");
        };
    }
}
