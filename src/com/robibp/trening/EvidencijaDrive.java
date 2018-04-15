package com.robibp.trening;

import java.util.ArrayList;
import java.util.Scanner;

class EvidencijaDrive {

    public static void main(String[] args) {
        UnosKlinca provjeraUnosa = new UnosKlinca();
        Scanner scanner = new Scanner(System.in);
        MenuChooser menuChooser = new MenuChooser();
        MenuEnum odabraniMenu = null;
        ArrayList<Klinac> klinci = new ArrayList<>();
        while (odabraniMenu != MenuEnum.IZLAZ) {
            odabraniMenu = menuChooser.askUser();
            switch (odabraniMenu) {
                case UNOS:
                    System.out.println("Odabrali ste UNOS!");
                    String klinac = provjeraUnosa.validacijaImena();
                    
                    break;
                case EVIDENCIJA:
                    System.out.println("Odabrali ste EVIDENCIJA!");
                    break;
                case IZLAZ:
                    System.out.println("Odabrali ste IZLAZ!");
                    break;
            }
        }
    }

}