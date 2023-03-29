package com.isep.hpah.core.system.spell;

import com.isep.hpah.core.system.wizard.wizard;

public class methodSpell {
    public static int heal(int j){
        double healrec = listSpell.SpellsStart.get(j).getHeal()*wizard.player.getMaxHP();
        double heal = wizard.player.getHp() + healrec ;
        heal = Math.min(heal,wizard.player.getMaxHP());
        wizard.player.setHp(heal);
        if (healrec==0){
            System.out.println("");
        }
        else {
            System.out.println("You receive " + healrec + " heal");
        }
        return j;
    }
}
