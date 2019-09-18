package com.jland.funcpatterns.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Wizard {
    private String name;
    private int age;
    private House house;
    private boolean fromMugleFamily;
    private Animal animal;
}
