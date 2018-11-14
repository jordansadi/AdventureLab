package edu.wctc.jsadi;

/**
 * This class extends CharacterDecorator and defines a Sword
 * Created by jsadi on 11/12/2018
 * @author Jordan Sadi
 * @version 2018 1112 1
 */
public class Sword extends CharacterDecorator {
    /**
     * This constructor defines a Character with a Sword
     * Each Sword is initialized with a specified Character who will utilize the Sword
     * @param tempCharacter the specified Character
     */
    public Sword(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * This method returns the name of a Character and adds a title indicating they are using a Sword
     * @return String the name of the Character
     */
    public String getName() {
        return tempCharacter.getName() + " The Sword Handler";
    }

    /**
     * This method modifies the health of a Character by an amount specific to the Sword class
     * It then returns the new amount
     * @return double the new health of the Character
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 10;
    }
}