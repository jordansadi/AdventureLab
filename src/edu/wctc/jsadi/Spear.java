package edu.wctc.jsadi;

/**
 * This class extends CharacterDecorator and defines a Spear
 * Created by jsadi on 11/12/2018
 * @author Jordan Sadi
 * @version 2018 1112 1
 */
public class Spear extends CharacterDecorator {
    /**
     * This constructor defines a Character with a Spear
     * Each Spear is initialized with a specified Character who will utilize the Spear
     * @param tempCharacter the specified Character
     */
    public Spear(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * This method returns the name of a Character and adds a title indicating they are using a Spear
     * @return String the name of the Character
     */
    public String getName() {
        return tempCharacter.getName() + " The Spear Thrower";
    }

    /**
     * This method modifies the health of a Character by an amount specific to the Spear class
     * It then returns the new amount
     * @return double the new health of the Character
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 5;
    }
}