/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dod98
 */
public class Player {
   
   public String name;
   public int maxhp;
   public int currenthp;
   public int att;
   public int def;
   public int str;
   public int dex;
   public int spch;
   public Weapon weapon;
   public Armour armour;
   public List<Item> inventory = new ArrayList<>();

    public Player(String name, int hp, int att, int def, int str, int dex, int spch, Weapon weapon, Armour armour) {
        this.name = name;
        this.maxhp = hp;
        this.maxhp = currenthp;
        this.att = att;
        this.def = def;
        this.str = str;
        this.dex = dex;
        this.spch = spch;
        this.weapon = weapon;
        this.armour = armour;
    }

    

    public Item getWeapon() {
        return weapon;
    }

    

    public Item getArmour() {
        return armour;
    }

    public void equipArmour(Armour armour) {
        this.armour = armour;
    }
    
    public void equipWeapon(Weapon weapon) {
        int type = weapon.getType();
        if(type ==1){
            att = weapon.getDmg()+str;
        }
        if(type ==2) {
        att = weapon.getDmg()+dex;}
        
        else{
            System.out.println("The weapon is broken");
            inventory.remove(weapon);
        }
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return currenthp;
    }

    public void setHp(int hp) {
        this.currenthp = hp;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getSpch() {
        return spch;
    }

    public void setSpch(int spch) {
        this.spch = spch;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }
    
    
    
    
   

}
