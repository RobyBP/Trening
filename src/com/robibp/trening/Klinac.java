package com.robibp.trening;

public class Klinac {

    private String ime;
    private int godine;
    private int kilaza;

    public int getKilaza() {
        return kilaza;
    }

    public void setKilaza(int kilaza) {
        this.kilaza = kilaza;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "Klinac{" +
                "ime='" + ime + '\'' +
                ", godine=" + godine +
                ", kilaza=" + kilaza +
                '}';
    }
}
