package lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * A Register is an Aggregation of Names. As an ArrayList, it has many methods of the List super Class, which it
 * inherits like: add, remove, get, clear etc.
 * A Register also implements Iterable, so it can have an iterator, which makes it a target for a for-each loop.
 *
 * @author P2424629
 */
public class Register implements Iterable<Name> {

    // Fields

    private ArrayList<Name> reg;

    // Constructors

    /**
     * Default constructor for the Register class. It creates an empty Register of type ArrayList that accepts Names
     * Objects.
     */
    public Register() {

        reg = new ArrayList<Name>();
    }

    // Methods

    /**
     * Add a Name object "n" to the Register "reg".
     *
     * @param n The Name object to be added to the Register.
     */
    public void addName(Name n) {

        reg.add(n);
    }

    /**
     * Removes and Returns the Name object at given index "pos".
     *
     * @param pos The position, as index, to remove and return a Name object from.
     * @return The Name object at position "pos".
     */
    public Name removeName(int pos) {

        return reg.remove(pos);
    }

    /**
     * Returns the Name object at the given index "pos".
     *
     * @param pos The position, as index, to return a Name object from.
     * @return The Name object at position "pos".
     */
    public Name getName(int pos) {

        return reg.get(pos);
    }

    /**
     * Returns the size (length) of the Register "reg".
     *
     * @return Integer representing the size (length) of the Register "reg".
     */
    public int registerSize() {

        return reg.size();
    }

    /**
     * Removes all the Names objects in the Register.
     */
    public void clearRegister() {

        reg.clear();
    }

    /**
     * Returns "True" if the Register is empty, otherwise "False".
     *
     * @return Boolean value representing if the Register is empty or not.
     */
    public boolean isRegisterEmpty() {

        return reg.isEmpty();
    }

    /**
     * Returns "True" if the given String "s" is contained in any of the Name objects' family name in the Register,
     * otherwise "False".
     *
     * @param s The String to search the Register for family names.
     * @return Boolean value representing if the given String "s" is contained in the Register's family names.
     */
    public boolean searchRegisterByFamilyName(String s) {

        return reg.stream().anyMatch(n -> n.getFamilyName().equals(s));
    }

    /**
     * Returns the count of times of occurrences the given character "c" shown as the last character of the
     * Name objects' first names in the Register.
     *
     * @param c The character the first names must ended with to be counted.
     * @return The number of counts, as Integer, of first names ending with character "c" in the Register.
     */
    public int countFirstNameOccurrences(char c) {

        return (int) reg.stream().filter(n -> n.getFirstName().endsWith(String.valueOf(c))).count();
    }

    /**
     * Sort lexicographically the Register by delegate to the Name Class, which itself implements the Comparable
     * Interface.
     */
    public void sortRegister() {

        Collections.sort(reg);
    }

    /**
     * Returns a String representation of the Register by delegate to Name Class, which it will call the toString method
     * of all the Name objects.
     *
     * @return All the Name objects in the Register, as firstname and familyname.
     */
    @Override
    public String toString() {

        return "Register:[" + "reg=" + reg + ']';
    }

    /**
     * Returns an Iterator, which makes the Register a target for a for-each loop and adds the methods of hasNext, next
     * and remove.
     *
     * @return Iterator of the Register.
     */
    @Override
    public Iterator<Name> iterator() {

        return reg.iterator();
    }

}
