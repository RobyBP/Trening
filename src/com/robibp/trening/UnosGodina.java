package com.robibp.trening;

import java.util.Scanner;

public class UnosGodina {

    Scanner scanner = new Scanner(System.in);
    String noviKlinac;
    TextValidationUtils textValidation = new TextValidationUtils();

    public int unosGodina() {
        String godineKlinca = null;
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
                }

            }

        }

        return Integer.parseInt(godineKlinca);
    }
}

