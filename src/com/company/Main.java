package com.company;

public class Main {

    public static void main(String[] args) throws DocStrException {
        try {
            Doc.containsLet(" "); // проверка на null
        } catch (NullPointerException e) {
            System.out.println("Исключение:" + e);
        } catch (DocStrException e) {
            e.printStackTrace();
        }
        try {
            Doc.containsLet("1111-yyy-2222"); // проверка на неверный формат DOC: короткий или длинный номер документа
        } catch (DocStrException e) {
            System.out.println(e.getMessage());
        }

        Doc.containsLet("ABCc-yyy-1232-xxx-1x2t"); // проверка на abc без учета регистра

        try {
            Doc.beginsNum(" ");
        }
        catch (NullPointerException e) {
            System.out.println("Исключение:" + e);
        } catch (DocStrException e) {
            e.printStackTrace();
        }
        try {
            Doc.beginsNum("1111-yyy-2222-xxx"); // проверка на неверный формат DOC: короткий или длинный номер документа
        } catch (DocStrException e) {
            System.out.println(e.getMessage());
        }
        Doc.beginsNum("555c-yyy-1232-xxx-1x2t");

        try {
            Doc.endNumLet(" ");
        }
        catch (NullPointerException e) {
            System.out.println("Исключение:" + e);
        } catch (DocStrException e) {
            e.printStackTrace();
        }
        try {
            Doc.endNumLet("1111-yyy-2222-xxx-2b"); // проверка на неверный формат DOC: короткий или длинный номер документа
        } catch (DocStrException e) {
            System.out.println(e.getMessage());
        }
        Doc.endNumLet("555c-yyy-1232-xxx-1a2b");
    }
}
