package Resolucao.java.comparableXcomparator.baeldung.com.java.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        footballTeam.add(new Player(10, "Smith", 20));
        footballTeam.add(new Player(5, "Parker", 25));
        footballTeam.add(new Player(2, "Jane", 30));

        System.out.println("Antes do ordenamento: " + footballTeam);
        Collections.sort(footballTeam);
// erro de compilação reason: no instance(s) of type variable(s) T
// exist so that Player conforms to Comparable<? super T>


        System.out.println("Depois do ordenamento: " + footballTeam);

        // Output:
        // Antes do ordenamento: [Resolucao.java.comparableXcomparator.baeldung.com.java.comparator.comparable.Player@776ec8df, Resolucao.java.comparableXcomparator.baeldung.com.java.comparator.comparable.Player@4eec7777, Resolucao.java.comparableXcomparator.baeldung.com.java.comparator.comparable.Player@3b07d329]

    }
}
