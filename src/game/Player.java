/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.Items.Armour;
import game.Items.Weapon;
import game.Items.Item;
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
   public Weapon weapon;
   public Armour armour;
   public List<Item> inventory = new ArrayList<>();

    public Player(String name, int str, int dex) {
        this.name = name;
        this.str = str;
        this.dex = dex;
        inventory.clear();
        maxhp = 10 + str%2 +dex%2;
        currenthp=maxhp;
        att=5;
        def=5;  
    }

    

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        if(weapon.isEquipped()== true){
            System.out.println("You have already got this equipped");
        }
        else{
            this.weapon = weapon;
            weapon.setEquipped(true);
            if(weapon.getType()==1){
                att =weapon.getDmg() +str;
            }
            if(weapon.getType()==2){
                att = weapon.getDmg()+dex;
            }
            else{
                System.out.println("The weapon is broken");
                inventory.remove(weapon);
            }
        }
    }

    public Item getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        if(armour.isEquipped()== true){
           System.out.println("You have already got this equipped");
        }
        else{
            this.armour = armour;
            armour.setEquipped(true);
            if(armour.getType()==1){
                def =armour.getDef() +str;
                dex-=5;
            }
            if(armour.getType()==2){
                def = armour.getDef() +dex;
                str-=5;
            }
            else{
                System.out.println("The armour is broken");
                inventory.remove(armour);
            }
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


    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }
    
    
    
    
   

}
