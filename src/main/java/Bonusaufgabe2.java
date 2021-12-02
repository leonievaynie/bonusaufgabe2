import java.io.*;
import java.util.stream.Stream;

public class Bonusaufgabe2 {

    public static void main(String[] args) {
        String      fileName = "words.txt";
        int         n; //gegebene Anzahl zu erwartenden Elementen
        double      p; //fehlerwahrscheinlichkeit
        BloomFilter bloomFilter = new BloomFilter(n, p);

        // Wörter aus words.txt einlesen
        try (
                FileReader fileReader = new FileReader("src/main/resources/"+fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                Stream<String> lines = bufferedReader.lines();
        ) {
            lines.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Wörter in BloomFilter einfügen




    }

}