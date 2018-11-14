package edu.wctc.jsadi;

/**
 * This is the driver class for this package.
 * It creates a Character with a Spear and Sword, then prints its name and health.
 * It then creates a Starving Character with a Spear, Sword, and Shield and prints its name and health.
 * Created by jsadi on 11/12/2018
 * @author Jordan Sadi
 * @version 2018 1112 1
 */
public class Main {

    public static void main(String[] args) {
        Character basicCharacter = new Spear(new Sword(new BasicCharacter("Bilbo")));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Health: " + basicCharacter.getHealth());
        Character everythingCharacter = new Spear(new Sword(new Shield(new Starving(new BasicCharacter("Jordan")))));
        System.out.println("Name: " + everythingCharacter.getName());
        System.out.println("Health: " + everythingCharacter.getHealth());
    }
}