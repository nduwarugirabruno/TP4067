package com.tp.tp4067.document;

public class MonteurHTML extends MonteurLiasse {

    public MonteurHTML() {
        this.liasse = new LiasseHTML();
    }

    @Override
    public void monterDemande() {
        System.out.println("Monteur HTML...");
        super.monterDemande();
    }

    @Override
    public void monterCertificat() {
        System.out.println("Monteur HTML...");
        super.monterCertificat();
    }

    @Override
    public void monterBon() {
        System.out.println("Monteur HTML...");
        super.monterBon();
    }
}
