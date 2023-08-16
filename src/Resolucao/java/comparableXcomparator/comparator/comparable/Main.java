package Resolucao.java.comparableXcomparator.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;

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

        System.out.println("Lambda expression por título--------------------------------------------");
        livros.sort((livro1, livro2) -> {
                    return livro1.getTitulo().compareTo(livro2.getTitulo()); // Lambda expression para ordenar por título
                }
        );
        livros.forEach(livro -> {
            System.out.println(livro);
        });

        System.out.println("Lambda expression por ano--------------------------------------------");

        livros.sort((livro1, livro2) -> {
                    return Integer.compare(livro1.getAnoPublicacao(), livro2.getAnoPublicacao());// Lambda expression para ordenar por ano
                }
        );
        livros.forEach(livro -> {
            System.out.println(livro);
        });

        System.out.println("-Comparable-------------------------------------------");

        Collections.sort(livros);

        for (Livro livro : livros) {
            System.out.println(livro);
        }
        System.out.println("-Comparator por ano-------------------------------------------");
        Collections.sort(livros, new Livro.ComparatorPorAnoPublicacao());

        for (Livro livro : livros) {
            System.out.println(livro);
        }

        System.out.println("-Comparator por Autor-------------------------------------------");
        Collections.sort(livros, new Livro.ComparatorPorAutor());

        for (Livro livro : livros) {
            System.out.println(livro);
        }
        System.out.println("-Comparator por Título-------------------------------------------");
        Collections.sort(livros, new Livro.ComparatorPorTitulo());

        for (Livro livro : livros) {
            System.out.println(livro);
        }

        System.out.println("-Comparator por Ano Autor e Título-------------------------------------------");
        Collections.sort(livros, new Livro.CompararAnoAutorTitulo());

        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
