package es.fplumara.dam1.textapp.config;

import es.fplumara.dam1.textapp.files.StoreType;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class AppConfig {
    private StoreType storeType;
    private String messageFile;
    private int messageMaxLength;
    private static final Path PATH = Path.of("data/config.properties");
    private static final Properties props = new Properties();

    // CONSTRUCTOR
    public AppConfig(){
        try{
            InputStream in = Files.newInputStream(PATH);
            props.load(in);

            storeType = StoreType.valueOf(props.getProperty("story.type", "FILE"));
            messageFile = props.getProperty("message.file", "data/config.properties");
            messageMaxLength = Integer.parseInt(props.getProperty("message.maxLength", "200"));
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }

    //GETTERS
    public StoreType getStoreType() {
        return storeType;
    }

    public String getMessageFile() {
        return messageFile;
    }

    public int getMessageMaxLength() {
        return messageMaxLength;
    }
}
