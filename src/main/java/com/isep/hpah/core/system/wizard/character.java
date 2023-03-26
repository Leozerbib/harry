package com.isep.hpah.core.system.wizard;
import lombok.*;

import com.isep.hpah.core.Main;

public abstract class character {
    @Getter@Setter
    private String name;
    @Getter@Setter
    private String type;
    @Getter@Setter
    private int maxHP;
    @Getter@Setter
    public int hp;
    @Getter@Setter
    private double exp;
    @Getter@Setter
    private int att;
    @Getter@Setter
    private double def;
    public abstract int attack();
    public character(String name,String type,int maxHP,int hp,double exp, int att,double def){
        this.name=name;
        this.type=type;
        this.maxHP=maxHP;
        this.hp=maxHP;
        this.exp=exp;
        this.att=att;
        this.def=def;
    }


}