package com.robibp.trening;

import java.util.Scanner;

public class UnosKilaze {

    private Scanner scanner = new Scanner(System.in);

    int unosKilaze() {
        String kilazaKlinca = null;
        while (kilazaKlinca == null) {
            System.out.println("Unesite kilazu klinca: ");
            kilazaKlinca = scanner.nextLine();
            if (!TextValidationUtils.samoBrojevi(kilazaKlinca)) {
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
