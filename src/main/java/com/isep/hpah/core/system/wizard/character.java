package com.isep.hpah.core.system.wizard;
import com.isep.hpah.core.system.spell.listSpell;
import lombok.*;

import com.isep.hpah.core.Main;

import static com.isep.hpah.core.system.wizard.wizard.player;

public abstract class character {
    @Getter@Setter
    private String name;
    @Getter@Setter
    private String type;
    @Getter@Setter
    private int maxHP;
    @Getter@Setter
    public double hp;
    @Getter@Setter
    private double exp;
    @Getter@Setter
    private int att;
    @Getter@Setter
    private double def;
    private double acc;
    public abstract int attack();
    public character(String name,String type,int maxHP,double hp,double exp, int att,double def,double acc){
        this.name=name;
        this.type=type;
        this.maxHP=maxHP;
        this.hp=maxHP;
        this.exp=exp;
        this.att=att;
        this.def=def;
        this.acc=acc;
    }
}