package com.isep.hpah.core;
import java.util.Scanner;

import com.isep.hpah.core.system.*;
import com.isep.hpah.core.system.potion.potion;
import com.isep.hpah.core.system.spell.listSpell;
import com.isep.hpah.core.system.wizard.Boss;
import com.isep.hpah.core.system.wizard.enemy;
import lombok.*;

@Getter @Setter
public class Main {
    public static String name;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        method.printLine(60);
        System.out.println(" ");
        method.printLine(40);
        System.out.println(" ");
        System.out.println("\u001B[40m"+"Welcome to HARRY POTTER RPG");
        System.out.println("Made by Leo Zerbib");
        Boss.BossList();
        enemy.EnnemyList();
        method.printLine(40);
        System.out.println(" ");
        method.printLine(60);
        System.out.println(" ");
        method.enterContinue();
        method.clearConsole();
        method.printLine(50);
        System.out.println(
                "You play as a young wizard or witch who has just arrived at Hogwarts, the renowned school of magic led by the famous headmaster Albus Dumbledore. " +
                        "\nYou are immediately thrust into an exciting adventure when you discover that a dark plot is unfolding within the school's walls. " +
                        "\nDark forces are seeking to obtain the Philosopher's Stone, a legendary artifact that could give unlimited power to whoever possesses it.\n" +
                        "\n" +
                        "With the help of your friends Ron Weasley and Hermione Granger, as well as your loyal professors and allies, you must navigate the dark and mysterious corridors of Hogwarts, face formidable enemies, and unravel the secrets of the Philosopher's Stone before it falls into the wrong hands. " +
                        "\nWill you have what it takes to save the day and become a true hero of the wizarding world? " +
                        "\nThe fate of Hogwarts and all who dwell within its walls is in your hands.");
        method.printLine(70);
        method.enterContinue();
        method.clearConsole();
        method.printLine(70);
        System.out.println(" ");
        System.out.println("Please choose your sorceler name :");
        name = sc.nextLine();
        System.out.println("Mmmh that a nice name, well " + name +" i won't call my child like that bue okay.\nYou can know go see the sorting hat he will give you the best house tha will fit you the best.");
        method.printLine(70);
        System.out.println(" ");
        method.enterContinue();
        method.clearConsole();
        method.printLine(150);
        System.out.println(" ");
        System.out.println("III ammmmmm the sortinggg hattt, anddd III will choooose your houseee. \nMmmmmmmmmmmmmmmmmmmmh your willlll beeee Mmmmh hard choiiice, mayby mmmmmmmmmmmmh, I KNOWWWW you will beeeeee" + " " + sorting_hat.sorting_hat());
        switch (sorting_hat.getSelectedhouse()){
            case "Gryffondor" :
                System.out.println("Wow the sorting hat choose Gryfondor as your new house. \nGryffindor House is named after Godric Gryffindor , one of the school 's four founders . Its coat of arms is a golden lion on a red background. \nYou have more damage then the other house");
                System.out.println(" ");
                method.enterContinue();
                break;
            case "Slytherin" :
                System.out.println("Wow the sorting hat choose Slytherin as your new house. \nSlytherin was one of the four Houses at Hogwarts School of Witchcraft and Wizardry, founded by Salazar Slytherin. \nYou have more critical then the other house");
                System.out.println(" ");
                method.enterContinue();
                break;
            case "Hufflepuff":
                System.out.println("Wow the sorting hat choose Hufflepuff as your new house. \nHufflepuff was one of the four Houses of Hogwarts School of Witchcraft and Wizardry. Its founder was the medieval witch Helga Hufflepuff. \nYou have more health then the other house");
                System.out.println(" ");
                method.enterContinue();
                break;
            case "Ravenclaw" :
                System.out.println("Wow the sorting hat choose Ravenclaw as your new house. \nRavenclaw was one of the four Houses of Hogwarts School of Witchcraft and Wizardry. Its founder was the medieval witch Rowena Ravenclaw. \nYou have more speed then the other house");
                System.out.println(" ");
                method.enterContinue();
                break;
        }
        method.clearConsole();
        method.printLine(60);
        System.out.println(" ");
        System.out.println("Ok " + name + " you can know go to the wand shop and find the best wand that suit you the best.");
        method.enterContinue();
        System.out.println(" ");
        method.printLine(150);
        System.out.println(" ");
        wand.choose_wand();
        System.out.println(" ");
        method.printLine(60);
        System.out.println(" ");
        System.out.println("Perfect before joining your house you must choose a pet that will follow you during your time in Hogwart.");
        System.out.println("You can go see Aagrid he know everything about pet.");
        System.out.println(" ");
        method.printLine(150);
        System.out.println(" ");
        method.enterContinue();
        method.clearConsole();
        System.out.println(" ");
        method.printLine(60);
        System.out.println(" ");
        System.out.println("knock knock");
        System.out.println("Hi there are you " + name +" Dumbledore told me about your visit.");
        System.out.println(" ");
        method.printLine(60);
        System.out.println(" ");
        method.enterContinue();
        method.clearConsole();
        pet.choosePet();
        Gamelogic.stat();
        listSpell.SpellList();
        potion.potion();
        method.printLine(70);
        method.enterContinue();
        method.printTitle("Rules :");
        System.out.println("1.  Combat is turn-based. Each player takes a turn to attack or defend.\n" +
                "\n" +
                "2.   Simple enemies have only one attack, while bosses use spells. Bosses have three spells, two of which are normal and one is forbidden. " +
                "\n    The forbidden spell can only be used every fifth turn, but it is more powerful than the other spells. " +
                "\n    Players need to heal themselves before the forbidden spell is activated.\n" +
                "\n" +
                "3.   At the beginning of the game, players have four spells. " +
                "\n    These spells can be used to attack or heal, but they have a certain level of accuracy and can miss their targets. " +
                "\n    As players progress through the chapters of the game, they can learn new spells. " +
                "\n    To learn a new spell, players must replace one of their existing spells." +
                "\n" +
                "4.   When you defeat enemies, you gain experience points (XP). As you gain XP, you level up and improve your stats such as attack, HP, and defense.");
        method.printLine(50);
        method.enterContinue();
        method.clearConsole();
        Story.chapitre(0);
        Story.chapitre(1);
        Story.chapitre(3);
        Story.chapitre(4);
        Story.chapitre(5);
        Story.chapitre(6);
        Story.chapitre(7);
        }


    }
