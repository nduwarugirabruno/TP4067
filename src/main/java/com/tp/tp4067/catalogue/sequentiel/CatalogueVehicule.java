package com.tp.tp4067.catalogue.sequentiel;

import java.util.List;

public class CatalogueVehicule extends Catalogue<Vehicule, IterateurVehicule> {
    public CatalogueVehicule(List<Vehicule> vehiculeList) {
        contenu.addAll(vehiculeList);
        contenu.add(new Vehicule("véhicule bon marché", 1000));
        contenu.add(new Vehicule("petit véhicule bon marché", 5000));
        contenu.add(new Vehicule("véhicule grande qualité", 10000));
    }

    protected IterateurVehicule creeIterateur() {
        return new IterateurVehicule();
    }
}
