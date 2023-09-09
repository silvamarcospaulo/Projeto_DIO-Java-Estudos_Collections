package list.OpecacoesBasicas.CarrinhoDeCompras;

import java.util.Scanner;

public class TesteCarrinhoDeCompras {
    public static void main(String[] args) {

        CarrinhoDeCompras novoCarrinho = new CarrinhoDeCompras();
        boolean running = true;
        Scanner readingInt = new Scanner(System.in);
        Scanner readingDouble = new Scanner(System.in);
        Scanner readingString = new Scanner(System.in);
        int menuOption = 0;
        String nome = "";
        double preco = 0;
        int quantidade = 0;


        do {
            System.out.println(
                    "  Menu:\n" +
                            "  Escolha uma opção:\n\n" +
                            "1 - Adicionar item ao carrinho;\n" +
                            "2 - Remover iten do carrinho;\n" +
                            "3 - Valor total do carrinho;\n" +
                            "4 - Imprimir itens no carrinho;\n" +
                            "5 - Créditos;\n" +
                            "6 - Encerrar o programa;\n"
            );

            menuOption = readingInt.nextInt();

            switch (menuOption){
                case 1:
                    System.out.println("  Adicionar item ao carrinho:\n");
                    System.out.println("Nome:");
                    nome = readingString.nextLine();
                    System.out.println("Valor:");
                    preco = readingDouble.nextDouble();
                    System.out.println("Quantidade:");
                    quantidade = readingInt.nextInt();

                    novoCarrinho.adicionarItem(nome, preco, quantidade);
                    System.out.println("\nItem adicionado ao carrinho!\n");
                    break;
                case 2:
                    System.out.println(
                            "  Remover Item do carrinho:\n\n" +
                                    "Carrinho:");
                    novoCarrinho.exibirItens();
                    System.out.println("Por favor, digite o nome do item que deseja remover:\n");
                    nome = readingString.nextLine();
                    novoCarrinho.removerItem(nome);
                    System.out.println("\nItem removido do carrinho!\n");
                    break;
                case 3:
                    System.out.println("  Valor total do carrinho:\n");
                    novoCarrinho.calcularValorTotal();
                    break;
                case 4:
                    System.out.println("  Imprimir itens no carrinho:\n");
                    novoCarrinho.exibirItens();
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
