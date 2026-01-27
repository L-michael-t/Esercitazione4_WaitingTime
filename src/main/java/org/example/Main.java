package org.example;

import org.example.Cantante;
import org.example.Scrittore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main{


public static void main(String[] args) {
    Cantante c1 = new Cantante("SHIVA","milanese","italiano");
    Scrittore s = new Scrittore();
    Lettore l = new Lettore("music.json");

    s.salvaSuFile(c1);

 Thread sc= new Thread(s);
    Thread le= new Thread(l);

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
