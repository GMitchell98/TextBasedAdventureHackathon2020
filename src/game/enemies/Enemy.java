/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.enemies;

/**
 *
 * @author dod98
 */
public class Enemy {
    String name;
    int maxhp;
    int currenthp = maxhp;
    int exp;
    String desc;

    public Enemy(String name,String desc, int maxhp, int exp) {
        this.name = name;
        this.maxhp = maxhp;
        this.exp = exp;
        this.desc = desc;
    }

    public void setCurrenthp(int currenthp) {
        this.currenthp = currenthp;
    }
    
    /* 
    
    
    
     ----------- Just going to make Enemies here -------------
    
   
    */
    public Enemy Goblin() {
        Enemy Goblin = new Enemy("Goblin", "A small green goblin",10,10);
        return Goblin;
    }
    
    
    public Enemy Orc() {
        Enemy Orc = new Enemy("Orc","A mediums sized goblin",20,20);
        return Orc;
    }
    
    public Enemy Troll(){
        Enemy Troll = new Enemy("Troll","This goblin looks like he has eaten all the other goblins", 30,30);
        return Troll;
    }
    
    
}
