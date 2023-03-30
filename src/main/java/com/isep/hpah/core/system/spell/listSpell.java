package com.isep.hpah.core.system.spell;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.isep.hpah.core.method;
import lombok.*;


import static com.isep.hpah.core.system.spell.forbbidenSpell.avadaKedavra;
import static com.isep.hpah.core.system.spell.spell.*;

@Getter@Setter
public class listSpell  {
    public static ArrayList<AbstractSpell> SpellsStart = new ArrayList<>();
    public static List<AbstractSpell> SpellList(){
        //creating arrayList for new wizard

        //Known Spells that you start with

        SpellsStart.add(lumos);
        SpellsStart.add(fire);
        SpellsStart.add(petrificusTotalus);
        SpellsStart.add(wigardiumLeviosa);
        return SpellsStart;
    }
    public static ArrayList<AbstractSpell> SpellsVOL = new ArrayList<>();
    public static List<AbstractSpell> SpellListVOl(){
        //creating arrayList for new wizard

        //Known Spells that you start with
        SpellsVOL.add(fire);
        SpellsVOL.add(riddikulus);
        SpellsVOL.add(avadaKedavra);
        return SpellsVOL;
    }
    public static void addSpell(AbstractSpell j){
        Scanner sc = new Scanner(System.in);
        method.printLine(60);
        System.out.println("You finish your first year at Hogwart, you can learn a new spell.");
        System.out.println("Do you want to learn : " + j.getNameSpell() + " if you do you will have to remove that you already know.");
        System.out.println(j.getNameSpell() +
                "\n Damage : " + j.getDamage() +
                "\n Heal : " + j.getHeal() +
                "\n Acc : " + j.getAcc()
                );
        System.out.println(" ");
        System.out.println("Do you want to learn it :");
        System.out.println("1. " + "yes");
        System.out.println("2. " + "no");
        method.printLine(60);
        int Choice = sc.nextInt();
        if (Choice==1){
            removeSpell();
            SpellsStart.add(j);
            for (int i=0;i<= SpellsStart.size()-1;i++){
                System.out.println(SpellsStart.size());
                method.enterContinue();
                System.out.println(i + ". " + listSpell.SpellsStart.get(i).getNameSpell());
            }

        }
        else {
            System.out.println("you havn't learn the spell");
        }

    }
    public static boolean valide;
    public static void removeSpell(){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<SpellsStart.size();i++){
            method.printLine(60);
            System.out.println(SpellsStart.get(i).getNameSpell() +
                    "\n Damage : " + SpellsStart.get(i).getDamage() +
                    "\n Heal : " + SpellsStart.get(i).getHeal() +
                    "\n Acc : " + SpellsStart.get(i).getAcc());
        }
        method.printLine(60);
        System.out.println("Choose a spell:");
        int spellChoice;
        do {

            System.out.print("Please enter a number between 1 and " + listSpell.SpellsStart.size() + ": ");
            spellChoice = sc.nextInt() - 1;
            if (spellChoice >= 0 && spellChoice <= listSpell.SpellsStart.size()) {
                valide = true;
            }else {
                valide = false;
            }
        } while (valide == false);
        SpellsStart.remove(spellChoice);

    }
    public static void printSpell(){
        method.printLine(20);
        for (int j=0;j<SpellsStart.size();j++){

            System.out.println(SpellsStart.get(j).getNameSpell() +
                    "\n Damage : " + SpellsStart.get(j).getDamage() +
                    "\n Heal : " + SpellsStart.get(j).getHeal() +
                    "\n Acc : " + SpellsStart.get(j).getAcc()
            );
            method.printLine(20);
        }
    }



}
