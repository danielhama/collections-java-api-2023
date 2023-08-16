package Resolucao.java.comparableXcomparator.baeldung.com.java.comparator.comparable;

//public class Player {
//    private int ranking;
//    private String name;
//    private int age;
//
//    public Player(int ranking, String name, int age) {
//        this.ranking = ranking;
//        this.name = name;
//        this.age = age;
//    }

// Comparable

import java.util.Comparator;

public class Player implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public int compareTo(Player player) {
        return Integer.compare(this.getRanking(), player.getRanking());
    }

    @Override
    public String toString() {
        return "Player{" + "ranking=" + ranking + ", name=" + name + ", age=" + age + '}';
    }

    public static class ComparatorPorIdade implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            return Integer.compare(o1.age, o2.age);
        }

    }

    public static class ComparatorPorRanking implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            return Integer.compare(o1.ranking, o2.ranking);
        }

    }
}

