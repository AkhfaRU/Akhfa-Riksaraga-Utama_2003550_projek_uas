/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author lenovo
 */
public class Characters extends Main{
    //Boss
    private String demonking = "Lord Death of Murder Mountain";
    private int durability;
    private int counter;
    // Player
    private String playerName;
    private int health;
    private int attack;
    private int spAttack;
    private int recovery;
    private int recoverymax;
    private int spAttackmax;
    
    public Characters(String demonking, int durability, int counter, String playerName, int health, int attack, int spAttack, int recovery, int spAttackmax, int recoverymax) {
        //boss
        this.demonking = demonking;
        this.durability = durability;
        this.counter = counter;
        //Player
        this.playerName = playerName;
        this.health = health;
        this.attack = attack;
        this.spAttack = spAttack;
        this.recovery= recovery;
        this.spAttackmax = spAttackmax;
        this.recoverymax= recoverymax;
        
    }
    
    public String durability() {
                    return "\t The Demon Lord's Condition = " + durability;
    }
    public String health() {
                    return "\t Your Condition = " + health;
    }
                    

    public String attack() {
                    durability -= attack;
                    return "\t" + playerName + " Is attacking!" + " Demon HP -" + attack;
    }
    
    public String counter() {
                    health -= counter;
                    return "\t" + demonking + " attacks!" + playerName + " HP- " + counter;
    }
    
    public String recovery() {
        health += recovery;
        recoverymax -= 1;
        return "\t" + playerName + "recovers" + recovery + "Health. Healing left = " + recoverymax; 
    }
    
    public String spAttack() {
        durability -= spAttack;
        spAttackmax -= 1;
        return "\t" + playerName + "Goes all out!!!" + demonking + "Receives " + spAttack + "damage"; 
    }
    
}
