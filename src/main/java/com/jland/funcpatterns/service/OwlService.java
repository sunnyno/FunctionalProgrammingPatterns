package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.Wizard;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class OwlService {

    public void sendOwl(List<Wizard> wizards) {
        wizards.forEach(wizard -> log.info("Notification sent to {}", wizard.getName()));
    }
}
