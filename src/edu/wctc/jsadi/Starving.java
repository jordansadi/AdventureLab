package edu.wctc.jsadi;

/**
 * This class extends CharacterDecorator and defines the Starving trait
 * Created by jsadi on 11/12/2018
 * @author Jordan Sadi
 * @version 2018 1112 1
 */
public class Starving extends CharacterDecorator {
    /**
     * This constructor defines a Character who is Starving
     * Each Starving Character is initialized with a specified Character who will be Starving
     * @param tempCharacter the specified Character
     */
    public Starving(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * This method returns the name of a Character and adds a title indicating they are Starving
     * @return String the name of the Character
     */
    public String getName() {
        return tempCharacter.getName() + " The Hungry";
    }

    /**
     * This method modifies the health of a Character by an amount specific to the Starving class
     * It then returns the new amount
     * @return double the new health of the Character
     */
    public double getHealth() {
        return tempCharacter.getHealth() - 10;
    }
}