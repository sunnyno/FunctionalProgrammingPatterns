package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.Wizard;
import lombok.extern.log4j.Log4j2;
@Log4j2
public class HouseService {

    public void welcomeNewStudent(Wizard wizard) {
        switch (wizard.getHouse()) {
            case GRIFFINDOR: {
                System.out.println("Capulus Draconis");
                break;
            }
            case SLYTHERIN: {
                System.out.println("Learn Parseltongue");
                break;
            }
            case HUFFLEPUFF: {
                System.out.println("Take a cake");
                break;
            }
            case RAVENCLAW: {
                System.out.println("...");
                break;
            }
        }
    }
}
