package com.robibp.trening;

public class TextValidationUtils {

    public boolean samoSlova(String ime) {
        char[] slova = ime.toCharArray();

        for (char slovo : slova) {
            if (!Character.isLetter(slovo)) {
                return false;
            }
        }

        return true;
    }

    public boolean samoBrojevi(String godine) {
        boolean cijeliBroj = false;
        try {
            Integer.parseInt(godine);
            cijeliBroj = true;
        } catch (NumberFormatException exception) {
        }
        return cijeliBroj;
    }
}
