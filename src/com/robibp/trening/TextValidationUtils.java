package com.robibp.trening;

public class TextValidationUtils {

    private TextValidationUtils() {
    }

    public static boolean samoSlova(String ime) {
        char[] slova = ime.toCharArray();

        for (char slovo : slova) {
            if (!Character.isLetter(slovo)) {
                return false;
            }
        }

        return true;
    }

    public static boolean samoBrojevi(String godine) {
        try {
            Integer.parseInt(godine);
            return true;
        } catch (NumberFormatException exception) {
        }
        return false;
    }

    public static boolean isBreak(String text) {
        return text.equals("-");
    }
}
