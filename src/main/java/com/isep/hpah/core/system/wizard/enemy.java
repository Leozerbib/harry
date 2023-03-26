package com.isep.hpah.core.system.wizard;
import lombok.*;
@Getter@Setter
public class enemy extends AbstractEnnemy{
    public enemy(String name, String type, int maxHP, int hp, double exp, int att, double def, String descrip, int level) {
        super(name, type, maxHP, hp, exp, att, def, descrip, level);
    }

    @Override
    public int attack() {
        return 0;
    }

}
