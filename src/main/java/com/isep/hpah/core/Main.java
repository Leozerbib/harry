package com.isep.hpah.core;
import java.util.Scanner;

import com.isep.hpah.core.system.*;
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
        System.out.println("Welcome to HARRY POTTER RPG");
        System.out.println("Made by Leo Zerbib");
        method.printLine(40);
        System.out.println(" ");
        method.printLine(60);
        System.out.println(" ");
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
        StartAdventure.stat();
        }


    }
