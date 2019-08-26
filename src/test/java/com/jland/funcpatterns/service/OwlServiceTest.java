package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.House;
import com.jland.funcpatterns.entity.Wizard;
import io.vavr.collection.List;
import org.junit.Test;


public class OwlServiceTest {

    @Test
    public void sendOwl() {
        OwlService owlService = new OwlService();

        Wizard dracoMalfoy = Wizard.builder().name("Draco Malfoy").house(House.SLYTHERIN).build();
        Wizard jinnyWeasley = Wizard.builder().name("Jinny Weasley").house(House.GRIFFINDOR).build();
        Wizard polumnaLovegood = Wizard.builder().name("Polumna Lovegood").house(House.RAVENCLAW).build();

        List<Wizard> wizards = List.of(dracoMalfoy, jinnyWeasley, polumnaLovegood);

        owlService.sendOwl(wizards);
    }
}
