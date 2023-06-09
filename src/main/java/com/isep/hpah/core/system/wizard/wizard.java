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
    public static wizard player = new wizard(Main.name,"player",500,500,0,20,0.1,sorting_hat.selectedhouse,pet.petPlayer,1,1,0);



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
        method.printLine(50);
        if (touch < randomval){
            System.out.println("you miss");
            method.printLine(50);
        }
        else {
            allEnnemy.get(i).setHp(allEnnemy.get(i).getHp()- Gamelogic.CombatSystem.damage(j,i));
            if (allEnnemy.get(i).getHp()<=0){
                allEnnemy.get(i).setHp(0);
                System.out.println("Your ennemy has " + allEnnemy.get(i).getHp() +"hp");
            }
            else {
                System.out.println( "You ennemy receive " + Gamelogic.CombatSystem.damageTOBoss(j, i) +" damage !!!");

            }
            System.out.println("nice shot");
        }
        return valid;
    }
    public static int validAcc2(int j,int i){
        Random r = new Random();
        double randomval= r.nextDouble();
        double touch=listSpell.SpellsStart.get(j).getAcc() + wizard.player.acc;
        method.printLine(50);
        if (touch < randomval){
            System.out.println("you miss");
            method.printLine(50);
        }
        else {
            Boss.allBoss.get(i).setHp(Boss.allBoss.get(i).getHp()- Gamelogic.CombatSystem.damageTOBoss(j,i));
            if (Boss.allBoss.get(i).getHp()<=0){
                Boss.allBoss.get(i).setHp(0);
                System.out.println("Your ennemy has " + Boss.allBoss.get(i).getHp() +"hp");
            }
            else {
                System.out.println( "You ennemy receive " + Gamelogic.CombatSystem.damageTOBoss(j, i) +" damage !!!");

            }
            System.out.println("nice shot");
        }
        return valid;
    }
    public static int gainExp(int ennemy){
        double Exp = enemy.allEnnemy.get(ennemy).getExp()/allEnnemy.get(ennemy).getSeen();
        double Expeq = player.getExp() + Exp;
        player.setExp(Expeq);
        method.printLine(50);
        System.out.println("You gain " + Exp + "exp");
        method.printLine(50);
        method.enterContinue();
        levelUp();
        allEnnemy.get(ennemy).setSeen(player.getLevel());
        return ennemy;
    }
    public static int levelUp(){
        int level = player.getLevel();
        while (player.getExp() >= level) {
            if (player.getExp() >= level) {
                player.setLevel(player.getLevel() + 1);
                player.setAtt(player.getAtt() + (15 * level));
                player.setMaxHP(player.getMaxHP() + (130 * level));
                player.setDef(player.getDef() + 0.025);
                player.setExp(player.getExp() - level);
                method.clearConsole();
                method.printTitle("LEVEL UP : " + player.getLevel());
                method.enterContinue();
                Gamelogic.stat();
            } else {
                method.printLine(50);
                System.out.println("You soon will gain a level !!");
            }

            method.enterContinue();
        }
        return level;
    }

}

