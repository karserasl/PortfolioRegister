package main;

import lib.Name;
import lib.Register;

/**
 * Program to execute a specific job and test some Register Class methods.
 *
 * @author P2424629
 */
public class RegisterApp {

    /**
     * Program to remove the second Name object (index 1) of the Register "reg", add a new Name object "n" to the
     * Register "reg" at the end of the Register, and return a String of all the names in Register that have their
     * family name length being >= 5 letters in the format "LASTNAME," + the capitalised initial of the first name.
     *
     * @param reg The Register of Names as ArrayList.
     * @param n   The Name object to be added at the end of the Register.
     * @return A String containing all the names in Register "reg" that have their family name length be greater or
     * equals to 5 letters in the format "LASTNAME, " + the capitalised initial of the first name, followed by new line.
     */
    public static String execute(Register reg, Name n) {

        reg.removeName(1);
        reg.addName(n);
        StringBuilder s = new StringBuilder();
        for (Name name : reg) {
            if (name.getFamilyName().length() >= 5) {
                s.append(name.getFamilyName().toUpperCase());
                s.append(", ");
                s.append(name.getFirstName().toUpperCase().charAt(0));
                s.append("\n");
            }
        }

        return s.toString();
    }
}