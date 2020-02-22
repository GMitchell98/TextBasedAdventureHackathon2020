/*
 * This is the fighting class which will create and simulate the fights
 */
package game;
/*package game.enemies;*/

import game.enemies.Enemy;
import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Thanatos
 */
public class Fight {

    public Player player;
    public Enemy enemy;
    
    //get the Player informations
    public Player getPlayer(){
        return player;
    }
    //get the Enemy informations
    public Enemy getEnemy(){
        return enemy;
    }
   // Create the Fight instance/flow
    public void setFight(){
        while(enemy.getCurrenthp()>0){
            if(player.currenthp >0){
            System.out.println(enemy.getEName + " has " //need to create getEName toi get monster's name 
                    + enemy.getCurrenthp()
                    + " HP left.");
            System.out.println("Please choose from the following Options: 1(Attack), 2(Flee), 3(Open Inventar)");
            // create input for options
            }
            else{
                System.out.println("GAME OVER");
                System.exit(0);
            }
        }
    }
    public void 
}