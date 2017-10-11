/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickboxing;

import static java.lang.Math.abs;

/**
 *
 * @author kingJ
this class is going to create the base stats for all for the fighters

*/
abstract public class FightStats 
{
     String name;
   int kick;
     int punch;
     int knee;
     int elbow;
     int speed;
     int defense;
     int damage;
     int health;// player and boss health attack defents damges


public String getName()
{
    return name;
}

public int getKick()
{
    return kick;
}

public int getPunch()
{
    return punch;
}
public int getKnee()
{
    return knee;
}

public int getElbow()
{
    return elbow;
}public int getSpeed()
{
    return speed;
}
public int getDefense()
{
    return defense;
}
public int getDamge()
{
    return damage;
}
public int getHealth()
{
    return health;
}
public void setName(String pn)
{
    name=pn;

}


public void setKick(int k)
{
    kick=k;

}

public void setPunch(int p)
{
    punch=p;

}


public void setKnee(int kn)
{
    knee=kn;

}
public void setElbow(int e)
{
    elbow=e;

}
public void setSpeed(int s)
{
    speed=s;

}
public void setDefense(int def)
{
    defense=def;

}
public  void setDamage(int d)
{
    damage=d;
}
public void setHealth(int h)
{
    health=h;

}

//the player speed is randomly created at the being of every fight
public void createPlayerSpeed(FightStats targetSpeed)
{ int i;
  targetSpeed.setSpeed(i=(int) (Math.round(Math.random() * 10 + 1)));//create playerspeed for the whole fight
}
public void createDefense( FightStats target)
{
    int i;
    target.setDefense(i=(int) (Math.round(Math.random() * 12 + 1)));
   
}

//end createPlayerSpeed
//     
//public void performAttack(FightStats target)
//{
//    int damages;
//    if()      
//    damages=this.attack-abs(target.getDefense());
//    if(damages<0){
//        damages=0;
//        System.out.println("Attack missed lol");
//    }
//    target.setDamage(damages);
//    target.setHealth(target.getHealth()-target.getDamage());
//         
//}
    public void performKick(FightStats target)
{
    int damages;
     
    damages=this.kick-abs(target.getDefense());
    if(damages<0){
        damages=0;
        System.out.println("Attack missed lol");
    }
    target.setDamage(damages);
    target.setHealth(target.getHealth()-target.getDamge());
         
}
       public void performPunch(FightStats target)
{
    int damages;
     
    damages=this.punch-abs(target.getDefense());
    if(damages<0){
        damages=0;
        System.out.println("Attack missed lol");
    }
    target.setDamage(damages);
    target.setHealth(target.getHealth()-target.getDamge());
         
}
           public void performKnee(FightStats target)
{
    int damages;
     
    damages=this.knee-abs(target.getDefense());
    if(damages<0){
        damages=0;
        System.out.println("Attack missed lol");
    }
    target.setDamage(damages);
    target.setHealth(target.getHealth()-target.getDamge());
         
}   
  public void performElbow(FightStats target)
{
    int damages;
     
    damages=this.elbow-abs(target.getDefense());
    if(damages<0){
        damages=0;
        System.out.println("Attack missed lol");
    }
    target.setDamage(damages);
    target.setHealth(target.getHealth()-target.getDamge());
         
} 
}//end FightStats class
