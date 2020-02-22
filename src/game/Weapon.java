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
    boolean equipped;
    int type;
 
    public Weapon(String name, String desc, int dmg, int type) {
        super(name, desc);
        this.dmg =dmg;
        this.type = type;
    }

    public int getDmg() {
        return dmg;
    }

    public boolean isEquipped() {
        return equipped;
    }

    public int getType() {
        return type;
    }
    
    
    public void setEquiped(boolean equiped) {
        this.equiped = equiped;
    }
    
    
    
    public Weapon dagger(){
       Weapon dagger = new Weapon("Dagger","A short short-sword", 3,2);
       return dagger;
    }
    
    
    
}
