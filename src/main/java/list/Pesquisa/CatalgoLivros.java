package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalgoLivros {
    private List<Livro> livroList;

    public CatalgoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l: livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l: livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalgoLivros catalgoLivros = new CatalgoLivros();
        catalgoLivros.adicionarLivro("Java", "Thiago", 2020);
        catalgoLivros.adicionarLivro("JavaScript", "Araújo", 2021);
        catalgoLivros.adicionarLivro("NodeJs", "Machado", 2023);
        catalgoLivros.adicionarLivro("NestJs", "Araújo", 2000);
        catalgoLivros.adicionarLivro("Angular", "Thiago", 2000);


        System.out.println(catalgoLivros.pesquisaPorAutor("Machado"));
        System.out.println(catalgoLivros.pesquisaPorTitulo("Java"));
        System.out.println(catalgoLivros.pesquisaPorAno(2000,2020));
    }
}
