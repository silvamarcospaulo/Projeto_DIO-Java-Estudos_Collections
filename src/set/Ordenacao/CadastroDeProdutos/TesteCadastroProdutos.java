package set.Ordenacao.CadastroDeProdutos;

import java.util.Scanner;
import java.util.Set;

public class TesteCadastroProdutos {
    public static void main (String [] args){
        int menuOption = 0;
        boolean running = true;
        Scanner read = new Scanner(System.in);
        Scanner readS = new Scanner(System.in);
        CadastroProdutos estoque = new CadastroProdutos();
        String nome = "";
        long cod = 0;
        double preco = 0;
        int quantidade = 0;

        do{
            System.out.println(
                    "Menu:\n" +
                            "   1 - Adicionar produto;\n" +
                            "   2 - Exibir produtos por NOME;\n" +
                            "   3 - Exibir produtos por PREÇO;\n" +
                            "   4 - Encerrar;\n"
            );

            menuOption = read.nextInt();
            System.out.println("");

            switch (menuOption){
                case 1:
                    System.out.print("Adicionar produto:\n");
                    System.out.print("Nome: ");
                    nome = readS.nextLine();
                    System.out.print("Código Produto: ");
                    cod = read.nextLong();
                    System.out.print("Preço: ");
                    preco = read.nextDouble();
                    System.out.print("Quantidade em estoque: ");
                    quantidade = read.nextInt();
                    System.out.println();
                    estoque.adicionarProduto(nome, cod, preco, quantidade);
                    break;
                case 2:
                    System.out.print("Exibir produtos por NOME:\n");
                    System.out.println(estoque.exibirProdutosPorNome());
                    break;
                case 3:
                    System.out.print("Exibir produtos por PREÇO:\n");
                    System.out.println(estoque.exibirProdutosPorPreco());
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (running);
    }
}