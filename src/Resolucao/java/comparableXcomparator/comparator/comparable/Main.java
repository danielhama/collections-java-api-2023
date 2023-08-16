package Resolucao.java.comparableXcomparator.comparator.comparable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        livros.add(new Livro("O Hobbit", "J.R.R. Tolkien", 1937));
        livros.add(new Livro("A Sociedade do Anel", "Machado de Assis", 1944));

        System.out.println("--------------------------------------------");
        livros.forEach(livro -> {
            System.out.println(livro.getTitulo());
        });

        System.out.println("--------------------------------------------");
        livros.sort((livro1, livro2) -> {
                    return livro1.getTitulo().compareTo(livro2.getTitulo()); // Lambda expression para ordenar por título
                }
        );
        livros.forEach(livro -> {
                    System.out.println(livro);
                }



        );

    }
}
