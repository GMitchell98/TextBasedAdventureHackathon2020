/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import game.enemies.Enemy;

/**
 *
 * @author Lewis
 */
public class Room {
    
    // ---- Fields ----
    
    private String directionFrom; // Some way of determining which way the
                                  // player has come from.
    private String title;
    private String description;
    private ArrayList<Item> loot;
    private Enemy enemy;
    private boolean hasNorth;
    private boolean hasEast;
    private boolean hasSouth;
    private boolean hasWest;
    
    // ---- Constructors ----
    
    public Room() {
        
    }
    
    public Room(String title, String description) {
        this.title = title;
        this.description = description;
    }
    
    // ---- Getters ----
    
    public String getTitle() {
        return this.title;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public ArrayList<Item> getLoot() {
        return this.loot;
    }
    
    public Enemy getEnemy() {
        return this.enemy;
    }
    
    public boolean hasNorth() {
        return this.hasNorth;
    }
    
    public boolean hasEast() {
        return this.hasEast;
    }
    
    public boolean hasSouth() {
        return this.hasSouth;
    }
    
    public boolean hasWest() {
        return this.hasWest;
    }
    
    // ---- Setters ----
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setLoot(ArrayList<Item> loot) {
        this.loot = loot;
    }
    
    public void addLoot(Item item) {
        this.loot.add(item);
    }
    
    public void removeLoot(Item item) {
        this.loot.remove(item);
    }
    
    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
    
    public void setNorth(boolean hasNorth) {
        this.hasNorth = hasNorth;
    }
    
    public void setEast(boolean hasEast) {
        this.hasEast = hasEast;
    }
    
    public void setSouth(boolean hasSouth) {
        this.hasSouth = hasSouth;
    }
    
    public void setWest(boolean hasWest) {
        this.hasWest = hasWest;
    }
    
    // ---- Methods ----
    
    public String displayRoomItems(ArrayList<Item> items) {
        String result = "You see the following items: ";
        
        for (Item item : items) {
            result += item.getName() + ", ";
        }
        
        return result;
    }
    
    // Methods for tutorial rooms.
    public void generateTutorialWeapons() {
        this.loot.add(new Weapon("Weathered Longsword", "A weathered longsword - it'll do.", 3, 1));
        this.loot.add(new Weapon("Weathered Battle Axe", "A weathered battle axe - it'll do.", 2, 2));
        this.loot.add(new Weapon("Weathered Bow", "A weathered bow - it'll do.", 3, 2));
    }
    
    public void generateTutorialArmour() {
        this.loot.add(new Armour("Weathered Iron Armour", "Weathered iron armour - it'll do.", 4, 1));
        this.loot.add(new Armour("Weathered Chainmail Armour", "Weathered chainmail armour - it'll do.", 3, 2));
        this.loot.add(new Armour("Weathered Leather Armour", "Weathered leather armour - it'll do.", 2, 2));
    }
    
    public void generateTutorialEnemy() {
        Enemy middleMan = new Enemy();
        this.enemy = middleMan.Goblin();
    }
    
    public void generateFirstTutorialRoom() {
        this.title = "Tutorial One";
        this.description = "A dark cave in which only a light hum can be heard. "
                + "Three weapons lie in the centre.";
        generateTutorialWeapons();
        this.setNorth(true);
        this.setEast(false);
        this.setSouth(false);
        this.setWest(false);
    }
    
    public void generateSecondTutorialRoom() {
        this.title = "Tutorial Two";
        this.description = "A dark cave in which a faint fumbling can be heard "
                + "in the next room. Three kinds of armour lie in the centre.";
        generateTutorialArmour();
        this.setNorth(true);
        this.setEast(false);
        this.setSouth(false);
        this.setWest(false);
    }
    
    public void generateThirdTutorialRoom() {
        this.title = "Tutorial Three";
        this.description = "The cave is lighter now. There is a way out at the "
                + "other side, but a dagger wielding goblin blocks your path.";
        generateTutorialEnemy();
        this.setNorth(true);
        this.setEast(false);
        this.setSouth(false);
        this.setWest(false);
    }
    
    // Methods for random rooms.
    
    public void generateRandomRoom(String fromDirection) {
        this.title = pickRandomTitle();
        this.description = pickRandomDescription();
        this.loot.add(pickRandomItem());
        this.enemy = pickRandomEnemy();
    }
    
    public String pickRandomTitle() {
        return "Hello";
    }
    
    public String pickRandomDescription() {
        return "Hello";
    }
    
    public Item pickRandomItem() {
        return new Item("Hello", "Hello");
    }
    
    public Enemy pickRandomEnemy() {
        double randomDouble = Math.random();
        randomDouble = randomDouble * 3 + 1;
        int randomInt = (int) randomDouble;
        
        Enemy spawnedEnemy = new Enemy();
        
        switch(randomInt) {
            case 1:
                spawnedEnemy = spawnedEnemy.Goblin();
            case 2:
                spawnedEnemy = spawnedEnemy.Orc();
            case 3:
                spawnedEnemy = spawnedEnemy.Troll();
        }
        
        return spawnedEnemy;
    }
    
    public void setRoomDirections() {
        
    }
    
}
