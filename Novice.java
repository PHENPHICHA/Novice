//phenphicha phetjumras 5910110236 section 01 
import java.io.*;

public class Novice {

    // Field
    private int Level;
    private int HP;
    private int EXP;

    // Constructor
    public Novice(int initialHP) {
        HP = initialHP;
        Level = 1;
        EXP = 0;
    }

    // Method
    public void startGame(int initHP) {
        System.out.println("-------------------------------");
        System.out.println("---------GAME START !!!--------");
        System.out.println("-------------------------------");
        System.out.println("Hi, your HP now is " + initHP);
    }

    public Novice killing(Novice killer) {
        if (killer.HP > 0) {
            killer.EXP = killer.EXP + 50;
            killer.Level = killer.Level + 1;
            System.out.println(".....Killing.....");
        } else {
           System.out.println("GAME OVER");
        }
        return killer;
    }

    public Novice attacked(Novice victim) {
        victim.HP = victim.HP - 25;
        victim.EXP = victim.EXP + 10;
        System.out.println(".....Killed.....");
        return victim;
    }

    public void monitor(Novice status) {
        System.out.println("Update..");
        System.out.println("Your HP is " + status.HP);
        System.out.println("Your Exp is " + status.EXP);
        System.out.println("Your Level is " + status.Level);
    }

    public static void main(String args[]) {
        
        Novice player = new Novice(100);
        int i=1;
        // Call Initail Value to start Games
        player.startGame(player.HP);
        while (player.HP > 0) {
            System.out.println("\n #Round "+ i+"\n");
            i++;
            System.out.println("Me: Kill him !!");
            player = player.killing(player);
            if (player.HP >= 0) {
                player.monitor(player);
                System.out.println("Boss: Beat you !!");
                player = player.attacked(player);
                player.monitor(player);
            }
        }
        System.out.println("------------------------------");
        System.out.println("---------GAME OVER------------");
        System.out.println("--------YOU LOSE T_T----------");

    }
}