package com.isep.hpah.core.system.spell;
import lombok.*;

@Getter @Setter
public abstract class AbstractSpell {
    private String nameSpell;
    private int num;
    private int damage;
    private int energie;
    public double acc;
    private int time;
    private String type;
    private double heal;
    private double def;
    private double boost;
    private int effect;
    public AbstractSpell(String nameSpell,int num, int damage, int energie,int time, String type, double acc,double heal,double def,double boost,int effect){
        this.nameSpell= nameSpell;
        this.num=num;
        this.damage=damage;
        this.energie= energie;
        this.time=time;
        this.type=type;
        this.acc=acc;
        this.heal=heal;
        this.def=def;
        this.boost=boost;
        this.effect=effect;


    }


}
