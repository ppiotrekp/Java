package pl.ppyrczak;

import org.apache.commons.lang.mutable.MutableInt;

public class FirstBank {
    public static void main(String[] args) {
        Account account = new Account("Tim", "D01", (2000));
        Account account1 = new Account("Phil Collins", "D02", 3000000);
        System.out.println("Welcome " + account1.getName());
        account1.showMenu();
    }


}
