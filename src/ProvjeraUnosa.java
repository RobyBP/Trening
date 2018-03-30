class ProvjeraUnosa {
    void provjera(String prviUnos){
        UnosIliEvidencija povratak = new UnosIliEvidencija();
        if (prviUnos .equals("Unos") || prviUnos.equals("Evidencija")){
            System.out.println("...");
        }
        else{
            System.out.println("Morate unjeti Unos ili evidencija!");
            povratak.odabir();
        }
    }
}
