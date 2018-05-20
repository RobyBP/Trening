package com.robibp.trening;

import java.util.Scanner;

public class UnosKilaze {
    Scanner scanner = new Scanner(System.in);
    String noviKlinac;
    TextValidationUtils textValidation = new TextValidationUtils();

    int unosKilaze() {
        String kilazaKlinca = null;
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
                }
            }

        }

        return Integer.parseInt(kilazaKlinca);
    }
}
