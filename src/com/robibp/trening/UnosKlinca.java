package com.robibp.trening;

import java.util.Scanner;

class UnosKlinca {


    Klinac unos() {
        Klinac noviKlinac = new Klinac();
        Scanner scanner = new Scanner(System.in);
        String imeKlinca = null;
        while (imeKlinca == null) {
            System.out.println("Unesite ime klinca");
            imeKlinca = scanner.nextLine();
            if (!samoSlova(imeKlinca)) {
                System.out.println("Ime mora biti samo slova");
            } else {
                noviKlinac.setIme(imeKlinca);
                break;
            }

        }
        return noviKlinac;
    }

    private boolean samoSlova(String ime) {
        char[] slova = ime.toCharArray();

        for (char slovo : slova) {
            if (!Character.isLetter(slovo)) {
                return false;
            }
        }

        return true;
    }
}