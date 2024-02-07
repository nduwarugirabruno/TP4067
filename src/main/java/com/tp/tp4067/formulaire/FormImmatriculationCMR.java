package com.tp.tp4067.formulaire;

public class FormImmatriculationCMR extends FormulaireImmatriculation {
    public FormImmatriculationCMR(FormulaireImpl implantation) {
        super(implantation);
    }

    protected boolean controleSaisie(String plaque) {
        return (plaque.length() >= 7) && (plaque.length() <= 8);
    }
}

