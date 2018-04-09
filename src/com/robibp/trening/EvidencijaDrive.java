package com.robibp.trening;

import java.util.ArrayList;
import java.util.Scanner;

class EvidencijaDrive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuChooser menuChooser = new MenuChooser();
        MenuEnum odabraniMenu = null;
        while (odabraniMenu != MenuEnum.IZLAZ) {

            switch (menuChooser.askUser()) {
                case UNOS:
                    System.out.println("Odabrali ste UNOS!");
                    break;
                case EVIDENCIJA:
                    System.out.println("Odabrali ste EVIDENCIJA!");
                    break;
                case IZLAZ:
                    System.out.println("Odabrali ste IZLAZ!");
                    odabraniMenu = MenuEnum.IZLAZ;
                    break;
            }
        }
    }

}