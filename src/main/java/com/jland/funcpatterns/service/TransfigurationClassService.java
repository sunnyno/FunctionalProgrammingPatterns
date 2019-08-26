package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.Animal;
import com.jland.funcpatterns.entity.Wizard;
import com.jland.funcpatterns.exception.BrokenWandException;
import com.jland.funcpatterns.util.CheckedFunction;
import com.jland.funcpatterns.util.Either;
import io.vavr.control.Try;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Log4j2
public class TransfigurationClassService {

    public List<Either<String>> getWaterGoblets(List<Animal> animals) {
        return animals.stream()
                .map(Either.lift(this::fereverto))
                .collect(Collectors.toList());

//        return animals.stream()
//                .map(animal -> Try.of(() -> fereverto(animal)))
//                .collect(Collectors.toList());
    }

    private String getTransformedAnimal(Animal animal) {
        try {
            return fereverto(animal);
        } catch (BrokenWandException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T, R> Function<T, R> wrap(CheckedFunction<T, R> function) {
        return t -> {
            try {
                return function.apply(t);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
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
        Optional<Animal> animal = wizard.getAnimal();
        Animal defaultAnimal = new Animal("default", "owl");
        return animal.map(a -> getAnimal(a, "getting own animal"))
                .orElseGet(() -> getAnimal(defaultAnimal, "getting class owl"));
    }

    private Animal getAnimal(Animal animal, String message) {
        System.out.println(message);
        return animal;
    }

}
