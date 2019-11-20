package lib;

import java.util.ArrayList;
import java.util.Iterator;

public class Register implements Iterable<Name> {
    private ArrayList<Name> reg;

    public Register() {

        reg = new ArrayList<Name>();
    }

    public void addName(Name n) {

        reg.add(n);
    }

    public Name removeName(int pos) {

        return reg.remove(pos);
    }

    public Name getName(int pos) {

        return reg.get(pos);
    }

    public int registerSize() {

        return reg.size();
    }

    public void clearRegister() {

        reg.clear();
    }

    public boolean isRegisterEmpty() {

        return reg.isEmpty();
    }

    public boolean searchRegisterByFamilyName(String s) {

        return reg.stream().anyMatch(n -> n.getFamilyName().equals(s));
    }

    public int countFirstNameOccurrences(char c) {

        return (int) reg.stream().filter(n -> n.getFirstName().endsWith(String.valueOf(c))).count();
    }

    @Override
    public String toString() {

        return "Register:[" + "reg=" + reg + ']';
    }

    @Override
    public Iterator<Name> iterator() {

        return reg.iterator();
    }
}
