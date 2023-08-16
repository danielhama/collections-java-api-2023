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

public class Player implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Player player) {
        return Integer.compare(this.ranking, player.ranking);
    }

    @Override
    public String toString() {
        return "Player{" + "ranking=" + ranking + ", name=" + name + ", age=" + age + '}';
    }
}
