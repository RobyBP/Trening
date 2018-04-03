package com.robibp.trening;

import java.util.Scanner;

class MenuChooser {

    public MenuEnum askUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unos / Evidencija / Izlaz");

        MenuEnum odabir = null;
        while (odabir == null) {
            String korisnickiUnos = scanner.nextLine();

            if (korisnickiUnos.equalsIgnoreCase("Unos")) {
                odabir = MenuEnum.UNOS;
            } else if (korisnickiUnos.equalsIgnoreCase("Evidencija")) {
                odabir = MenuEnum.EVIDENCIJA;
            } else if (korisnickiUnos.equalsIgnoreCase("Izlaz")) {
                odabir = MenuEnum.IZLAZ;
            } else {
                System.out.println("Krivi unos, probajte ponovo");
            }
        }

        return odabir;
    }

}
