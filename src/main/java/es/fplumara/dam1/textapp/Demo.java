package es.fplumara.dam1.textapp;

import es.fplumara.dam1.textapp.exceptions.ConfigException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo {
    static void main(String[] args) {
        Path path = Path.of("data/logs.txt");
        try{
            if(new File("data/logs.txt").createNewFile()){
                Files.createFile(path);
            } else {
                System.out.println("El archivo ya existe.");
            }
        }catch(IOException e){
            throw new ConfigException();
        }
    }
}
