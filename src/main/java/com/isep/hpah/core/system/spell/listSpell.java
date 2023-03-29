package com.isep.hpah.core.system.spell;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.isep.hpah.core.method;
import lombok.*;


import static com.isep.hpah.core.system.spell.spell.*;

@Getter@Setter
public class listSpell  {
    public static ArrayList<spell> SpellsStart = new ArrayList<>();
    public static List<spell> SpellList(){
        //creating arrayList for new wizard

        //Known Spells that you start with

        SpellsStart.add(lumos);
        SpellsStart.add(fire);
        SpellsStart.add(petrificusTotalus);
        SpellsStart.add(wigardiumLeviosa);
        return SpellsStart;
    }
    public static void addSpell(spell j){
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



}
