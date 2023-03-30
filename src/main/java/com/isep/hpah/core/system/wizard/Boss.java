package com.isep.hpah.core.system.wizard;
import com.isep.hpah.core.Gamelogic;
import lombok.*;
import com.isep.hpah.core.system.spell.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.isep.hpah.core.system.spell.forbbidenSpell.*;
import static com.isep.hpah.core.system.spell.spell.*;
import static com.isep.hpah.core.system.wizard.enemy.EnnemyList;

@Getter@Setter
public class Boss extends AbstractEnnemy{
    private AbstractSpell spell;
    private AbstractSpell spell1;
    private AbstractSpell spell2;
    public Boss(String name, String type, int maxHP, double hp, double exp, int att, double def, String descrip, int level,double acc,int seen,AbstractSpell spell,AbstractSpell spell2,AbstractSpell spell1) {
        super(name, type, maxHP, hp, exp, att, def, descrip, level, acc);
        this.spell=spell;
        this.spell1=spell1;
        this.spell2=spell2;
    }
        public static Boss Voldemort = new Boss("Voldemort","Boss",300,300,2,30,0.2,"Geant serpent possedant des yeux rouge et du venin acide",2,0,0,avadaKedavra, expelliarmus, fire);
        public static ArrayList<Boss> allBoss= new ArrayList<>();
        public static List<Boss> BossList(){
            allBoss.add(Voldemort);
            return allBoss;

    }

    @Override
    public int attack() {
        return 0;
    }
    public static int validee;
    public static int validAccBoss(AbstractSpell Spelll){
        Random r = new Random();
        double randomval= r.nextDouble();
        double touch=Spelll.getAcc();
        if (touch < randomval){

            validee=1;
        }
        else {
            validee=0;
        }
        System.out.println(randomval);
        System.out.println(touch);
        System.out.println(validee);
        return validee;
    }
}
