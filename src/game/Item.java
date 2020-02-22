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
public class Item {
    
    public String name;
    public String description;
    public boolean equiped;
    
    
    public Item (String name, String desc){
        this.description = desc;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }

    
    
    
    
    
    
    
}
