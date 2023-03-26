package com.isep.hpah.core.system.wizard;
import lombok.*;
@Getter@Setter
public abstract class AbstractEnnemy extends character {
    private String descrip;
    private int level;
    public AbstractEnnemy(String name, String type, int maxHP, int hp, double exp, int att, double def,String descrip,int level) {
        super(name, type, maxHP, hp, exp, att, def);
        this.descrip=descrip;
        this.level=level;
    }
}
