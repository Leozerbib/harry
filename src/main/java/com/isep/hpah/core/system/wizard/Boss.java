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
import static com.isep.hpah.core.system.wizard.enemy.mangemort;

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
        public static Boss TrollVol = new Boss("Troll Voldemort","Boss",200,200,3,30,0.3,"Voldemort using a troll body to survive",2,0,0,Lightning,fire,poison);
        public static Boss Basilisk = new Boss("Basilisk","Boss",300,300,3,30,0.3,"Geant serpent possedant des yeux rouge et du venin acide",2,0,0,suctumincorruptibilis,Charge,poison);
        public static Boss WereWolf = new Boss("WereWolf","Boss",500,500,5,50,0.3,"Professor Lupin transformed into a werewolf",2,0,0,Croc,Charge,Charge);
        public static Boss PeterPetigrow = new Boss("Peter Petigrow","Boss",500,500,5,50,0.3,"The rat of ron was Peter Petigrow a ally of Voldemort",2,0,0,Lightning,riddikulus,fire);
        public static Boss DoloresOmbrage = new Boss("Dolores Ombrage","Boss",500,500,7,50,0.3,"she is an unhealthy, narrow-minded and particularly perverse, hypocritical woman.",2,0,0,suctumincorruptibilis,fire,accio);
        public static Boss BellatrixLestrange = new Boss("Bellatrix Lestrange","Boss",1000,1000,7,200,0.3,"Bellatrix was an intensely sadistic witch with brutal and violent tendencies.",2,0,0,sectumsempra,fire,poison);
        public static Boss Mangemort = new Boss("Ma,gmort","Boss",700,700,7,150,0.3,"Bellatrix was an intensely sadistic witch with brutal and violent tendencies.",2,0,0,sectumsempra,fire,poison);
        public static Boss Voldemort = new Boss("Lord Voldemort","Boss",1500,1500,10,300,0.4,"Voldemort était un sorcier anglais de sang-mêlé considéré comme le plus puissant et le plus dangereux des sorciers noirs de tous les temps.",2,0,0,avadaKedavra, expelliarmus, fire);
        public static ArrayList<Boss> allBoss= new ArrayList<>();
        public static List<Boss> BossList(){
            allBoss.add(TrollVol);
            allBoss.add(Basilisk);
            allBoss.add(WereWolf);
            allBoss.add(PeterPetigrow);
            allBoss.add(DoloresOmbrage);
            allBoss.add(Mangemort);
            allBoss.add(BellatrixLestrange);
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
        return validee;
    }
}
