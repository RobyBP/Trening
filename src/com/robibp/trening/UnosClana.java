package com.robibp.trening;

import java.util.Scanner;

class UnosClana {
    void noviClan(){
        Scanner upis = new Scanner(System.in);
        System.out.println("Unesite Ime i prezima clana: ");
        String clan = upis.nextLine();
        System.out.println("Unjeli ste clana " + clan);
        System.out.println("Zelite li unjeti jos jednog clana?");
    }
}
