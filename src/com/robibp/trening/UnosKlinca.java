package com.robibp.trening;

class UnosKlinca {

    Klinac unos() {
        Klinac noviKlinac = new Klinac();

        UnosImena unosImena = new UnosImena();
//        UnosGodina unosGodina = new UnosGodina();
//        UnosKilaze unosKilaze = new UnosKilaze();

        String ime = unosImena.unosImena();

        if (ime == null) {
            return null;
        }

        noviKlinac.setIme(ime);
//        noviKlinac.setGodine(unosGodina.unosGodina());
//        noviKlinac.setKilaza(unosKilaze.unosKilaze());

        return noviKlinac;
    }

}
