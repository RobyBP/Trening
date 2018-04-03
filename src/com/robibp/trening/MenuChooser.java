package com.robibp.trening;

import java.util.Scanner;

class MenuChooser {

    public MenuEnum askUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unos / Evidencija / Izlaz");

        MenuEnum odabir = null;
        while (odabir == null) {
            odabir = toMenuEnum(scanner.nextLine());

            if (odabir == null) {
                System.out.println("Krivi unos, probajte ponovo");
            }
        }

        return odabir;
    }

    /**
     * Mapper koji mappira String parametar u MenuEnum ili null ako se ne moze mapirati
     *
     * @param korisnickiUnos String parametar koju mapiramo u MenuEnum
     * @return MenuEnum koji smo dobili iz String parametra ili null ako se ne moze mappirati
     */
    private MenuEnum toMenuEnum(String korisnickiUnos) {
        MenuEnum odabir = null;

        if (korisnickiUnos.equalsIgnoreCase("Unos")) {
            odabir = MenuEnum.UNOS;
        } else if (korisnickiUnos.equalsIgnoreCase("Evidencija")) {
            odabir = MenuEnum.EVIDENCIJA;
        } else if (korisnickiUnos.equalsIgnoreCase("Izlaz")) {
            odabir = MenuEnum.IZLAZ;
        }

        return odabir;
    }

}
