package es.fplumara.dam1.textapp.model;

import java.time.LocalDateTime;

public class Message {
    String texto;
    LocalDateTime timestamp;
    int palabras;

    public Message(String texto) {
        this.texto = texto;
        this.timestamp = LocalDateTime.now();
        this.palabras = texto.split(" ").length;
    }

    public int getPalabras() {
        return palabras;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getTexto() {
        return texto;
    }
}
