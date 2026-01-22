package org.example;

import org.example.Cantante;
import org.example.Scrittore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main{


public static void main(String[] args) {
    Cantante c1 = new Cantante("SHIVA","italia","milanese");
    Scrittore s = new Scrittore();
    s.salvaSuFile(c1);

    try (BufferedReader br = new BufferedReader(new FileReader("music.json"))) {
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        System.out.println("errore nel leggere il file");
    }
}
}
