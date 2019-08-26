package com.jland.funcpatterns.service;

import com.jland.funcpatterns.entity.House;
import com.jland.funcpatterns.entity.Wizard;
import io.vavr.collection.List;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class OwlService {

    public void sendOwl(io.vavr.collection.List<Wizard> wizards) {
        notifyAnotherOwl(wizards);
        wizards.forEach(this::sendNotification);
    }

    private void notifyAnotherOwl(io.vavr.collection.List<Wizard> wizards) {
        io.vavr.collection.List<Wizard> myWizardsList = wizards.removeFirst(wizard -> wizard.getHouse().equals(House.SLYTHERIN));
        myWizardsList.forEach(wizard -> log.info("Notification sent to {}", wizard.getName()));
    }

    private void sendNotification(Wizard wizard) {
        if ("Harry Potter".equals(wizard.getName())) {
            log.info("Hagrid sent to {}", wizard.getName());
        }else if(wizard.isFromMugleFamily()){
            log.info("Regular mail sent to {}", wizard.getName());
        }else {
            log.info("I`m going to {}", wizard.getName());
        }
    }


}
