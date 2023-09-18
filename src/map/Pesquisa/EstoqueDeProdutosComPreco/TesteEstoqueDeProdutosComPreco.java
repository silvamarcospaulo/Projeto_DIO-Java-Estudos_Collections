package map.Pesquisa.EstoqueDeProdutosComPreco;

import java.util.Scanner;

public class TesteEstoqueDeProdutosComPreco {
    public static void main (String [] args){
        int menuOption = 0;
        boolean running = true;
        Scanner read = new Scanner(System.in);
        Scanner readS = new Scanner(System.in);
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        long cod = 0;
        String nome = "";
        int quantidade = 0;
        double preco = 0;

        do{
            System.out.println(
                    "Menu:\n" +
                            "   1 - Adicionar produto;\n" +
                            "   2 - Exibir Estoque;\n" +
                            "   3 - Estoque:\n         Valor total;\n" +
                            "   4 - Estoque:\n         Produto com MAIOR valor unitário;\n" +
                            "   5 - Estoque:\n         Produto com MENOR valor unitário;\n" +
                            "   6 - Estoque:\n         Produto com MAIOR valor (valor unitário * quantidade);\n" +
                            "   7 - Encerrar.\n"
            );

            menuOption = read.nextInt();
            System.out.println();

            switch (menuOption){
                case 1:
                    System.out.println("Adicionar produto:\n");
                    System.out.print("Código do produto: ");
                    cod = read.nextLong();
                    System.out.print("Nome: ");
                    nome = readS.nextLine();
                    System.out.print("Quantidade: ");
                    quantidade = read.nextInt();
                    System.out.print("Valor unitário: ");
                    preco = read.nextDouble();
                    estoqueProdutos.adicionarProduto(cod, nome, quantidade, preco);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Estoque:\n");
                    estoqueProdutos.exibitProdutos();
                    break;
                case 3:
                    System.out.println("Valor total do estoque: R$" + estoqueProdutos.valorTotalEscoque() +".\n");
                    break;
                case 4:
                    System.out.println(estoqueProdutos.obterProdutoMaisCaro());
                    break;
                case 5:
                    System.out.println(estoqueProdutos.obterProdutoMaisBarato());
                    break;
                case 6:
                    System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
                    break;
                case 7:
                    System.out.println("Encerrando o programa.");
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (running);
    }
}
