package com.jland.funcpatterns.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Spell {
    private String start;
    private String spell;
    private String finish;
}
