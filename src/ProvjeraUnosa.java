class ProvjeraUnosa {
    void provjera(String prviUnos){
        UnosIliEvidencija povratak = new UnosIliEvidencija();
        UnosClana clan = new UnosClana();
        if (prviUnos.equalsIgnoreCase("Unos")){
            clan.noviClan();
        }
        else if(prviUnos.equalsIgnoreCase("Evidencija")){
            System.out.println("Trenutno nemamo nikakvu Bazu podataka :(");
            povratak.odabir();
        }
        else{
            System.out.println("Morate unjeti Unos ili evidencija!");
            povratak.odabir();
        }
    }
    void josJedanClan(String odgovor){
        UnosIliEvidencija pocetak = new UnosIliEvidencija();
        UnosClana povratak = new UnosClana();
        if(odgovor.equals("Da")){
            povratak.noviClan();
        }
        else{
            pocetak.odabir();
        }
    }
}
