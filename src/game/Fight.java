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
    public HealPotion healPotion;
    
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
        while(enemy.getCurrenthp()>0){//nothinh
            if(player.currenthp >0){
            System.out.println(enemy.getEName + " has " //need to create getEName toi get monster's name 
                    + enemy.getCurrenthp()
                    + " HP left.");
            System.out.println("Please choose from the following Options: 1(Attack), 2(Flee), 3(Use Heal potion)");
            // create input for options
            int optionNum = in.scanner();
            switch(optionNum){
                case 1 :
                    enemy.setCurrenthp(enemy.getCurrenthp()- player.getAtt());
                    return enemy.setCurrenthp();
                    System.out.println("You have attacked with " + player.weapon 
                            +  " and dealt " + player.getAtt() + " demanage.");
                    break;
                case 2:
                    // write run method after room builder is done
                case 3:
                    player.setHp(player.currenthp + healPotion.hpeffect);
                    if(player.setHp()>player.maxhp){
                        player.setHp()== player.maxhp;
                        return player.setHp();
                    }
                    System.out.println("You have used a Heal Potion and helaed yourself " + healPotion.hpeffect
                    + "HP and are now at " + player.currenthp
                    + " from " + player.maxhp
                    + " maximal HP");
                    break;
            }
            player.setHp(enemy.);
            }
            else{
                System.out.println("GAME OVER");
                System.exit(0);
            }
        }
    }
}