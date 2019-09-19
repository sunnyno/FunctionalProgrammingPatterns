package com.jland.funcpatterns.dao;

import com.jland.funcpatterns.entity.House;
import com.jland.funcpatterns.entity.Wizard;

import java.util.List;

public class WizardRepo{
    public List<Wizard> findAll(){
        Wizard dracoMalfoy = Wizard.builder().name("Draco Malfoy").house(House.SLYTHERIN).build();
        Wizard jinnyWeasley = Wizard.builder().name("Jinny Weasley").house(House.GRIFFINDOR).build();
        Wizard polumnaLovegood = Wizard.builder().name("Polumna Lovegood").house(House.RAVENCLAW).build();
        return List.of(dracoMalfoy, jinnyWeasley, polumnaLovegood);
    }
}
