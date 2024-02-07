package com.tp.tp4067.vehicule;

public abstract class Vehicule {
    public abstract Automobile createAuto(String desc, double prix);

    public abstract Scooter createScooter(String desc, double prix);
}
