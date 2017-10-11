/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickboxing;

/**
 *
 * @author kingJ
 */
public class CPUFighter extends FightStats
{
    public CPUFighter()
    { int i;
      kick=10;
      punch=5;
      knee=6;
      elbow=6;
      speed=0;
      health = 25;
     // defense=0;
      name ="";
      
      
    }//CPUFIGTER CON
public CPUFighter(int kick ,int punch,int knee,int elbow ,String name, int speed,int health,int defense)
    { 
    
        this.kick=kick;
        this.punch=punch;
        this.knee=knee;
        this.elbow=elbow;
        this.name=name;
        this.speed=speed;
        this.health=health;
        this.defense=defense;
    }//end public CPUFighter(int kick ,int punch,int knee,int elbow ,String CPUName, int speed)


   //this method should pick a move a random that the computer will do. 
    public void CPUMoveMaker(CPUFighter CPU, Player p )
{
    int i;
    i=(int) (Math.round(Math.random() * 4 + 1));
     if(i==1)
     { CPU.performPunch(p);
         System.out.println(CPU.getName() +" punch you in the face");
         System.out.println(p.getName()+" takes "+p.getDamge()+" in damage");    
     } 
     else if (i==2)
     {
     
         CPU.performKick(p);
          System.out.println(CPU.getName() +" kick you in the face");
              System.out.println(p.getName()+" takes "+p.getDamge()+" in damage");    
     }else if(i==3)
     {
         CPU.performKnee(p);
         System.out.println(CPU.getName() +" knee you in the face");
             System.out.println(p.getName()+" takes "+p.getDamge()+" in damage");    
     }
     else if (i==4)
     {
     
     
         CPU.performElbow(p);
     System.out.println(CPU.getName() +" elbow you in the face");
         System.out.println(p.getName()+" takes "+p.getDamge()+" in damage");    
     }
     else
     {
     
         CPU.performPunch(p);
     System.out.println(CPU.getName() +" punch you in the face");
         System.out.println(p.getName()+" takes "+p.getDamge()+" in damage");    
     }
     
    
    
}//CPUMoveMaker
public void CreateCPUName( CPUFighter n)
{   int i;
     i=(int) (Math.round(Math.random() * 3 + 1));
      if(i==1)
      
      {n.setName("The Beast Killa");
             
      
      }//end killa
      else if(i==2)
      {
          n.setName("El Capo");
      
      }//el chapo
      else if(i ==3)
      {
          n.setName("SheWolf");
      }//shewolf
      else{
      n.setName("Dream Killa");
      }


}//cpuName    
    
}//CPUFight Class
