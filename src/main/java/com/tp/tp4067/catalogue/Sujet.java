package com.tp.tp4067.catalogue;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujet {
    protected List<Observateur> observateurs;

    public Sujet(){
        observateurs = new ArrayList<>();
    }
    public void ajoute(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void retire(Observateur observateur) {
        observateurs.remove(observateur);
    }

    public void notifie() {
        for (Observateur observateur : observateurs)
            observateur.actualise();
    }

    @Override
    public String toString() {
        return "\nSujet:" +
                "\n\t\tobservateurs=" + observateurs;
    }
}
