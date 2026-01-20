import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new FileReader("music.json"))) {
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        System.out.println("errore nel leggere il file");
    }
}

