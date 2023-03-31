package com.isep.hpah.core.system.wizard;
import lombok.*;
@Getter@Setter
public abstract class AbstractEnnemy extends character {
    private String descrip;
    private int level;
    private int seen;
    private int number;
    private int potion;
    public AbstractEnnemy(String name, String type, int maxHP, double hp, double exp, int att, double def,String descrip,int level,double acc,int number,int potion) {
        super(name, type, maxHP, hp, exp, att, def,acc);
        this.descrip=descrip;
        this.level=level;
        this.number=number;
        this.potion=potion;
    }
}
