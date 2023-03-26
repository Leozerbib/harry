package com.isep.hpah.core.system.spell;

import java.util.ArrayList;
import java.util.List;
import lombok.*;
import com.isep.hpah.core.system.spell.spell.*;

import static com.isep.hpah.core.system.spell.spell.*;
import com.isep.hpah.core.system.spell.AbstractSpell;
@Getter@Setter
public class listSpell  {
    public static List<AbstractSpell> SpellsStart = new ArrayList<>();
    public static List<AbstractSpell> startingSpellList(){
        //creating arrayList for new wizard

        //Known Spells that you start with
        SpellsStart.add(lumos);
        SpellsStart.add(fire);
        SpellsStart.add(wigardiumLeviosa);
        return SpellsStart;
    }
    public static void addSpell(AbstractSpell spell) {
        SpellsStart.add(spell);
    }



}
