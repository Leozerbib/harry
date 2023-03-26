package com.isep.hpah.core;
import com.isep.hpah.core.system.spell.AbstractSpell;
import com.isep.hpah.core.system.spell.listSpell;
import com.isep.hpah.core.system.wizard.wizard;

import static com.isep.hpah.core.system.wizard.wizard.player;

public class StartAdventure {
    boolean isRunning = true;
        public static wizard stat(){
            method.printTitle("STATISTIQUE");
            System.out.println(
                "Hey, " +player.getName() + " you !\n\n" +
                "Here is your stat, they will get better when you increase level:" +
                    "\nHealth: " +player.getMaxHP() +
                    "\nRemaining Health: " +player.getHp() +
                    "\nAtt: " + player.getAtt() +
                    "\nDef: " + player.getDef()  +
                    "\nYear: " + player.getYear() +
                    "\nLevel: " + player.getLevel() +
                    "\nPet: " + player.getPetPlayer() +
                    "\nHouse: " + player.getSelectedhouse()
            );

        return player;
        }

}
