package com.tp.tp4067.document;

public abstract class MonteurLiasse {
    protected Liasse liasse;

    public MonteurLiasse() {
        super();
    }

    public Liasse getLiasse() {
        return liasse;
    }

    public void monterDemande() {
        System.out.println("Montage de la Demande.");
    }

    public void monterCertificat() {
        System.out.println("Montage du certificat.");
    }

    public void monterBon() {
        System.out.println("Montage du Bon.");
    }
}
