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
public class HealPotion extends Item {
    
    int hpeffect;

    public HealPotion(int hpeffect, String name, String desc) {
        super(name, desc);
        this.hpeffect = hpeffect;
    }
    
}
