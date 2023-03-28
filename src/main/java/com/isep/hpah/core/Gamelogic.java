package com.isep.hpah.core;
import com.isep.hpah.core.system.spell.listSpell;
import com.isep.hpah.core.system.wizard.wizard;

import java.util.Scanner;

import static com.isep.hpah.core.method.scInt;
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

            while(wizard.player.getHp() > 0 && EnnemyList().get(ennemy).getHp() > 0) {


                // Player's turn
                System.out.println("Choose a spell:");
                System.out.println("1. " + listSpell.SpellList().get(1).getNameSpell());
                System.out.println("2. " + listSpell.SpellList().get(2).getNameSpell());
                System.out.println("3. " + listSpell.SpellList().get(3).getNameSpell());
                System.out.println("4. " + listSpell.SpellList().get(4).getNameSpell());
                int spellChoice = sc.nextInt();
                switch(spellChoice) {
                    case 1:
                        System.out.println(listSpell.SpellsStart.get(1).getNameSpell());
                        wizard.validAcc(spellChoice,ennemy);
                        break;
                    case 2:
                        System.out.println(listSpell.SpellsStart.get(2).getNameSpell());
                        wizard.validAcc(spellChoice,ennemy);
                        break;
                    case 3:
                        System.out.println(listSpell.SpellsStart.get(3).getNameSpell());
                        wizard.validAcc(spellChoice,ennemy);
                        break;
                    case 4:
                        System.out.println(listSpell.SpellsStart.get(4).getNameSpell());
                        wizard.validAcc(spellChoice,ennemy);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
                System.out.println("Your ennemy attack !!!");
                double damageEnnemy = EnnemyList().get(ennemy).getAtt() - player.getDef()* EnnemyList().get(ennemy).getAtt();
                player.setHp(player.getHp()-damageEnnemy);

                // Enemy's turn
                // Code for enemy's attack

                // Display HP
                System.out.println("Player HP: " + wizard.player.getHp());
                System.out.println("Enemy HP: " + EnnemyList().get(ennemy).getHp());
            }
            EnnemyList().get(ennemy).setHp(EnnemyList().get(ennemy).getMaxHP());

            // Game over
            if(wizard.player.getHp() <= 0) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
                wizard.gainExp(ennemy);
            }
        }

    }

}
