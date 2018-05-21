package com.robibp.trening;

import java.util.Scanner;

public class UnosImena {

    private Scanner scanner = new Scanner(System.in);

    String unosImena() {

        while (true) {
            System.out.println("Unesite ime klinca");

            String imeKlinca = scanner.nextLine();

            if (TextValidationUtils.isBreak(imeKlinca)) {
                return null;
            } else if (TextValidationUtils.samoSlova(imeKlinca)) {
                return imeKlinca;
            } else {
                System.out.println("Ime mora biti samo slova");
            }
        }

    }
}
