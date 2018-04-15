package com.robibp.trening;

import java.util.Scanner;

class UnosKlinca {

    private boolean samoSlova(String ime) {
        char[] slova = ime.toCharArray();

        for (char slovo : slova) {
            if (!Character.isLetter(slovo)) {
                return false;
            }
        }

        return true;
    }


    String validacijaImena() {
        Scanner scanner = new Scanner(System.in);
        String klinac = null;
        boolean upit;
        while (klinac == null) {
            System.out.println("Unesite ime klinca");
            upit = samoSlova(scanner.nextLine());
            if (upit == false){
                System.out.println("Ime mora biti samo slova");
            }
            else {
                klinac = klinac;
                return klinac;
            }

        }
        return klinac;
    }
}