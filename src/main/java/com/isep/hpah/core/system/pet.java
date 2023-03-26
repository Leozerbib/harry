package com.isep.hpah.core.system;

import java.util.Scanner;

import com.isep.hpah.core.method;
import lombok.Getter;
import lombok.Setter;

public enum pet {
    OWL("Owl"),
    CAT("Cat"),
    TOAD("Toad"),
    RAT("Rat"),
    PHOENIX("Phoenix"),
    HIPPOGRIFF("Hippogriff"),
    DOG("Dog"),
    PYGMY_PUFF("Pygmy Puff");

    @Getter @Setter
    private String name;

    pet(String name) {
        this.name = name;
    }

    static int i = 1;
    public static String petPlayer;

    public static String choosePet() {
        Scanner sc = new Scanner(System.in);
        for (pet pet : pet.values()) {
            System.out.println(i + ". " + pet.getName());
            i = i + 1;
        }

        int selectedPet;
        while (true) {
            System.out.println("Choose the one you want");
            selectedPet = sc.nextInt();
            if (selectedPet > 0 && selectedPet <= pet.values().length) {
                break;
            }
            System.out.println("Invalid input, please choose again");
        }

        petPlayer = pet.values()[selectedPet - 1].getName();
        System.out.println("Nice choice! " + petPlayer + " are amazing friends.");
        System.out.println(" ");
        method.printLine(60);
        System.out.println(" ");
        method.enterContinue();
        method.clearConsole();
        return petPlayer;
    }
}
