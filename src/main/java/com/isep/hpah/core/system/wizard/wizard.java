package com.isep.hpah.core.system.wizard;

import com.isep.hpah.core.Main;
import com.isep.hpah.core.method;
import com.isep.hpah.core.system.pet;
import com.isep.hpah.core.system.sorting_hat;
import com.isep.hpah.core.system.spell.spell;
import com.isep.hpah.core.system.wand;
import lombok.Getter;
import lombok.Setter;
import java.util.Scanner;


@Getter @Setter
public class wizard extends character {

    private String petPlayer;
    private String selectedhouse;
    private static wand wand;
    private int year;
    private int level;
    private spell acc;
    private spell damage;
    public wizard(String name, String type, int maxHP, int hp, double exp, int att, double def, String selectedhouse, String petPlayer, int year, int level) {
        super(name, type, maxHP, hp, exp, att, def);
        this.petPlayer= petPlayer;
        this.selectedhouse=selectedhouse;
        this.year=year;
        this.level=level;


        switch(sorting_hat.selectedhouse){
            case "Ravenclaw":
                spell.acc +=0.1;
                break;
            case "Slytherin":
                spell.damage = (int) (spell.damage * 1.1);
                break;
            case "Hufflepuff":
                break;
            case "Gryffondor":
                this.setDef(def * 1.2);
                break;
        }
    }
    public static wizard player = new wizard(Main.name,"player",100,100,0,10,0.1,sorting_hat.selectedhouse,pet.petPlayer,1,1);

    @Override
    public int attack() {
        return 0;
    }

    public int defense() {
        return 0;
    }
    public void choose(){
        Scanner sc = new Scanner(System.in);
        method.clearConsole();
        method.printLine(50);
        System.out.println("1. " + "use a spell");
        System.out.println("2. " + "use a potion");
        int choice = sc.nextInt();
        if (choice==1) {
            System.out.println("You choose to use a spell, wich one do you want to use ?");
        }
        else if (choice==2){
            System.out.println("You choose to use a spell, wich one do you want to use ?");
        }

    }
}

