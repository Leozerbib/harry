package com.isep.hpah.core.system.spell;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class forbbidenSpell extends AbstractSpell {
    public forbbidenSpell(String nameSpell, int num, int damage, int energie, int time, String type,double acc,double heal,double def,double boost,int effect ) {
        super(nameSpell, num, damage, energie, time, type,acc,heal,def,boost,effect);
    }
    public static forbbidenSpell avadaKedavra = new forbbidenSpell("avadaKedavra",1,1200,100,3,"dmg",0.6,0,0,0,0);
    public static forbbidenSpell sectumsempra = new forbbidenSpell("sectumsempra",2,700,60,2,"dmg",0.80,0,0,0,0);
    public static forbbidenSpell suctumincorruptibilis = new forbbidenSpell("suctumincorruptibilis",3,0,100,3,"dmg",0.8,0.3,1,1.5,0);
    public static forbbidenSpell phoenixregeneratio = new forbbidenSpell("phoenixregeneratio",4,0,60,2,"dmg",0.6,1,0.5,0,0);
    public static forbbidenSpell Lightning = new forbbidenSpell("ligtning",4,250,60,2,"dmg",0.7,0,0,0,0);
    public static forbbidenSpell Croc = new forbbidenSpell("Croc",4,150,60,2,"dmg",0.7,0,0,0,0);

}
