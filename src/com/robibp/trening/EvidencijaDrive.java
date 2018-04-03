package com.robibp.trening;

class EvidencijaDrive {

    public static void main(String[] args) {
        MenuChooser menuChooser = new MenuChooser();

        switch (menuChooser.askUser()){
            case UNOS:
                System.out.println("Odabrali ste UNOS!");
                break;
            case EVIDENCIJA:
                System.out.println("Odabrali ste EVIDENCIJA!");
                break;
            case IZLAZ:
                System.out.println("Odabrali ste IZLAZ!");
                return;
        }
    }

}