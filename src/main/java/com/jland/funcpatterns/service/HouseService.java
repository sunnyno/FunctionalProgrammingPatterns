package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.House;
import com.jland.funcpatterns.entity.Wizard;
import lombok.extern.log4j.Log4j2;

import java.util.function.Consumer;

import static io.vavr.API.*;
@Log4j2
public class HouseService {

    public void welcomeNewStudent(Wizard wizard) {
        wizard.getHouse().welcome();
    }

    public void welcomeNewStudentVavr(Wizard wizard) {
        Consumer<String> consumer = Match(wizard.getHouse()).of(
                Case($(House.GRIFFINDOR), (Consumer<String>) (name) -> log.info(name + " Capulus Draconis")),
                Case($(House.SLYTHERIN), (Consumer<String>) (name) -> log.info(name + "Learn Parseltongue")),
                Case($(House.HUFFLEPUFF), (Consumer<String>) (name) -> log.info(name + "Take a cake")),
                Case($(House.RAVENCLAW), (Consumer<String>) (name) -> log.info(name + "Take a cake")));
        consumer.accept(wizard.getName());
    }
}
