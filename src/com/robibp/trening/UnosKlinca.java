package com.robibp.trening;

import java.util.Scanner;

class UnosKlinca {


    Klinac unos() {
        Klinac noviKlinac = new Klinac();
        TextValidationUtils textValidation = new TextValidationUtils();
        Scanner scanner = new Scanner(System.in);
        UnosImena imeKlinca = new UnosImena();
        UnosGodina godineKlinca = new UnosGodina();
        UnosKilaze kilazaKlinca = new UnosKilaze();
        noviKlinac.setIme(imeKlinca.unosImena());
        noviKlinac.setGodine(godineKlinca.unosGodina());
        noviKlinac.setKilaza(kilazaKlinca.unosKilaze());

        return noviKlinac;
    }


}