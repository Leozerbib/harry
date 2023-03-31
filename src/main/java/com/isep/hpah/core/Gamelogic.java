package com.isep.hpah.core;
import com.isep.hpah.core.system.Story;
import com.isep.hpah.core.system.potion.potionMethod;
import com.isep.hpah.core.system.spell.AbstractSpell;
import com.isep.hpah.core.system.spell.listSpell;
import com.isep.hpah.core.system.spell.methodSpell;
import com.isep.hpah.core.system.wizard.Boss;
import com.isep.hpah.core.system.wizard.wizard;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static com.isep.hpah.core.method.scInt;
import static com.isep.hpah.core.system.wizard.Boss.allBoss;
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


    public static class CombatSystem {
            public static double damage(int i,int j){
                double damage = player.attackwiz(i)-(allEnnemy.get(j).getDef()* player.attackwiz(i));
                return damage;

            }
            public static double damageTOBoss(int i,int j) {
                double damageToBoss = player.attackwiz(i) - (allBoss.get(j).getDef() * player.attackwiz(i));
                return damageToBoss;
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
                potionMethod.potionUse();
                // Player's turn
                System.out.println("Choose a spell:");
                listSpell.printSpell();
                method.printLine(60);
                int spellChoice;
                do {
                    System.out.print("Please enter a number between 1 and " + listSpell.SpellsStart.size() + ": ");
                    int input = method.scInt("\n->",listSpell.SpellsStart.size());
                    spellChoice =  input - 1;
                    if (spellChoice >= 0 && spellChoice <= listSpell.SpellsStart.size()) {
                        valide = true;
                    }else {
                        valide = false;
                    }
                } while (valide == false);
                method.clearConsole();
                System.out.println(listSpell.SpellsStart.get(spellChoice).getNameSpell());
                wizard.validAcc(spellChoice,ennemy);
                methodSpell.heal(spellChoice);
                System.out.println("\u001B[31m"+"Enemy HP: " + allEnnemy.get(ennemy).getHp()+"\033[0m");
                method.enterContinue();
                method.printLine(50);
                System.out.println("Your ennemy attack !!!");
                double damageEnnemy = allEnnemy.get(ennemy).getAtt() - player.getDef()* allEnnemy.get(ennemy).getAtt();
                player.setHp(player.getHp()-damageEnnemy);
                System.out.println("You receive " + damageEnnemy +" damage");
                System.out.println("\u001B[31m"+"Player HP: " + wizard.player.getHp()+"\033[0m");
                method.printLine(50);
                method.enterContinue();
                method.clearConsole();

            }
            allEnnemy.get(ennemy).setHp(allEnnemy.get(ennemy).getMaxHP());

            // Game over
            if(wizard.player.getHp() <= 0) {
                System.out.println("\u001B[31m"+"You lose!"+"\033[0m");
                System.exit(0);
            } else {
                System.out.println("\u001B[32m"+"You win!"+"\033[0m");
                potionMethod.addpotion(allEnnemy.get(ennemy).getNumber(),allEnnemy.get(ennemy).getPotion());
                wizard.gainExp(ennemy);

            }
        }
        public static void combatBoss(int ennemy,int level) {
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
                potionMethod.potionUse();
                    System.out.println("Choose a spell:");
                    listSpell.printSpell();
                    method.printLine(60);
                    int spellChoice;
                    do {
                        System.out.print("Please enter a number between 1 and " + listSpell.SpellsStart.size() + ": ");
                        int input = method.scInt("\n->", listSpell.SpellsStart.size());
                        spellChoice = input - 1;
                        if (spellChoice >= 0 && spellChoice <= listSpell.SpellsStart.size()) {
                            valide = true;
                        } else {
                            valide = false;
                        }
                    } while (valide == false);
                    method.clearConsole();
                    System.out.println(listSpell.SpellsStart.get(spellChoice).getNameSpell());
                    wizard.validAcc2(spellChoice, ennemy);
                    methodSpell.heal(spellChoice);
                    System.out.println("\u001B[31m"+"Enemy HP: " + Boss.allBoss.get(ennemy).getHp()+"\033[0m");
                    method.enterContinue();
                    method.printLine(50);
                    damageBoss(ennemy, i);
                    System.out.println("\u001B[31m"+"Player HP: " + wizard.player.getHp()+"\033[0m");
                    method.printLine(50);
                    method.enterContinue();
                    method.clearConsole();
                    if (allBoss.get(ennemy).getHp()<0.20*allBoss.get(ennemy).getMaxHP() && (ennemy==0||ennemy==1||ennemy==2||ennemy==4||ennemy==5||ennemy==7)){
                        Story.dungeonSwitch(level);
                    }else {
                        System.out.println(allBoss.get(ennemy).getName()+" try to escape use a spell to stop your oponent!!!");
                    }}
            Boss.allBoss.get(ennemy).setHp(Boss.allBoss.get(ennemy).getMaxHP());
            if(wizard.player.getHp() <= 0) {
                System.out.println("\u001B[31m"+"You lose!"+"\033[0m");
                System.exit(0);
            } else {
                System.out.println("\u001B[32m"+"You win!"+"\033[0m");
                player.setExp(player.getExp() + Boss.allBoss.get(ennemy).getExp());
                method.printLine(50);
                System.out.println("You gain " + Boss.allBoss.get(ennemy).getExp() + "exp");
                method.printLine(50);
                potionMethod.addpotion(allBoss.get(ennemy).getNumber(),allBoss.get(ennemy).getPotion());
                method.enterContinue();
                levelUp();
            }
        }
        public static double damageBoss;
        public static double degat;
        public static boolean valide=false;
        public static void damageBoss(int ennemy,int j) {
            System.out.println("Your ennemy attack !!!");

            if (j % 5 == 0) {
                degat = Boss.allBoss.get(ennemy).getAtt() + Boss.allBoss.get(ennemy).getSpell().getDamage();
                damageBoss = degat - player.getDef() * degat;
                Boss.validAccBoss(Boss.allBoss.get(ennemy).getSpell());
                System.out.println(Boss.allBoss.get(ennemy).getSpell().getNameSpell());
                if (validee == 1) {
                    System.out.println("\u001B[33m"+"miss"+"\033[0m");
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
                        System.out.println("\u001B[33m"+"miss"+"\033[0m");
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
                        System.out.println("\u001B[33m"+"miss"+"\033[0m");
                    } else {
                        player.setHp(player.getHp() - damageBoss);

                        System.out.println("You receive " + damageBoss + " damage");
                    }
                }
            }

        }


    }

}
