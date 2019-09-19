package com.jland.funcpatterns.dao;

import com.jland.funcpatterns.entity.House;
import com.jland.funcpatterns.entity.Spell;
import com.jland.funcpatterns.entity.Wizard;

import java.util.List;

public class SpellRepo {
    public List<Spell> findAll(){
        Spell spell = new Spell("wingardium", "leviOssa", "!");
        Spell spell1 = new Spell("expecto", "patronum", "!");
        return List.of(spell, spell1);
    }

}
