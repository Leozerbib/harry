package com.isep.hpah.core;
import com.isep.hpah.core.system.spell.AbstractSpell;
import com.isep.hpah.core.system.spell.listSpell;
import com.isep.hpah.core.system.spell.methodSpell;
import com.isep.hpah.core.system.wizard.Boss;
import com.isep.hpah.core.system.wizard.wizard;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static com.isep.hpah.core.method.scInt;
import static com.isep.hpah.core.system.wizard.Boss.validee;
import static com.isep.hpah.core.system.wizard.enemy.*;
import static com.isep.hpah.core.system.wizard.wizard.*;

public class Gamelogic {
    static boolean isRunning = true;
        public static wizard stat() {
            method.printTitle("STATISTIQUE");
            System.out.println(
                    "Hey, " + player.getName() + " you !\n\n" +
                            "Here is your stat, they will get better when you increase level:" +
                            "\nHealth: " + player.getMaxHP() +
                            "\nRemaining Health: " + player.getHp() +
                            "\nAtt: " + player.getAtt() +
                            "\nDef: " + player.getDef() +
                            "\nAcc: " + player.getAcc() +
                            "\nYear: " + player.getYear() +
                            "\nExp: " + player.getExp() + "/" + player.getLevel() +
                            "\nLevel: " + player.getLevel() +
                            "\nPet: " + player.getPetPlayer() +
                            "\nHouse: " + player.getSelectedhouse()
            );

        return player;
        }
        public static void continuejourney(){

        }
        public static void printmenu(){
            method.clearConsole();
            method.printTitle("Menue");
            System.out.println("choose an action");
            method.printLine(50);
            System.out.println("1. continue");
            System.out.println("2. stat");
            System.out.println("3. Exit game ");
        }

        public static void gameloop(){
            while(isRunning){
                printmenu();
                int input = scInt("-> ",3);
                if(input == 1){
                    continuejourney();
                } else if (input == 2) {
                    stat();
                }


            }

        }



    public class CombatSystem {
            public static double damage(int i,int j){
                double damage = player.attackwiz(i)-(allEnnemy.get(j).getDef()* player.attackwiz(i));
                return damage;

            }
        public static void combatSimple(int ennemy) {
            Scanner sc = new Scanner(System.in);
            method.clearConsole();
            method.printTitle("Fight");
            System.out.println(allEnnemy.get(ennemy).getType() + " : " + allEnnemy.get(ennemy).getName());
            System.out.println(allEnnemy.get(ennemy).getDescrip());
            method.enterContinue();
            while(wizard.player.getHp() > 0 && allEnnemy.get(ennemy).getHp() > 0) {
                System.out.println(allEnnemy.get(ennemy).getType() + " : " + allEnnemy.get(ennemy).getName());
                System.out.println("Remaining health : " + allEnnemy.get(ennemy).getHp() + "                                                 " +player.getHp());
                System.out.println("");
                method.printLine(60);
                // Player's turn
                System.out.println("Choose a spell:");
                System.out.println("1. " + listSpell.SpellsStart.get(0).getNameSpell());
                System.out.println("2. " + listSpell.SpellsStart.get(1).getNameSpell());
                System.out.println("3. " + listSpell.SpellsStart.get(2).getNameSpell());
                System.out.println("4. " + listSpell.SpellsStart.get(3).getNameSpell());
                method.printLine(60);
                int spellChoice = sc.nextInt()-1;
                method.clearConsole();
                System.out.println(listSpell.SpellsStart.get(spellChoice).getNameSpell());
                wizard.validAcc(spellChoice,ennemy);
                methodSpell.heal(spellChoice);
                System.out.println("Enemy HP: " + allEnnemy.get(ennemy).getHp());
                method.printLine(50);
                method.enterContinue();
                method.clearConsole();
                method.printLine(50);
                System.out.println("Your ennemy attack !!!");
                double damageEnnemy = allEnnemy.get(ennemy).getAtt() - player.getDef()* allEnnemy.get(ennemy).getAtt();
                player.setHp(player.getHp()-damageEnnemy);
                System.out.println("You receive " + damageEnnemy +" damage");
                System.out.println("Player HP: " + wizard.player.getHp());
                method.printLine(50);
                method.enterContinue();
                method.clearConsole();

            }
            allEnnemy.get(ennemy).setHp(allEnnemy.get(ennemy).getMaxHP());

            // Game over
            if(wizard.player.getHp() <= 0) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
                wizard.gainExp(ennemy);
            }
        }
        public static void combatBoss(int ennemy) {
            Scanner sc = new Scanner(System.in);
            method.clearConsole();
            method.printTitle("Fight");
            System.out.println(Boss.allBoss.get(ennemy).getType() + " : " + Boss.allBoss.get(ennemy).getName());
            System.out.println(Boss.allBoss.get(ennemy).getDescrip());
            method.enterContinue();
            int i = 0;
            while(wizard.player.getHp() > 0 && Boss.allBoss.get(ennemy).getHp() > 0) {
                i+=1;
                System.out.println(Boss.allBoss.get(ennemy).getType() + " : " + Boss.allBoss.get(ennemy).getName());
                System.out.println("Remaining health : " + Boss.allBoss.get(ennemy).getHp() + "                                                 " +player.getHp());
                System.out.println("");
                method.printLine(60);
                // Player's turn
                System.out.println("Choose a spell:");
                System.out.println("1. " + listSpell.SpellsStart.get(0).getNameSpell());
                System.out.println("2. " + listSpell.SpellsStart.get(1).getNameSpell());
                System.out.println("3. " + listSpell.SpellsStart.get(2).getNameSpell());
                System.out.println("4. " + listSpell.SpellsStart.get(3).getNameSpell());
                method.printLine(60);
                int spellChoice = sc.nextInt()-1;
                method.clearConsole();
                System.out.println(listSpell.SpellsStart.get(spellChoice).getNameSpell());
                wizard.validAcc2(spellChoice,ennemy);
                methodSpell.heal(spellChoice);
                System.out.println("Enemy HP: " + Boss.allBoss.get(ennemy).getHp());
                method.printLine(50);
                method.enterContinue();
                method.clearConsole();
                method.printLine(50);
                damageBoss(0,i);
                System.out.println("Player HP: " + wizard.player.getHp());
                method.printLine(50);
                method.enterContinue();
                method.clearConsole();

            }
            Boss.allBoss.get(ennemy).setHp(Boss.allBoss.get(ennemy).getMaxHP());

            // Game over
            if(wizard.player.getHp() <= 0) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
                wizard.gainExp(ennemy);
            }
        }
        public static double damageBoss;
        public static double degat;
        public static void damageBoss(int ennemy,int j) {
            System.out.println("Your ennemy attack !!!");

            if (j % 5 == 0) {
                degat = Boss.allBoss.get(ennemy).getAtt() + Boss.allBoss.get(ennemy).getSpell().getDamage();
                damageBoss = degat - player.getDef() * degat;
                Boss.validAccBoss(Boss.allBoss.get(ennemy).getSpell());
                System.out.println(Boss.allBoss.get(ennemy).getSpell().getNameSpell());
                if (validee == 1) {
                    System.out.println("miss");
                } else {
                    player.setHp(player.getHp() - damageBoss);

                    System.out.println("You receive " + damageBoss + " damage");
                }

            } else {
                Random r = new Random();
                int randomval = r.nextInt(2);
                if (randomval == 1) {
                    degat = Boss.allBoss.get(ennemy).getAtt() + Boss.allBoss.get(ennemy).getSpell1().getDamage();
                    damageBoss = degat - player.getDef() * degat;
                    Boss.validAccBoss(Boss.allBoss.get(ennemy).getSpell1());
                    System.out.println(Boss.allBoss.get(ennemy).getSpell1().getNameSpell());
                    if (validee == 1) {
                        System.out.println("miss");
                    } else {
                        player.setHp(player.getHp() - damageBoss);

                        System.out.println("You receive " + damageBoss + " damage");
                    }
                } else {
                    degat = Boss.allBoss.get(ennemy).getAtt() + Boss.allBoss.get(ennemy).getSpell2().getDamage();
                    damageBoss = degat - player.getDef() * degat;
                    Boss.validAccBoss(Boss.allBoss.get(ennemy).getSpell2());
                    System.out.println(Boss.allBoss.get(ennemy).getSpell2().getNameSpell());
                    if (validee == 1) {
                        System.out.println("miss");
                    } else {
                        player.setHp(player.getHp() - damageBoss);

                        System.out.println("You receive " + damageBoss + " damage");
                    }
                }
            }

        }


    }

}
