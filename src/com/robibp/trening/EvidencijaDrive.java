package com.robibp.trening;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EvidencijaDrive {

    public static void main(String[] args) {
        UnosKlinca unosKlinca = new UnosKlinca();
        MenuChooser menuChooser = new MenuChooser();
        MenuEnum odabraniMenu = null;

        List<Klinac> klinci = new ArrayList<>();
        while (odabraniMenu != MenuEnum.IZLAZ) {
            odabraniMenu = menuChooser.askUser();
            switch (odabraniMenu) {
                case UNOS:
                    System.out.println("Odabrali ste UNOS!");
                    klinci.add(unosKlinca.unos());
                    break;
                case EVIDENCIJA:
                    System.out.println("Odabrali ste EVIDENCIJA!");
                    for (Klinac clan : klinci) {
                        System.out.println(clan);
                    }
                    break;
                case IZLAZ:
                    System.out.println("Odabrali ste IZLAZ!");
                    break;
            }
        }
    }

}