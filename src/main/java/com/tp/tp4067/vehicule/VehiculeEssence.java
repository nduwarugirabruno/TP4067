package com.tp.tp4067.vehicule;

public class VehiculeEssence extends Vehicule {

    @Override
    public Automobile createAuto(String desc, double prix) {
        return new AutomobileEssence(desc, prix);
    }

    @Override
    public Scooter createScooter(String desc, double prix) {
        return new ScooterEssence(desc, prix);
    }
}
