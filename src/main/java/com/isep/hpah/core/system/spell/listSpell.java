package com.isep.hpah.core.system.spell;

import java.util.ArrayList;
import java.util.List;
import lombok.*;

import static com.isep.hpah.core.system.spell.spell.*;

@Getter@Setter
public class listSpell  {
    public static ArrayList<spell> SpellsStart = new ArrayList<>();
    public static List<spell> SpellList(){
        //creating arrayList for new wizard

        //Known Spells that you start with

        SpellsStart.add(lumos);
        SpellsStart.add(fire);
        SpellsStart.add(petrificusTotalus);
        SpellsStart.add(wigardiumLeviosa);
        return SpellsStart;
    }


}
