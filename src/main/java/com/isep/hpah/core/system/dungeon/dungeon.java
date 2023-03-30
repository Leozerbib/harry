package com.isep.hpah.core.system.dungeon;
import com.isep.hpah.core.system.spell.AbstractSpell;
import com.isep.hpah.core.system.spell.forbbidenSpell;
import com.isep.hpah.core.system.spell.spell;
import com.isep.hpah.core.system.wizard.AbstractEnnemy;
import com.isep.hpah.core.system.wizard.Boss;
import com.isep.hpah.core.system.wizard.enemy;
import lombok.*;

import static com.isep.hpah.core.system.wizard.wizard.player;

@Getter@Setter

public class dungeon extends AbstractDungeon {
    public dungeon(String namechap, String place, String description, String description2, String description3, String description4, String description5, int ennemy, int boss, AbstractSpell Spell) {
        super( namechap, place, description,description2,description3,description4,description5,ennemy,boss,Spell);
    }

    public static final dungeon[] chapters = new dungeon[]{
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
                    "You finnally found the toilet but there is a Troll blocking the way.",
                    "You enter the Toilet of the dungeon you here some noise, You and your friend are getting to it.",
                    "you found him it is Voldemort using a Troll body it's time to deal with him is weak.   ",

                    "In a tense and thrilling battle, you and your friends manage to defeat Voldemort and prevent him from obtaining the stone. " +
                            "\nWith the danger averted, Harry can finally relax and enjoy the rest of his time at Hogwarts.\n" +
                            "\n" +
                            "\nAs the first chapter draws to a close, you realizes that your adventures at Hogwarts are just beginning, and that you will need to stay vigilant in order to protect yourdelf and your friends from the dark forces that are still lurking in the shadows.",
                    0,
                    0,
                    spell.accio
            ),
            new dungeon(
                    "Chapitre 2 : The Chamber of Secrets",
                    "The Chamber of Secrets",
                    "As " + player.getName() + " you return to Hogwarts for your second year, excited to reunite with your friends and continue your magical education. " +
                            "\nHowever, strange things begin to happen once again when students are petrified by an unknown creature roaming the castle.\n" +
                            "\n" +
                            "\nWith the help of Ron and Hermione, you investigate the mystery and discover that the Chamber of Secrets has been opened, unleashing a deadly monster that only the heir of Slytherin can control. " +
                            "\nAs suspicions fall on you, you must clear your name and find the true culprit before more students are attacked.\n" +
                            "\n" +
                            "\nYou delve deeper into the secrets of Hogwarts and the dark history of Salazar Slytherin, learning more about magic and the dangers that lurk in the shadows.",
                    " You face off against giant spiders.",
                    "You discovers a mysterious diary that used to belong to Tom Riddle, which allows him to communicate with Tom and learn about the monster attacking the students. " +
                            "`\nWith this new information, you shares it with his friends, but they are unsure if Hagrid purposely set the monster loose. " +
                            "\nWhen the diary is stolen and Hermione is petrified,  and you and Ron decide to interrogate Hagrid using the invisibility cloak to find out the truth about the monster's whereabouts. " +
                            "\nThe game players must navigate through Hogwarts to find Hagrid, avoid detection, and uncover the secrets behind the monster's attacks.",
                    " You finnally enter the Chamber of Secret and fall in front of the Basilisk !!",
                    " After confronting the heir of Slytherin and defeating the basilisk in the Chamber of Secrets, you, Ron, and Hermione return to the surface to find that the entire school is in chaos. " +
                            "\nThe petrified students have been revived by the Mandrake Restorative Draught, but the news of the Chamber's existence and the danger it posed to Hogwarts has spread like wildfire.\n" +
                            "\n" +
                            "\nAs you make your way back to the " + player.getSelectedhouse() + " common room, you are met with a mixture of relief, admiration, and suspicion. " +
                            "\nSome students praise you for your bravery and heroism, while others whisper that you may have been involved in the attacks yourself. " +
                            "\nThe teachers and Headmaster Dumbledore are also curious about your connection to the Chamber and the diary of Tom Riddle, which you had found and destroyed.\n" +
                            "\n" +
                            "\nIn the aftermath of the crisis, you attend a special ceremony to honor those who fought against the dark forces that threatened Hogwarts. " +
                            "\nDumbledore commends you for your courage and resourcefulness, and reveals that he had suspected the true identity of the heir of Slytherin all along. " +
                            "\nHe also hints at the possibility that there may be other secrets and threats hidden within Hogwarts, and urges you to remain vigilant and open-minded.",
                    1,
                    1,
                    spell.expectoPatronum

            ),
            new dungeon(
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "As You, Ron, and Hermione stood in the Great Hall, You watched as Professor Lupin transformed into a werewolf before your eyes. " +
                            "\nPanic swept through the students as you scrambled to escape. But you, Ron, and Hermione stood your ground, determined to protect yourself and each other.\n" +
                            "\n" +
                            "\nAs the werewolf charged towards you, Hermione quickly cast a powerful spell, causing the creature to stumble and fall. " +
                            "\nYou and Ron seized the opportunity and together you managed to subdue Lupin.\n" +
                            "\n" +
                            "\nAs the dust settled, Dumbledore approached you, his eyes twinkling with pride. " +
                            "\n\"Well done, my dear students,\" he said. \"You have shown great bravery and resourcefulness today. I am proud of you all.\"\n" +
                            "\n" +
                            "\nWith the threat of the werewolf neutralized, the trio breathed a sigh of relief. " +
                            "\nYou had once again proven that you were a formidable team, capable of facing even the darkest of foes.\n" +
                            "\n" +
                            "\nAs you made your way back to your dormitories, you couldn't help but feel a sense of unease. " +
                            "\nYou knew that there were still many mysteries surrounding your parents' death and the evil Lord Voldemort. " +
                            "\nBut for now, you are content to enjoy the moment and bask in the warmth of Your friends' support. " +
                            "\nTogether, you would face whatever challenges lay ahead.",
                    3,
                    2,
                    spell.poison


                    ),
            new dungeon(
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    3,
                    7,
                    spell.expelliarmus


            ),
            new dungeon(
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    2,
                    4,
                    spell.alohomora


            ),
            new dungeon(
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    2,
                    5,
                    forbbidenSpell.Lightning


            ),
            new dungeon(
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    6,
                    7,
                    forbbidenSpell.avadaKedavra


            ),
            // Add more chapters as needed
    };

}
