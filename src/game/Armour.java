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
public class Armour extends Item {
    int def;
    int type;
    boolean equipped;
    
    public Armour(String name, String desc,int def, int type ) {
        super(name, desc);
        this.def =def;
        this.type=type;
    }

    public boolean isEquipped() {
        return equipped;
    }

    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
    }

    public int getType() {
        return type;
    }
    
    
    
    public int getDef() {
        return def;
    }

    
}
