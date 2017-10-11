/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kickboxing;//

/**
 *
 * @author kingJ
 */
public class KickBoxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        FightVsPlayer StartFight = new FightVsPlayer();
        // TODO code application logic here
    
        Player player = new Player();
        CPUFighter CPU = new CPUFighter();
        //CPU.CreateCPUName(CPU);
        //player.createPlayerName(player,CPU);
        StartFight.StartFight(player, CPU);
   
    
    
    
    }
    
}
