package com.robibp.trening;

import java.util.ArrayList;
import java.util.List;

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

                    Klinac noviUnos = unosKlinca.unos();
                    if (noviUnos != null) {
                        klinci.add(noviUnos);
                    }

                    break;
                case EVIDENCIJA:
                    System.out.println("Odabrali ste EVIDENCIJA!");
                    for (Klinac klinac : klinci) {
                        System.out.println(klinac);
                    }
                    break;
                case IZLAZ:
                    System.out.println("Odabrali ste IZLAZ!");
                    break;
            }
        }
    }

}