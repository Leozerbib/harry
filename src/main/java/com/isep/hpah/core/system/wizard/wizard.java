package com.isep.hpah.core.system.wizard;

import com.isep.hpah.core.Gamelogic;
import com.isep.hpah.core.Main;
import com.isep.hpah.core.method;
import com.isep.hpah.core.system.pet;
import com.isep.hpah.core.system.sorting_hat;
import com.isep.hpah.core.system.spell.AbstractSpell;
import com.isep.hpah.core.system.spell.listSpell;
import com.isep.hpah.core.system.spell.spell;
import com.isep.hpah.core.system.wand;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;

import static com.isep.hpah.core.system.wizard.enemy.*;


@Getter @Setter
public class wizard extends character {

    private String petPlayer;
    private String selectedhouse;
    private static wand wand;
    private int year;
    private int level;
    private double acc;
    private spell damage;
    public wizard(String name, String type, int maxHP, double hp, double exp, int att, double def, String selectedhouse, String petPlayer, int year, int level,double acc) {
        super(name, type, maxHP, hp, exp, att, def, acc);
        this.petPlayer= petPlayer;
        this.selectedhouse=selectedhouse;
        this.year=year;
        this.level=level;


        switch(sorting_hat.selectedhouse){
            case "Ravenclaw":
                    this.acc+=0.1;
                break;
            case "Slytherin":
                this.setAtt(att+10);
                break;
            case "Hufflepuff":
                break;
            case "Gryffondor":
                this.setDef(def * 1.2);
                break;
        }
    }
    public static wizard player = new wizard(Main.name,"player",1000,1000,0,10,0.1,sorting_hat.selectedhouse,pet.petPlayer,1,1,0);



    public int attackwiz(int j) {
        int damage = player.getAtt() + listSpell.SpellsStart.get(j).getDamage();
        return damage;
    }


    public int defense() {
        return 0;
    }
    public void choose(){
        Scanner sc = new Scanner(System.in);
        method.clearConsole();
        method.printLine(50);
        System.out.println("1. " + "use a spell");
        System.out.println("2. " + "use a potion");
        int choice = sc.nextInt();
        if (choice==1) {
            System.out.println("You choose to use a spell, wich one do you want to use ?");
        }
        else if (choice==2){
            System.out.println("You choose to use a spell, wich one do you want to use ?");
        }

    }

    @Override
    public int attack() {
        return 0;
    }
    public static int valid;
    public static int validAcc(int j,int i){
        Random r = new Random();
        double randomval= r.nextDouble();
        double touch=listSpell.SpellsStart.get(j).getAcc() + wizard.player.acc;
        if (touch < randomval){
            System.out.println("you miss");
        }
        else {
            EnnemyList().get(j).setHp(EnnemyList().get(j).getHp()- Gamelogic.CombatSystem.damage(j,i));
            System.out.println("nice shot");
        }
        System.out.println(randomval);
        System.out.println(touch);
        System.out.println(valid);
        return valid;
    }
    public static int gainExp(int ennemy){
        double Exp = enemy.EnnemyList().get(ennemy).getExp();
        double Expeq = player.getExp() + Exp/player.getLevel();
        player.setExp(Expeq);
        method.printLine(50);
        System.out.println("You gain " + Expeq + "exp");
        method.printLine(50);
        method.enterContinue();
        levelUp();
        return ennemy;
    }
    public static int levelUp(){
        int level = 1;
            if (player.getExp() >= level) {
                player.setLevel(player.getLevel() + 1);
                player.setAtt(player.getAtt() + (10 * level));
                player.setMaxHP(player.getMaxHP() + (100 * level));
                player.setDef(player.getDef()+0.05);
                player.setExp(player.getExp() - level);
                level += 1;
                method.printLine(50);
                method.printTitle("LEVEL UP : " + player.getLevel());
                method.enterContinue();
            } else {
                method.printLine(50);
                System.out.println("You soon will gain a level !!");
            }
        Gamelogic.stat();
        method.enterContinue();
        return level;
    }

}

