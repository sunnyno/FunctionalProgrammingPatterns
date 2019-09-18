package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.Animal;
import com.jland.funcpatterns.entity.Wizard;
import com.jland.funcpatterns.exception.BrokenWandException;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class TransfigurationClassService {

    public List<String> getWaterGoblets(List<Animal> animals) {
        return null;
//                animals.stream()
//                .map(this::fereverto)
//                .collect(Collectors.toList());
    }

    private String fereverto(Animal animal) throws BrokenWandException {
        log.info("Transforming {}", animal);
        if (Math.random() < 0.5) {
            throw new BrokenWandException("This wand needs replacement");
        }
        String goblet = animal.getName() + " goblet";
        log.info(goblet);
        return goblet;
    }


    public Animal getAnimal(Wizard wizard) {
        Animal animal = wizard.getAnimal();
        if (animal != null) {
            return getAndLogAnimal(animal, "getting own animal");
        } else {
            Animal defaultAnimal = new Animal("default", "owl");
            return getAndLogAnimal(defaultAnimal, "getting default owl");
        }
    }

    private Animal getAndLogAnimal(Animal animal, String message) {
        System.out.println(message);
        return animal;
    }
}
