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
    public enemy(String name, String type, int maxHP, double hp, double exp, int att, double def, String descrip, int level,double acc,int seen) {
        super(name, type, maxHP, hp, exp, att, def, descrip, level,acc);
        this.seen=seen;
    }

    public static enemy basilik = new enemy("Basilik","basilik",300,300,2,30,0.2,"Geant serpent possedant des yeux rouge et du venin acide",2,0,1);
    public static enemy troll = new enemy("Troll","ennemy",100,100,1,10,0.1,"Petit agressif et peu inteligent",1,0,1);
    public static ArrayList<enemy> allEnnemy= new ArrayList<>();
    public static List<enemy> EnnemyList(){
        allEnnemy.add(troll);
        allEnnemy.add(basilik);
        return allEnnemy;
    }

    @Override
    public int attack() {
        return 0;
    }
}
