package com.tp.tp4067.formulaire;

public class FormImmatriculationGB extends FormulaireImmatriculation {
    public FormImmatriculationGB(FormulaireImpl implantation) {
        super(implantation);
    }

    protected boolean controleSaisie(String plaque) {
        return plaque.length() == 5;
    }
}
