package com.robibp.trening;

import java.util.Scanner;

class UnosKlinca {


    Klinac unos() {
        Klinac noviKlinac = new Klinac();
        TextValidationUtils textValidation = new TextValidationUtils();
        Scanner scanner = new Scanner(System.in);
        String imeKlinca = null;
        String godineKlinca = null;
        String kilazaKlinca = null;
        while (imeKlinca == null) {
            System.out.println("Unesite ime klinca");
            imeKlinca = scanner.nextLine();
            if (!textValidation.samoSlova(imeKlinca)) {
                System.out.println("Ime mora biti samo slova");
                imeKlinca = null;
            } else {
                noviKlinac.setIme(imeKlinca);

            }
        }
        while (godineKlinca == null) {
            System.out.println("Unesite godine klinca: ");
            godineKlinca = scanner.nextLine();
            if (!textValidation.samoBrojevi(godineKlinca)) {
                System.out.println("Unos moze biti samo cjelobrojni broj");
                godineKlinca = null;
            } else {
                if (Integer.parseInt(godineKlinca) <= 0) {
                    System.out.println("Godine ne mogu biti manje ili jednake nuli!");
                    godineKlinca = null;
                } else {
                    noviKlinac.setGodine(Integer.parseInt(godineKlinca));
                }
            }

        }
        while (kilazaKlinca == null) {
            System.out.println("Unesite kilazu klinca: ");
            kilazaKlinca = scanner.nextLine();
            if (!textValidation.samoBrojevi(kilazaKlinca)) {
                System.out.println("Unos moze biti samo cjelobrojni broj");
                kilazaKlinca = null;
            } else {
                if (Integer.parseInt(kilazaKlinca) <= 0) {
                    System.out.println("Kilaza ne moze biti manja ili jednaka nuli!");
                    kilazaKlinca = null;
                } else {
                    noviKlinac.setKilaza(Integer.parseInt(kilazaKlinca));
                }
            }

        }


        return noviKlinac;
    }


}