package com.isep.hpah.core.system.dungeon;
import lombok.*;
@Getter@Setter

public abstract class AbstractDungeon {

    private String namechap;
    public String place;
    public String description;
    public String description2;
    public String description3;
    public AbstractDungeon( String namechap, String place, String description, String description2, String description3){
        this.namechap=namechap;
        this.place=place;
        this.description=description;
        this.description2= this.description2;
        this.description3= this.description3;
    }
}
