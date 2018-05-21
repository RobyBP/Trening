package com.robibp.trening;

import java.util.Scanner;

public class UnosImena {

    private Scanner scanner = new Scanner(System.in);
    private String noviKlinac;

    String unosImena() {
        String imeKlinca = null;

        while (imeKlinca == null) {
            System.out.println("Unesite ime klinca");
            imeKlinca = scanner.nextLine();
            if (!TextValidationUtils.samoSlova(imeKlinca)) {
                System.out.println("Ime mora biti samo slova");
                imeKlinca = null;
            } else {
                noviKlinac = imeKlinca;
            }
        }
        return noviKlinac;

    }
}
