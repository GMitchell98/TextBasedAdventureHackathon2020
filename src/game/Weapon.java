/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author dod98
 */
public class Weapon  extends Item{
    
    int dmg;
 
    public Weapon(String name, String desc, int dmg) {
        super(name, desc);
        this.dmg =dmg;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    
    
    
    
    
    
}
