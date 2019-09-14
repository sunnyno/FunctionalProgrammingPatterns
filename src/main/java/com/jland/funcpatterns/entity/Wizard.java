package com.jland.funcpatterns.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@Data
@Builder
public class Wizard {
    private String name;
    private int age;
    private House house;
    private boolean fromMugleFamily;
    private Animal animal;
}
