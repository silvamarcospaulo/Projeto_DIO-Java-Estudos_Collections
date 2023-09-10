package list.Pesquisa.CatalogoDeLivros;

import java.util.Scanner;

public class TesteCatalogoDeLivros {
    public static void main(String[] args){
        CatalogoLivros novoCatalogo = new CatalogoLivros();
        boolean running = true;
        Scanner readingInt = new Scanner(System.in);
        Scanner readingString = new Scanner(System.in);
        int menuOption = 0;
        String titulo = "";
        String autor = "";
        int anoDePublicacao = 0;


        do {
            System.out.println(
                    "  Menu:\n" +
                        "  Escolha uma opção:\n\n" +
                        "1 - Adicionar livro ao catálogo;\n" +
                        "2 - Pesquisar livro no catálogo.\n       Filtro: Autor;\n" +
                        "3 - Pesquisar livro no catálogo.\n       Filtro: Intervalo de anos;\n" +
                        "4 - Pesquisar livro no catálogo.\n       Filtro: Título;\n" +
                        "5 - Créditos;\n" +
                        "6 - Encerrar o programa;\n"
            );

            menuOption = readingInt.nextInt();

            switch (menuOption){
                case 1:
                    System.out.println("  Adicionar livro ao catálogo:\n");
                    System.out.println("Título:");
                    titulo = readingString.nextLine();
                    System.out.println("Autor:");
                    autor = readingString.nextLine();
                    System.out.println("Ano de publicação:");
                    anoDePublicacao = readingInt.nextInt();

                    novoCatalogo.adicionarLivro(titulo, autor, anoDePublicacao);
                    System.out.println("\nLivro adicionado ao catálogo!\n");
                    break;
                case 2:
                    System.out.println(
                            "Pesquisar livro no catálogo.\n   Filtro: Autor;\n"
                    );
                    System.out.println("Por favor, digite o AUTOR que deseja pesquisar:\n");
                    autor = readingString.nextLine();
                    novoCatalogo.pesquisaPorAutor(autor);
                    break;
                case 3:
                    System.out.println(
                            "Pesquisar livro no catálogo.\n   Filtro: Intervalo de anos;\n"
                    );
                    System.out.println("Por favor, digite o INTERVALO DE ANOS que deseja pesquisar:\n");
                    System.out.println("Ano inicial:");
                    int anoInicial = readingInt.nextInt();
                    System.out.println("Ano final:");
                    int anoFinal = readingInt.nextInt();
                    novoCatalogo.pesquisarPorIntervaloAnos(anoInicial, anoFinal);
                    break;
                case 4:
                    System.out.println(
                            "Pesquisar livro no catálogo.\n   Filtro: Título;\n"
                    );
                    System.out.println("Por favor, digite o TÍTULO que deseja pesquisar:\n");
                    titulo = readingString.nextLine();
                    novoCatalogo.pesquisaPorTitulo(titulo);
                    break;
                case 5:
                    System.out.println("  Créditos:\n\n" +
                            "Projeto DIO - Java - Estudos Collections.\n" +
                            "Setembro de 2023.\n" +
                            "Desenvolvido por Marcos Paulo Silva.\n" +
                            "www.linkedin/in/souomarcos\n" +
                            "www.github.com/souomarcos\n");
                    break;
                case 6:
                    System.out.println("Obrigado por utilizar este programa!\nEncerrando!");
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida!\nEscolha uma opção de 1 a 6.");
                    break;
            }
        }while (running);
    }
}
