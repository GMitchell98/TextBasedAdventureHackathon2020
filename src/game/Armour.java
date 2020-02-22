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
    
    public Armour(String name, String desc,int def ) {
        super(name, desc);
        this.def =def;
        this.name = name;
        this.description=desc;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
}
