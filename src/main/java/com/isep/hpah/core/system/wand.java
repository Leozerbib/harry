package com.isep.hpah.core.system;

import java.util.Random;
import java.util.Scanner;

import com.isep.hpah.core.method;
import lombok.*;
@Getter@Setter
public class wand {

    private String name;
    private static String size;
    private static String core1;
    private com.isep.hpah.core.system.wand wand;

    public wand(String name, String size, String core) {
        this.name = name;
        this.size = size;
        this.core1 = core;
    }

    public static void choose_wand() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the best wand shop in town! I'm Luna, the wand master. What size of wand do you want?");
        System.out.println("The minimum size is 10 and the maximum is 20. Keep in mind that a larger size does more damage but has a lower critical hit rate.");

        String sizeAnswer;
        do {
            sizeAnswer = sc.nextLine();
        } while (!isValidSize(sizeAnswer));
        method.enterContinue();
        method.clearConsole();

        System.out.println("What core do you want for your wand?");
        System.out.println("The available cores are: ");
        for (Core c : Core.values()) {
            System.out.println((c.ordinal() + 1) + ". " + c.name());
        }
        System.out.println("If you want a random core, input 'random'.");

        int coreAnswer;
        do {
            System.out.println("Please write the name or number of the core you want.");
            coreAnswer = sc.nextInt()
            ;
        } while (!isValidCore(String.valueOf(coreAnswer)));
            if (coreAnswer >= 1 && coreAnswer <= 5){
                Core[] values = Core.values();
                int length = values.length;
                core1 = String.valueOf(Core.values()[coreAnswer-1]);
        }
            else if (coreAnswer == 0){
            Core[] values = Core.values();
            int length = values.length;
            int rand = new Random().nextInt(length);
            core1 = String.valueOf(Core.values()[rand]);
        }
        wand wand = new wand("Unnamed", sizeAnswer, core1);
        method.clearConsole();
        System.out.println("Great! Your wand's core is made of " + wand.getCore() + " and its size is " + wand.getSize() + ". It's a unique wand, so be sure to take good care of it!");
        System.out.println(" ");
        method.printLine(60);
        System.out.println(" ");
        method.enterContinue();
        method.clearConsole();
    }

    private static boolean isValidSize(String size) {
        try {
            int s = Integer.parseInt(size);
            return s >= 10 && s <= 20;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidCore(String coreAnswer) {
        try {
            int coreIndex = Integer.parseInt(coreAnswer);
            if (coreIndex >= 1 && coreIndex <= Core.values().length) {
                return true;
            }
        } catch (NumberFormatException e) {}
        return Core.isValidCoreName(coreAnswer) || "random".equals(coreAnswer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static String getCore() {
        return core1;
    }

    public void setCore(String core1) {
        this.core1 = core1;
    }


    public wand getWand() {
        return wand;
    }
}

