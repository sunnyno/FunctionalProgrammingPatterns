package com.jland.funcpatterns.service;

import java.io.File;
import java.io.IOException;

public class ExporterService {

    public File exportWizardFile() throws IOException {
        File file = new File("wizards.csv");
        return file;
    }


}
