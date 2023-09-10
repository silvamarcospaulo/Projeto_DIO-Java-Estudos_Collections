package list.Pesquisa.CatalogoDeLivros;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo = new LinkedList<>();

    public CatalogoLivros() {
        this.catalogo = new LinkedList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao) {
        catalogo.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public void pesquisaPorAutor(String autor) {
        if (catalogo.isEmpty()) {
            System.out.println("Catálogo vazio!");
        } else {
            List<Livro> listaAutor = new LinkedList<>();

            for (Livro l : catalogo) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    listaAutor.add(new Livro(l.getTitulo(), l.getAutor(), l.getAnoDePublicacao()));
                }
            }
            if (listaAutor.isEmpty()) {
                System.out.println("Autor não registrado no catálogo!");
            } else {
                System.out.println(
                        "----------------------------------\n" +
                        "| Autor: " + autor + ".\n" +
                        "----------------------------------"
                );
                for (Livro l : listaAutor) {
                    System.out.println(
                            "| Livro: " + l.getTitulo() + ".\n" +
                            "| Ano de publicação: " + l.getAnoDePublicacao() + ".\n" +
                            "----------------------------------"
                    );
                }
            }
        }
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if (catalogo.isEmpty()) {
            System.out.println("Catálogo vazio!");
        } else {
            List<Livro> listaIntervaloDeAnos = new LinkedList<>();
            for (Livro l : catalogo) {
                if ((l.getAnoDePublicacao() >= anoInicial) && (l.getAnoDePublicacao() <= anoFinal)) {
                    listaIntervaloDeAnos.add(new Livro(l.getTitulo(), l.getAutor(), l.getAnoDePublicacao()));
                }
            }
            if (listaIntervaloDeAnos.isEmpty()){
                System.out.println("Não há livros publicados entre os anos " + anoInicial + " e " + anoFinal + " registrados no catálogo!");
            }else{
                Collections.sort (listaIntervaloDeAnos, new ComparadorDeAnoDePublicacao());
                for (Livro l : listaIntervaloDeAnos) {
                    System.out.println(
                            "----------------------------------\n" +
                            "| Livro: " + l.getTitulo() + ".\n" +
                            "----------------------------------" + "\n" +
                            "| Autor: " + l.getAutor() + ".\n" +
                            "| Ano de publicação: " + l.getAnoDePublicacao() + ".\n" +
                            "----------------------------------\n"
                    );
                }
            }
        }
    }

    public void pesquisaPorTitulo(String titulo) {
        if (catalogo.isEmpty()) {
            System.out.println("Catálogo vazio!");
        } else {
            List<Livro> listaTitulo = new LinkedList<>();

            for (Livro l : catalogo) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    listaTitulo.add(new Livro(l.getTitulo(), l.getAutor(), l.getAnoDePublicacao()));
                }
            }
            if (listaTitulo.isEmpty()) {
                System.out.println("Livro não registrado no catálogo!");
            } else {
                for (Livro l : listaTitulo) {
                    if (l.getTitulo().equalsIgnoreCase(titulo)) {
                        System.out.println(
                                "----------------------------------\n" +
                                "| Livro: " + l.getTitulo() + ".\n" +
                                "----------------------------------" + "\n" +
                                "| Autor: " + l.getAutor() + ".\n" +
                                "| Ano de publicação: " + l.getAnoDePublicacao() + ".\n" +
                                "----------------------------------\n"
                        );
                        break;
                    }
                }
            }
        }
    }
}
