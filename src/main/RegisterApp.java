package main;

import lib.Name;
import lib.Register;

public class RegisterApp {


    public static String execute(Register reg, Name n) {

        reg.removeName(1);
        reg.addName(n);
        StringBuilder s = new StringBuilder();
        for (Name name : reg) {
            if (name.getFamilyName().length() >= 5) {
                s.append(name.getFamilyName().toUpperCase())
                        .append(", ")
                        .append(name.getFirstName().charAt(0))
                        .append("\n");
            }
        }

        return s.toString();
    }
}