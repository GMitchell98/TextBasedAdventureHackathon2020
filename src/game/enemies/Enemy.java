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

    public Enemy(String name, int maxhp, int exp) {
        this.name = name;
        this.maxhp = maxhp;
        this.exp = exp;
    }

    public void setCurrenthp(int currenthp) {
        this.currenthp = currenthp;
    }
    
    /* 
    
    
    
     ----------- Just going to make Enemies here -------------
    
   
    */
    public Enemy Goblin() {
        Enemy Goblin = new Enemy("Goblin",10,10);
        return Goblin;
    }
    
    
    public Enemy Orc() {
        Enemy Orc = new Enemy("Orc",20,20);
        return Orc;
    }
    
    public Enemy Troll(){
        Enemy Troll = new Enemy("Troll", 30,30);
        return Troll;
    }
    
    
}
