package com.isep.hpah.core.system;

import com.isep.hpah.core.Gamelogic;
import com.isep.hpah.core.method;
import com.isep.hpah.core.system.dungeon.*;
import com.isep.hpah.core.system.spell.listSpell;
import com.isep.hpah.core.system.spell.spell;

import static com.isep.hpah.core.system.spell.spell.reparo;

public class Story {

    public static void chapitre(int i){
        method.clearConsole();

        method.printTitle(dungeon.chapters[i].getNamechap());
        System.out.println("The action take place in " + dungeon.chapters[i].getPlace());
        method.enterContinue();
        System.out.println(dungeon.chapters[i].getDescription());
        method.enterContinue();
        System.out.println(dungeon.chapters[i].getDescription2());
        Gamelogic.CombatSystem.combatSimple(0);
        System.out.println("nice Job but there is a other one behind you");
        Gamelogic.CombatSystem.combatSimple(0);
        listSpell.addSpell(spell.reparo);
        Gamelogic.CombatSystem.combatSimple(1);


    }
}
