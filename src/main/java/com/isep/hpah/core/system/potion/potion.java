package com.isep.hpah.core.system.potion;
import lombok.*;
@Getter@Setter

public class potion {
    private String name;
    private String action;
    private int hp;
    private int att;
    private int def;
    private int ener;
    public potion(String name,String action,int hp,int att, int def,int ener){
        this.name=name;
        this.action= action;
        this.hp=hp;
        this.att=att;
        this.def=def;
        this.ener=ener;
    }
}
