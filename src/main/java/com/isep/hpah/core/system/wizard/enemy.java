package com.isep.hpah.core.system.wizard;
import com.isep.hpah.core.system.spell.AbstractSpell;
import com.isep.hpah.core.system.spell.spell;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

import static com.isep.hpah.core.system.spell.spell.*;
import static com.isep.hpah.core.system.spell.spell.wigardiumLeviosa;

@Getter@Setter
public class enemy extends AbstractEnnemy{
    private int seen;
    public enemy(String name, String type, int maxHP, double hp, double exp, int att, double def, String descrip, int level,double acc,int seen,int number, int potion) {
        super(name, type, maxHP, hp, exp, att, def, descrip, level,acc,number,potion);
        this.seen=seen;
    }

    public static enemy GiantSpider = new enemy("GiantSpider","ennemy",200,200,2,60,0.2,"Giant Spiders raise by Hagrid",2,0,1,3,0);
    public static enemy troll = new enemy("Troll","ennemy",100,100,1,20,0.1,"Petit agressif et peu inteligent",1,0,1,1,0);
    public static enemy mangemort = new enemy("Mangemort","ennemy",500,500,4,100,0.2,"Death Eaters are recognizable by their long black wizarding robes and the white mask used to conceal their faces.",5,0,1,2,1);
    public static enemy detraqueur = new enemy("Detraqueur","ennemy",300,300,3,180,0.1,"Dementors are flying, dark, dark, and ominous creatures.",3,0,1,2,1);
    public static ArrayList<enemy> allEnnemy= new ArrayList<>();
    public static List<enemy> EnnemyList(){
        allEnnemy.add(troll);
        allEnnemy.add(GiantSpider);
        allEnnemy.add(mangemort);
        allEnnemy.add(detraqueur);
        return allEnnemy;
    }

    @Override
    public int attack() {
        return 0;
    }
}
