package com.isep.hpah.core.system.potion;
import com.isep.hpah.core.method;
import com.isep.hpah.core.system.wizard.wizard;

import java.util.ArrayList;
import java.util.List;

public class potionMethod {
    public static void potionUse(){
        for (int i=0;i<potion.inventairepotion.size();i++){
            System.out.println("Votre inventaire de potion : " +
                    "\n" + potion.inventairepotion.get(i).getNumber() +" " +potion.inventairepotion.get(i).getName()+
                    "\nHeal : " + potion.inventairepotion.get(i).getHp() +"       Exp : "+potion.inventairepotion.get(i).getXp() + "       Boost att : " + potion.inventairepotion.get(i).getAtt());

            method.printLine(50);

        }
        System.out.println("\n input 6 if you don't want to use potion");
        System.out.println("Voulez vous utiliser une potion");
        int input=method.scInt("->",6);
        if(input<potion.inventairepotion.size()&&potion.inventairepotion.get(input-1).getNumber()>0){
            usepotion(input-1);
        }else {
            System.out.println("okay you can now choose a spell.");
            method.printLine(50);
            method.enterContinue();
            method.clearConsole();
        }

    }
    public static void usepotion(int i){
        wizard.player.setHp(wizard.player.getMaxHP()*com.isep.hpah.core.system.potion.potion.inventairepotion.get(i).getHp()+wizard.player.getHp());
        wizard.player.setDef(wizard.player.getDef() + com.isep.hpah.core.system.potion.potion.inventairepotion.get(i).getDef());
        wizard.player.setAtt(wizard.player.getAtt() + com.isep.hpah.core.system.potion.potion.inventairepotion.get(i).getAtt());
        wizard.player.setExp(wizard.player.getExp() + com.isep.hpah.core.system.potion.potion.inventairepotion.get(i).getXp());
        wizard.levelUp();
        potion.inventairepotion.get(i).setNumber(potion.inventairepotion.get(i).getNumber()-1);
        System.out.println("Vous avez utilisé "+ potion.inventairepotion.get(i).getName()+" you receive "+wizard.player.getMaxHP()*com.isep.hpah.core.system.potion.potion.inventairepotion.get(i).getHp()+" hp.");
        method.printLine(50);
        method.enterContinue();
    }
    public static void addpotion(int number,int i){
        potion.inventairepotion.get(i).setNumber(potion.inventairepotion.get(i).getNumber()+number);
        System.out.println("You receive : " + number+ " "+ potion.inventairepotion.get(i).getName());
        method.printLine(50);
        method.enterContinue();
        method.clearConsole();
    }
}
