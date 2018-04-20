package com.robibp.trening;

import java.util.Scanner;

class UnosKlinca {


    public Klinac unos() {
        Klinac imeKlinca = new Klinac();
        Scanner scanner = new Scanner(System.in);
        String klinac = null;
        while (klinac == null) {
            System.out.println("Unesite ime klinca");
            if (samoSlova(scanner.nextLine())) {
                System.out.println("Ime mora biti samo slova");
            } else {
               imeKlinca.setIme(klinac);
            }

        }
        return imeKlinca;
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