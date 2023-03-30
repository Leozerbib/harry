package com.isep.hpah.core.system.dungeon;
import com.isep.hpah.core.system.spell.AbstractSpell;
import com.isep.hpah.core.system.spell.spell;
import com.isep.hpah.core.system.wizard.AbstractEnnemy;
import com.isep.hpah.core.system.wizard.Boss;
import com.isep.hpah.core.system.wizard.enemy;
import lombok.*;
@Getter@Setter

public abstract class AbstractDungeon {

    private String namechap;
    public String place;
    private int ennemy;
    private int boss;
    private AbstractSpell Spell;
    public String description;
    public String description2;
    public String description3;
    public String description4;
    public String description5;
    public AbstractDungeon( String namechap, String place, String description, String description2, String description3,String description4, String description5,int ennemy,int boss,AbstractSpell Spell){
        this.namechap=namechap;
        this.place=place;
        this.description=description;
        this.description2= description2;
        this.description3= description3;
        this.description4= description4;
        this.description5= description5;
        this.ennemy=ennemy;
        this.boss=boss;
        this.Spell=Spell;
    }
}
