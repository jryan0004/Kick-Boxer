/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickboxing;

import java.util.Scanner;

/**
 *
 * @author kingJ
 */
public class Player extends FightStats 
{
    public Player()
    { kick=10;
      punch=5;
      knee=6;
      elbow=6;
      speed=0;
      name="";
      //defense;
      health =25;
    }//player
    

    
    public Player(int kick ,int punch,int knee,int elbow ,String name, int speed ,int defense,int health)
    {
        this.kick=kick;
        this.punch=punch;
        this.knee=knee;
        this.elbow=elbow;
        this.name=name;
        this.speed=speed;
        this.defense=defense;
        this.health=health;
        
       }
    
  public void createPlayerName(Player pn , CPUFighter CPU){
        
      System.out.println("Please create a name for your character");
     //Boss wolf = new Boss();//used the instane of the boss class
      Scanner kb = new Scanner(System.in);//getting info from the keybored
      pn.setName( name = kb.nextLine());//gets name from user and saves it
      System.out.println("Hello " +pn.getName()+ "you are fighting "+ CPU.getName());//uses saved name.  }
      //System.out.println("omg " + n.getName()+"\n"+ w.getName());//

  }//end createPlayerName

    
}//end player class
