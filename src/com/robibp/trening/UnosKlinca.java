package com.robibp.trening;

import java.util.InputMismatchException;
import java.util.Scanner;

class UnosKlinca {


    Klinac unos() {
        Klinac noviKlinac = new Klinac();
        Scanner scanner = new Scanner(System.in);
        String imeKlinca = null;
        String godineKlinca = null;
        while (imeKlinca == null) {
            System.out.println("Unesite ime klinca");
            imeKlinca = scanner.nextLine();
            if (!samoSlova(imeKlinca)) {
                System.out.println("Ime mora biti samo slova");
                imeKlinca = null;
            } else {
                noviKlinac.setIme(imeKlinca);

            }
        }
        while (godineKlinca == null) {
            System.out.println("Unesite godine klinca: ");
            godineKlinca = scanner.nextLine();
            if (!samoBrojevi(godineKlinca)) {
                System.out.println("Unos moze biti samo cjelobrojni broj");
                godineKlinca = null;
            }
            else{
                if(Integer.parseInt(godineKlinca)<= 0){
                    System.out.println("Godine ne mogu biti manje ili jednake nuli!");
                    godineKlinca = null;
                }
                else {
                    noviKlinac.setGodine(Integer.parseInt(godineKlinca));
                }
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

    private boolean samoBrojevi(String godine) {
        boolean cijeliBroj = false;
        try {
            Integer.parseInt(godine);
            cijeliBroj = true;
        } catch (NumberFormatException exception) {
        }
        return cijeliBroj;
    }
}