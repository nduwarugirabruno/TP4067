package com.tp.tp4067.vehicule;

public class VehiculeElectric extends Vehicule {
    @Override
    public Automobile createAuto(String desc, double prix) {
        return new AutomobileElectric(desc, prix);
    }

    @Override
    public Scooter createScooter(String desc, double prix) {
        return new ScooterElectric(desc, prix);
    }
}
