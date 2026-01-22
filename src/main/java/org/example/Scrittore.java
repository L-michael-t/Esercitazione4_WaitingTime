package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scrittore {

    public void salvaSuFile(Cantante cantante) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(cantante);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("music.json"))) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}