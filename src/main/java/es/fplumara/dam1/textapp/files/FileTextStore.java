package es.fplumara.dam1.textapp.files;

import es.fplumara.dam1.textapp.config.AppConfig;
import es.fplumara.dam1.textapp.model.Message;

import java.io.File;

public class FileTextStore implements TextStore{
    private AppConfig appConfig;

    public FileTextStore(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @Override
    public void save(Message mensaje) {
        if(!new File("data/logs.txt").exists()){
            new File("data/logs.txt");
        }

    }

    @Override
    public String readAll() {
        return "";
    }

    @Override
    public String readLast() {
        return "";
    }
}
