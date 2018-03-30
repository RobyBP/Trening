import java.util.Scanner;

class UnosIliEvidencija {
    void odabir(){
        ProvjeraUnosa provjera = new ProvjeraUnosa();
        Scanner reader = new Scanner(System.in);
        System.out.println("Za unos novog člana unesite 'Unos', a za evidenciju članova unesite 'Evidencija'");
        String unos = reader.nextLine();
        provjera.provjera(unos);
    }

}
