package com.jland.funcpatterns.entity;

import lombok.extern.log4j.Log4j2;

@Log4j2
public enum House {
    GRIFFINDOR {
        @Override
        public void welcome() {
            log.info("Capulus Draconis");
        }
    },
    HUFFLEPUFF {
        @Override
        public void welcome() {
            log.info("Take a cake");
        }
    },
    RAVENCLAW {
        @Override
        public void welcome() {
            log.info("...");
        }
    },
    SLYTHERIN {
        @Override
        public void welcome() {
            log.info("Learn Parseltongue");
        }
    };

    public abstract void welcome();
}
