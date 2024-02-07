package com.tp.tp4067.societe;

public class SocieteSansFiliale extends Societe {
    public boolean ajouteFiliale(Societe filiale) {
        return false;
    }

    public double calculeCoutEntretien() {
        return nbrVehicules * coutUnitVehicule;
    }
}
