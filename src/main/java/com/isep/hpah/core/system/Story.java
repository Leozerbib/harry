package com.isep.hpah.core.system;

import com.isep.hpah.core.Gamelogic;
import com.isep.hpah.core.method;
import com.isep.hpah.core.system.dungeon.*;
import com.isep.hpah.core.system.potion.potion;
import com.isep.hpah.core.system.potion.potionMethod;
import com.isep.hpah.core.system.spell.forbbidenSpell;
import com.isep.hpah.core.system.spell.listSpell;
import com.isep.hpah.core.system.spell.spell;
import com.isep.hpah.core.system.wizard.Boss;
import com.isep.hpah.core.system.wizard.enemy;
import com.isep.hpah.core.system.wizard.wizard;

import static com.isep.hpah.core.system.house.Gryffondor;
import static com.isep.hpah.core.system.house.Slytherin;

public class Story {

    public static void chapitre(int i){
        method.clearConsole();

        method.printTitle(dungeon.chapters[i].getNamechap());
        System.out.println("The action take place in " + dungeon.chapters[i].getPlace());
        method.enterContinue();
        method.clearConsole();
        method.printLine(50);
        System.out.println(dungeon.chapters[i].getDescription());
        method.printLine(50);
        method.enterContinue();
        System.out.println(dungeon.chapters[i].getDescription2());
        if (i==3 || i ==6){
            Gamelogic.CombatSystem.combatBoss(dungeon.chapters[i].getEnnemy(),i);
        }
        else {
            Gamelogic.CombatSystem.combatSimple(dungeon.chapters[i].getEnnemy());
        }
        System.out.println("nice Job ");
        method.printLine(50);
        method.enterContinue();
        method.clearConsole();
        method.printLine(50);
        System.out.println(dungeon.chapters[i].getDescription3());
        if (i==3 || i ==6){
            System.out.println("You found a potion on the floor,it is "+ potion.inventairepotion.get(4).getName());
            potionMethod.addpotion(1,4);
            method.enterContinue();
        }
        else {
            System.out.println("You found a potion on the floor,it is "+ potion.inventairepotion.get(0).getName());
            potionMethod.addpotion(3,0);
            method.enterContinue();
        }
        System.out.println(dungeon.chapters[i].getDescription4());
        Gamelogic.CombatSystem.combatBoss(dungeon.chapters[i].getBoss(),i);
        method.enterContinue();
        method.clearConsole();
        method.printLine(50);
        System.out.println(dungeon.chapters[i].getDescription5());
        method.printLine(50);
        method.enterContinue();
        method.clearConsole();
        listSpell.addSpell(dungeon.chapters[i].getSpell());

    }
    public static void dungeonSwitch(int i){
        switch (i){
            case 0:
                System.out.println("\u001B[31m"+"You Use "+ spell.wigardiumLeviosa.getNameSpell()+ " to make an object fall on the troll to win the fight."+"\u001B[40m");
                Boss.allBoss.get(0).setHp(0);
                System.out.println("You oponent has lost, he has " + Boss.allBoss.get(0).getHp()+"hp");
                break;
            case 1:
                if (wizard.player.getSelectedhouse() == String.valueOf(Gryffondor)){
                    System.out.println("\u001B[31m"+"The magic hat give you the sword of Gryffondor You cut the head of the basilisk with it."+"\u001B[40m");
                    Boss.allBoss.get(1).setHp(0);
                    System.out.println("You oponent has lost, he has " + Boss.allBoss.get(1).getHp()+"hp");
                }
                else {
                    System.out.println("\u001B[31m"+"You Use "+ spell.accio.getNameSpell()+ " to make the teeth of the basilisk fall and use it to defeat him."+"\u001B[40m");
                    Boss.allBoss.get(1).setHp(0);
                    System.out.println("You oponent has lost, he has " + Boss.allBoss.get(1).getHp()+"hp");
                }
                break;
            case 2:
                System.out.println("\u001B[31m"+"You stop Lupin, but some " + enemy.detraqueur.getName() + " are coming to get him, you use "+spell.expectoPatronum.getNameSpell()+ " to make theme go away."+"\u001B[40m");
                Boss.allBoss.get(2).setHp(0);
                break;
            case 3:
                System.out.println("\u001B[31m"+"You use "+spell.accio.getNameSpell()+" to escape the fight."+"\u001B[40m");
                Boss.allBoss.get(7).setHp(0);
                break;
            case 4:
                System.out.println("\u001B[31m"+"You found some fireworks on the floor, it's PARTY TIME for "+Boss.DoloresOmbrage.getName()+ ", you fire them on her using your spell "+ spell.fire.getNameSpell()+"\u001B[40m");
                Boss.allBoss.get(4).setHp(0);
                break;
            case 5:
                if (wizard.player.getSelectedhouse() == String.valueOf(Slytherin)){
                    System.out.println("\u001B[31m"+"The " + Boss.Mangemort.getName() + " are now you ally, you attack is increase"+"\u001B[40m");
                    wizard.player.setAtt(wizard.player.getAtt() + Boss.Mangemort.getAtt());
                    Boss.allBoss.get(5).setHp(0);
                }
                else{
                    System.out.println("\u001B[31m"+"you use " + spell.expelliarmus.getNameSpell() + " to defeat the last " +Boss.Mangemort.getName()+"\u001B[40m");
                    Boss.allBoss.get(5).setHp(0);
                }
                break;
            case 6:
                if (wand.getCore() == String.valueOf(Core.PHOENIX_FEATHER)){
                    System.out.println("\u001B[31m"+"The core of your wand is getting attract to " + Boss.Voldemort2.getName()+" wand."+"\u001B[40m" );
                    System.out.println("\u001B[31m"+"You use "+spell.expelliarmus.getNameSpell()+" but "+Boss.Voldemort2.getName()+ " use "+ forbbidenSpell.avadaKedavra.getNameSpell()+"\u001B[40m");
                    System.out.println("\u001B[31m"+"The shock between the two spell is to powerful Your both Wand explode, killing " +Boss.Voldemort2.getName()+ " and send you 20 meter behind."+"\u001B[40m");
                    System.out.println("\u001B[31m"+"When you woke you see everybody in shock loocking at your face, the explosion cut your nose you have a flat face like " + Boss.Voldemort2.getName()+"\u001B[40m");
                    Boss.allBoss.get(8).setHp(0);
                }
                else{
                    System.out.println("\u001B[31m"+"You use "+spell.expelliarmus.getNameSpell()+" but "+Boss.Voldemort2.getName()+ " use "+ forbbidenSpell.avadaKedavra.getNameSpell()+"\u001B[40m");
                    System.out.println("\u001B[31m"+"The shock between the two spell is very powerful but after 1min of powerful spell your's is getting stronger and you finnally manage to kill " +Boss.Voldemort2.getName()+"\u001B[40m");
                    Boss.allBoss.get(8).setHp(0);
                }
                break;
        }
    }
}
