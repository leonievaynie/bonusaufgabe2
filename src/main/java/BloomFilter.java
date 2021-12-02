import com.google.common.hash.HashFunction;

import java.util.ArrayList;
import java.util.List;

public class BloomFilter {
    /*
     * Bloom Filter ist eine probabilistische Datenstruktur, die also mit Wahrscheinlichkeit arbeitet
     * Wird benutzt um herauszufinden, ob ein Wert in der Vergangenheit bereits vorgekommen ist
     * Bsp. Webbrowser (Liste von Gefährlichen Webseiten --> vergleichen von URL)
     *
     * Vektor ist ein Array von bits -> 0 0 0 0 0 0 0
     * Werte werden nicht direkt gespeichert, sondern in Hashfunktionen
     *
     * Hashfunktionen müssen nicht kryptografisch sicher sein

     * murmur3_128(); --> Returns a hash function implementing the 128-bit murmur3 algorithm,
     * x64 variant (little-endian variant), using a seed value of zero.

     * */

    private int     n; //gegebene Anzahl zu erwartenden Elementen
    private double  p; //fehlerwahrscheinlichkeit
    private int     m; //filtergrösse
    private int     k; //optimale Anzahl an Hashfunktionen

    private int[]   list;
    private List<HashFunction> hashFunctionList = new ArrayList<>();

    //constructor
    public BloomFilter(int n, double p){
        this.n = n;
        this.p = p;
        //quelle für m und k: https://www.fatalerrors.org/a/the-principle-of-bloom-filter-and-its-implementation-in-guava.html
        //anstelle von (long) habe ich (int gewählt)
        this.m = (int) (-n * Math.log(p) / (Math.log(2) * Math.log(2))); //m = - (n ln p / (ln2)^2)
        this.k = Math.max(1, (int) Math.round((double) m / n * Math.log(2))); // k = (m / n) * (ln2)

    }

    // Einfügen von Strings
    public void addString(){

    }

    // Test, ob ein String enthalten ist
    public void testIfContains(){

    }


}
