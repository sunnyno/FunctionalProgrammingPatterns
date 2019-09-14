package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.Animal;
import com.jland.funcpatterns.entity.Wizard;
import com.jland.funcpatterns.exception.BrokenWandException;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Log4j2
public class TransfigurationClassService {

    public List<String> getWaterGoblets(List<Animal> animals) {
        return animals.stream()
                .map(this::fereverto)
                .collect(Collectors.toList());
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
        Animal defaultAnimal = new Animal("default", "owl");
        if(animal != null){
            return getAnimal(animal, "getting own animal");
        }else {
            return getAnimal(defaultAnimal, "getting class owl");
        }
    }

    private Animal getAnimal(Animal animal, String message) {
        System.out.println(message);
        return animal;
    }
}
