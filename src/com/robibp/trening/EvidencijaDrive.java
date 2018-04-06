package com.robibp.trening;

import java.util.Scanner;

class EvidencijaDrive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuChooser menuChooser = new MenuChooser();
        Klinac[] imena = new Klinac[100];

        switch (menuChooser.askUser()){
            case UNOS:
                System.out.println("Odabrali ste UNOS!");
                System.out.println("Unesite ime clana");
                imena[0] = new Klinac();
                imena[0].setIme(scanner.nextLine());
                menuChooser.askUser();
                break;
            case EVIDENCIJA:
                System.out.println("Odabrali ste EVIDENCIJA!");
                break;
            case IZLAZ:
                System.out.println("Odabrali ste IZLAZ!");
                System.out.println(imena[0].getIme());
                return;
        }
    }

}