package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.House;
import com.jland.funcpatterns.entity.Animal;
import com.jland.funcpatterns.entity.Wizard;
import org.junit.Test;

public class HouseServiceTest {

    @Test
    public void welcomeNewStudent() {
        HouseService houseService = new HouseService();
        houseService.welcomeNewStudent(Wizard.builder()
                .name("Hagrid")
                .animal(java.util.Optional.of(new Animal("Fang", "dog")))
                .house(House.GRIFFINDOR)
                .build());
    }
}
