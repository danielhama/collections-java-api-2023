package Resolucao.java.comparableXcomparator.comparator.comparable;

import java.util.Comparator;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + '}';
    }

    @Override
    public int compareTo(Livro livro) {
        return this.titulo.compareTo(livro.getTitulo());
    }

    public static class ComparatorPorAnoPublicacao implements Comparator<Livro> {
        @Override
        public int compare(Livro o1, Livro o2) {
            return Integer.compare(o1.getAnoPublicacao(), o2.getAnoPublicacao());
        }
    }

}
