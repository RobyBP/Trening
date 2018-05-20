package com.robibp.trening;

import java.util.Scanner;

public class UnosImena {
    Scanner scanner = new Scanner(System.in);
    String noviKlinac;
    TextValidationUtils textValidation = new TextValidationUtils();
    String unosImena(){
        String imeKlinca = null;
        while (imeKlinca == null)

        {
            System.out.println("Unesite ime klinca");
            imeKlinca = scanner.nextLine();
            if (!textValidation.samoSlova(imeKlinca)) {
                System.out.println("Ime mora biti samo slova");
                imeKlinca = null;
            } else {
                noviKlinac = imeKlinca;

            }
        }
        return noviKlinac;

    }
}
