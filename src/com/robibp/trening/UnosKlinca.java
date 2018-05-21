package com.robibp.trening;

class UnosKlinca {


    Klinac unos() {
        Klinac noviKlinac = new Klinac();
        UnosImena imeKlinca = new UnosImena();
        UnosGodina godineKlinca = new UnosGodina();
        UnosKilaze kilazaKlinca = new UnosKilaze();
        noviKlinac.setIme(imeKlinca.unosImena());
        noviKlinac.setGodine(godineKlinca.unosGodina());
        noviKlinac.setKilaza(kilazaKlinca.unosKilaze());

        return noviKlinac;
    }


}