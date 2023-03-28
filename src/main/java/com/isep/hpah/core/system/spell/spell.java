package com.isep.hpah.core.system.spell;
import lombok.*;

import java.util.ArrayList;

@Getter@Setter
public class spell extends AbstractSpell {

    private int level;

    public spell(String nameSpell, int num, int damage, int energie, int time, String type, double acc, int level, double heal, double def, double boost, int effect) {
        super(nameSpell, num, damage, energie, time, type, acc, heal, def, boost, effect);
        this.level = level;
    }

        public static spell reparo = new spell("reparo",1,1,10,0,"tool",0.7,2,0.3,0.2,1.5,0);
        public static spell alohomora = new spell("alohomora",2,1,20,0,"tool",0.9,3,0,0,2,0);
        public static spell expelliarmus =new spell("expelliarmus",3,50,30,2,"dmg",0.7,5,0.3,0,0,1);
        public static spell expectoPatronum = new spell("expectoPatronum",4, 25,30,1,"def",0.7,3,0,0.7,1.2,2);
        public static spell wigardiumLeviosa = new spell("wigardiumLeviosa",5,15,10,1,"tool",0.8,1,0,0,0,3);
        public static spell petrificusTotalus = new spell("petrificusTatalus",6,5,30,3,"def",0.6,4,0,0,0,4);
        public static spell riddikulus = new spell("riddikulus",7,10,10,1,"mal",0.5,4,0,0.5,1.2,3);
        public static spell accio = new spell("accio",8,20,10,1,"dmg",1,2,0.2,0.3,1.1,3);
        public static spell lumos = new spell("lumos",9,1,1,0,"tool",1,1,0,0,0,5);
        public static spell fire = new spell("fire",10,15,10,0,"dmg",0.8,1,0,0,0,6);

    }


