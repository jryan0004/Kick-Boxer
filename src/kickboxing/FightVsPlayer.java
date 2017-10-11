/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickboxing;

import static java.lang.Math.abs;
import java.util.*;
/**
 *
 * @author kingJ
 */
public class FightVsPlayer extends FightStats
{

 public void StartFight(Player p, CPUFighter CPU )
 {
    String moveset[] = {"kick", "punch","elbow","knee"};
    Scanner kb = new Scanner(System.in);
    String move;
    CPU.CreateCPUName(CPU);
    p.createPlayerName(p, CPU);
    p.createPlayerSpeed(p);
    CPU.createPlayerSpeed(CPU);
    System.out.println("LETS Fight");
     System.out.println(p.getName()+" Health "+p.getHealth()+"\n"+CPU.getName()+" Health "+CPU.getHealth());
    System.out.println(p.getName()+" Here is your moveset ");
 
    for (String moveset1 : moveset) {
            System.out.println(moveset1);
        } 
       
    do{
        p.createDefense(p);
        CPU.createDefense(CPU);
              System.out.println("Your  move");
              move =kb.nextLine();
              if(move.equalsIgnoreCase("kick"))
              {p.performKick(CPU);
                System.out.println(p.getName() +" kick "+CPU.getName()+" in the face");
                  System.out.println(CPU.getName()+" takes "+CPU.getDamge()+" in damage");       
              }
              else if(move.equalsIgnoreCase("punch"))
              {p.performPunch(CPU);
                   
              System.out.println(p.getName() +" punch "+CPU.getName()+" in the face");      
              System.out.println(CPU.getName()+" takes "+CPU.getDamge()+" in damage");    
              }
              else if(move.equalsIgnoreCase("knee"))
              {p.performKnee(CPU);
                  System.out.println(p.getName() +" knee "+CPU.getName()+" in the face");
                  System.out.println(CPU.getName()+" takes "+CPU.getDamge()+" in damage");    
              }
               if(move.equalsIgnoreCase("elbow"))
              {p.performElbow(CPU);
                    System.out.println(p.getName() +" elbow"+CPU.getName()+" in the face");
                   System.out.println(CPU.getName()+" takes "+CPU.getDamge()+" in damage");           
              }
               System.out.println(CPU.getName()+" health "+ CPU.getHealth());
               CPU.CPUMoveMaker(CPU,p);
               System.out.println("Your health " + p.getHealth());
        }while(p.getHealth()>=0&& CPU.getHealth()>=0);
    
    if(p.getHealth()>0)
    { System.out.println("You win");
    
    }//
    if(CPU.getHealth()>0)
    {
    
        System.out.println(CPU.getName()+" win");
    }
     
     
     
     
     
     
 }
    
}//end FightVsPlayer
