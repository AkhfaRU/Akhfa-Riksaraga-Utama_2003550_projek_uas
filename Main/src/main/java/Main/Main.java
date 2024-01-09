/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //bossnya
            String bossname = "Lord death of murder mountain";
            int bosshealth = 4000;
            int bosspower = 200;
        //player
            System.out.print("Player name: ");
            String name = scanner.nextLine();
            int playerhealth = 1600;
            int playerattack = 200;
            int playerspAttack = 1000 ;
            int playerrecovery = 800;
            int playerspAttackmax = 2;
            int playerrecoverymax= 5;

        
        boolean running = true;
        
        System.out.println("The Final Battle?");
        
        main_game:
        while(running){
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("There once was a demon lord");
            System.out.println("He was an evil demon lord");
            System.out.println("you, "+ name +" set out on a journey to defeat this demon king");
            System.out.println("You've lost too many things along the way. now there is just no retreat");
            System.out.println("------------------------------------------------------------------------------------");
            
            System.out.println("------------------------------------------------------------------------------------");
            
            System.out.println("After a long journey, now you stand before the demon king who was just sitting there...");
            System.out.println("This is the final battle Sir " + name + ", godspeed! YOU CANOT ESCAPE");
            
            System.out.println("------------------------------------------------------------------------------------");


            
            Characters characters = new Characters(bossname, bosshealth,bosspower,name,playerhealth,playerattack,playerspAttack,playerrecovery,playerspAttackmax,playerrecoverymax);
                    
            while(bosshealth>0){
                
                System.out.println("------------------------------------------");
                System.out.println("\t<" + bossname + " Stands Before you! >\n");
                System.out.println(characters.health());
                System.out.println(characters.durability());
                System.out.println("\n\tIts Your Action!");
                System.out.println("\t1. Attack");
                System.out.println("\t2. heal");
                if(playerrecoverymax == 0){
                    System.out.println("\t You cant heal");
                }
                System.out.println("\t3. SUPER ATTACK");
                if(playerspAttackmax == 0){
                    System.out.println("\t You are tired");
                }
                System.out.println("\t4. Withdraw for now(GAME OVER)");
                
                System.out.println("\t<Please Choose an action>\n");
                String input = scanner.nextLine();
                
                System.out.println("------------------------------------------");
                
                if(input.equals("1")){
                    System.out.println(characters.attack());
                    bosshealth -= 200;
                    System.out.println(characters.counter());
                    playerhealth -=200;
                        if(playerhealth<1){
                        System.out.println("\t You've died");
                        break;
                    }
                    
                }else if(input.equals("2")){
                    if(playerrecoverymax == 0){
                        System.out.println(characters.counter());
                        playerhealth -=200;
                    if(playerhealth<1){
                        System.out.println("\tYou've died");
                    break;
                    }
                }else{
                    System.out.println(characters.recovery());
                    playerhealth +=800;
                    System.out.println(characters.counter());
                    playerhealth -=200;
                    if(playerhealth<1){
                        System.out.println("\tYou've died");
                    break;
                    }
                   }
                }else if(input.equals("3")){
                    if (playerspAttackmax == 0){
                    System.out.println(characters.counter());
                    playerhealth -=200;
                    if(playerhealth<1){
                        System.out.println("\t You've died");
                        break;
                    }
                }else{
                    playerspAttackmax -= 1;
                    System.out.println(characters.spAttack());
                    bosshealth -=1000;
                    System.out.println(characters.counter());
                    playerhealth -=200;
                    if(playerhealth<1){
                        System.out.println("\t You've died");
                        break;
                    }
                   }
                }else if(input.equals("4")){
                    System.out.println( "\t What do you mean escape?!");  
                }else{
                    System.out.println( "\t There is only 1-4, pick one.");  
             }
                

        }if(bosshealth == 0){
         System.out.println("------------------------------------------");
         System.out.println( "\t The Demon King Cries out in pain.");
         System.out.println( "\t Silence dawn upon your victory");
         System.out.println( "\t But a parade will surely come after");
         System.out.println( "\t Rest now... Your journey home will now begin");
         System.out.println("------------------------------------------");
         break;
        }else{
         System.out.println("------------------------------------------");
         System.out.println( "\t The Demon King roars");
         System.out.println( "\t Silence dawn upon your defeat");
         System.out.println( "\t there would be no cheers, no songs");
         System.out.println( "\t your fate ended there...");
         System.out.println("------------------------------------------");
         break;
        }
        
    }   
   }
}
