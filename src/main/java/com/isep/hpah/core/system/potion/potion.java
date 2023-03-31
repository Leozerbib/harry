package com.isep.hpah.core.system.potion;
import com.isep.hpah.core.system.spell.AbstractSpell;
import com.isep.hpah.core.system.spell.spell;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

import static com.isep.hpah.core.system.spell.spell.*;
import static com.isep.hpah.core.system.spell.spell.wigardiumLeviosa;

@Getter@Setter

public class potion {
    private String name;
    private String action;
    private double hp;
    private int att;
    private int def;
    private int number;
    private int xp;
    public potion(String name,String action,double hp,int att, int def,int number,int xp){
        this.name=name;
        this.action= action;
        this.hp=hp;
        this.att=att;
        this.def=def;
        this.number=number;
        this.xp=xp;
    }
    public static potion littlePotion = new potion("Little Potion","heal", 0.2,0,0,3,0);
    public static potion mediumPotion = new potion("Medium Potion","heal", 0.5,0,0,0,0);
    public static potion bigPotion = new potion("Big Potion","heal", 1,0,0,0,0);
    public static potion Potion10xp = new potion("Potion EXP","Exp", 0,0,0,0,10);
    public static potion Potionatt = new potion("Potion att","Att", 0,50,0,0,0);



    public static ArrayList<potion> inventairepotion = new ArrayList<>();
    public static List<potion> potion(){
        //creating arrayList for new wizard

        //Known Spells that you start with

        inventairepotion.add(littlePotion);
        inventairepotion.add(mediumPotion);
        inventairepotion.add(bigPotion);
        inventairepotion.add(Potion10xp);
        inventairepotion.add(Potionatt);
        return inventairepotion;
    }
}
