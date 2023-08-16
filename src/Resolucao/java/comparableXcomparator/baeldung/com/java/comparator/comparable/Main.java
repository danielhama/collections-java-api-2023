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

        Player.ComparatorPorIdade comparadorPorIdade = new Player.ComparatorPorIdade();
        Collections.sort(footballTeam, comparadorPorIdade);
        System.out.println("Depois do ordenamento pelo comparator por idade: " + footballTeam);

        System.out.println("------------------------------");

        Player.ComparatorPorRanking ranking = new Player.ComparatorPorRanking();
        Collections.sort(footballTeam, ranking);
        System.out.println("Depois do ordenamento pelo comparator por ranking: " + footballTeam);
    }
}
