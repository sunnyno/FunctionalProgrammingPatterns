package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.Animal;
import com.jland.funcpatterns.entity.Wizard;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class TransfigurationClassServiceTest {

    @Test
    public void getWaterGoblets() {
        TransfigurationClassService transfigurationClassService = new TransfigurationClassService();
        List<Animal> animals = List.of(
                new Animal("Hedwig", "owl"),
                new Animal("Scebbers", "rat"),
                new Animal("Fluffy", "cat"));
        List<String> waterGoblets = transfigurationClassService.getWaterGoblets(animals);
        waterGoblets.forEach(System.out::println);
    }

    @Test
    public void getAnimals(){
        Animal animal = new TransfigurationClassService()
                .getAnimal(Wizard.builder()
                        .animal(Optional.of(new Animal("Scabbers", "rat")))
                        .build());
        System.out.println("Transfigure " + animal);
    }
}
