package com.tp.tp4067.societe;

import java.util.ArrayList;
import java.util.List;

public class SocieteMere extends Societe {
    protected List<Societe> filiales;

    public SocieteMere() {
        this.filiales = new ArrayList<>();
    }

    public double calculeCoutEntretien() {
        double cout = 0.0;
        for (Societe filiale : filiales)
            cout = cout + filiale.calculeCoutEntretien();
        return cout + nbrVehicules * coutUnitVehicule;
    }

    public boolean ajouteFiliale(Societe filiale) {
        return filiales.add(filiale);
    }

    public int getFilialeCount() {
        return filiales.toArray().length;
    }

    public Societe getFiliale(int indice) {
        return filiales.get(indice);
    }

    public Societe removeFiliale(int indice) {
        return filiales.remove(indice);
    }

}
