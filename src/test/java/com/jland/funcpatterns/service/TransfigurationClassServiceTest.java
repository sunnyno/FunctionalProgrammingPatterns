package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.Animal;
import com.jland.funcpatterns.entity.Wizard;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.util.List;

@Log4j2
public class TransfigurationClassServiceTest {

    @Test
    public void getWaterGoblets() {
        TransfigurationClassService transfigurationClassService = new TransfigurationClassService();
        List<Animal> animals = List.of(
                new Animal("Hedwig", "owl"),
                new Animal("Scebbers", "rat"),
                new Animal("Fluffy", "cat"));
        List<String> waterGoblets = transfigurationClassService.getWaterGoblets(animals);
        waterGoblets.forEach(log::info);
    }

    @Test
    public void getAnimals(){
        Animal animal = new TransfigurationClassService()
                .getAnimal(Wizard.builder()
                        .animal(new Animal("Scabbers", "rat"))
                        .build());
        log.info("Transfigure " + animal);
    }
}
