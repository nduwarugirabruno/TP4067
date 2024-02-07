package com.tp.tp4067.document;

public class MonteurPDF extends MonteurLiasse {

    public MonteurPDF() {
        this.liasse = new LiassePDF();
    }

    @Override
    public void monterDemande() {
        System.out.println("Monteur PDF...");
        super.monterDemande();
    }

    @Override
    public void monterCertificat() {
        System.out.println("Monteur PDF...");
        super.monterCertificat();
    }

    @Override
    public void monterBon() {
        System.out.println("Monteur PDF...");
        super.monterBon();
    }
}
