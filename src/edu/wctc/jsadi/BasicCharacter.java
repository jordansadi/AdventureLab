package edu.wctc.jsadi;

/**
 * This class implements Character and defines a BasicCharacter
 * Created by jsadi on 11/12/2018
 * @author Jordan Sadi
 * @version 2018 1112 1
 */
public class BasicCharacter implements Character {
    private String name;
    private double health;

    /**
     * This constructor defines a BasicCharacter
     * Each BasicCharacter is initialized with a specified name and a health of zero
     * @param name String the intended name of the Character
     */
    public BasicCharacter(String name) {
        this.name = name;
        this.health = 0;
    }

    /**
     * This method returns the name of a BasicCharacter
     * @return String the name of the BasicCharacter
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns the health of a BasicCharacter
     * @return double the health of the BasicCharacter
     */
    public double getHealth() {
        return health;
    }
}