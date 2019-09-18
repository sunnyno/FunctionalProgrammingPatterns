package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.Wizard;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class HouseService {

    public void welcomeNewStudent(Wizard wizard) {
        switch (wizard.getHouse()) {
            case GRIFFINDOR: {
                log.info("Capulus Draconis");
                break;
            }
            case SLYTHERIN: {
                log.info("Learn Parseltongue");
                break;
            }
            case HUFFLEPUFF: {
                log.info("Take a cake");
                break;
            }
            case RAVENCLAW: {
                log.info("...");
                break;
            }
        }
    }
}
