package com.company;

import java.util.Locale;

public class Doc {
    String string;

    public Doc(String string) {
        this.string = string; // конструктор
    }

    public static void containsLet (String doc) throws DocStrException {
        if (doc == null || doc.trim().isEmpty()) {
            throw new NullPointerException("Exception: is null!");
        }
        if (doc.length() != 22) {
            throw new DocStrException("Exception: Incorrect format Doc");
        }

        if (doc.toLowerCase(Locale.ROOT).contains("abc".toLowerCase(Locale.ROOT))) {
            System.out.println("Содержит");
        }
            else {
            System.out.println("Не содержит");
        }
    }

    public static void beginsNum (String doc) throws DocStrException {
        if (doc == null || doc.trim().isEmpty()) {
            throw new NullPointerException("Exception: is null!");
        }
        if (doc.length() != 22) {
            throw new DocStrException("Exception: Incorrect format Doc");
        }
        System.out.println(doc.indexOf("555"));
    }

    public static void endNumLet(String doc) throws DocStrException {
        if (doc == null || doc.trim().isEmpty()) {
            throw new NullPointerException("Exception: is null!");
        }
        if (doc.length() != 22) {
            throw new DocStrException("Exception: Incorrect format Doc");
        }
        System.out.println(doc.lastIndexOf("1a2b"));
    }
}
