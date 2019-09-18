package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.House;
import com.jland.funcpatterns.entity.Wizard;
import org.junit.Test;

public class HouseServiceTest {

    @Test
    public void welcomeNewStudent() {
        HouseService houseService = new HouseService();
        houseService.welcomeNewStudent(Wizard.builder()
                .name("Hagrid")
                .house(House.GRIFFINDOR)
                .build());
    }
}
