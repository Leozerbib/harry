package com.isep.hpah.core.system.dungeon;
import com.isep.hpah.core.system.spell.spell;
import lombok.*;
@Getter@Setter

public class dungeon extends AbstractDungeon {
    public dungeon( String namechap, String place, String description, String description2, String description3) {
        super( namechap, place, description,description2,description3);
    }

    public static final dungeon[] chapters = {
        new dungeon(
                    "Chapter 1: The philosopher stone",
                    "The toilet of the dungeon",
                    "On your first day at Hogwarts, you are sorted into Gryffindor House and meet your new friends Ron Weasley and Hermione Granger. " +
                            "\nAs you attend classes and explore the castle, you begin to uncover strange happenings, including a break-in at Gringotts Wizarding Bank and the appearance of a three-headed dog guarding a trapdoor.\n" +
                            "\n" +
                            "With the help of Ron and Hermione, you sneak out of Gryffindor Tower at night to investigate the trapdoor. " +
                            "\nYou discover that it leads to a hidden chamber containing the Philosopher's Stone, and you realize that someone is trying to steal it. " +
                            "\nYou must find a way to stop the thief and protect the Stone before it falls into the wrong hands.\n" +
                            "\n" +
                            "As you explore the castle and face dangerous challenges, you learn more about the wizarding world and your own magical abilities. " +
                            "\nWith the fate of the Philosopher's Stone and the safety of Hogwarts at stake, you must use all of your skills and cunning to defeat the enemy and emerge victorious.",
                    "Someone is trying to steal the stone you want to stop him at any cost",
                    " you found him it was a Troll it's time to deal with him"),
            new dungeon("Chapitre 2 : The Chamber of Secrets","The Chamber of Secrets","","","")
           // Add more chapters as needed
    };
}
