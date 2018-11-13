package edu.wctc.jsadi;

/**
 * This abstract class implements Character and defines a CharacterDecorator
 * Created by jsadi on 11/12/2018
 * @author Jordan Sadi
 * @version 2018 1112 1
 */
abstract class CharacterDecorator implements Character {
    protected Character tempCharacter;

    /**
     * This constructor defines a CharacterDecorator
     * Each CharacterDecorator is initialized with a specified Character
     * @param tempCharacter Character the specified Character
     */
    public CharacterDecorator(Character tempCharacter) {
        this.tempCharacter = tempCharacter;
    }

    /**
     * This method returns the name of a Character
     * @return String the name of the Character
     */
    public String getName() {
        return tempCharacter.getName();
    }

    /**
     * This method returns the health of a Character
     * @return double the health of the Character
     */
    public double getHealth() {
        return tempCharacter.getHealth();
    }
}