package list.Pesquisa.SomaDeNumeros;

import list.OpecacoesBasicas.ListaDeTarefas.ListaTarefas;

import java.util.Scanner;

public class TesteSomaNumeros {
    public static void main(String[] args) {
        SomaNumeros lista = new SomaNumeros();
        boolean running = true;
        Scanner readingMenu = new Scanner(System.in);
        Scanner reading = new Scanner(System.in);
        int menuOption = 0;
        int novoNumero = 0;

        do {
            System.out.println(
                    "  Menu:\n" +
                            "  Escolha uma opção:\n\n" +
                            "1 - Adicionar número à lista;\n" +
                            "2 - Calcular soma dos números da lista;\n" +
                            "3 - Encontrar o MAIOR número da lista;\n" +
                            "4 - Encontrar o MENOR número da lista;\n" +
                            "5 - Exibir lista numérica;\n" +
                            "6 - Créditos;\n" +
                            "7 - Encerrar o programa;\n"
            );

            menuOption = readingMenu.nextInt();

            switch (menuOption){
                case 1:
                    System.out.println(
                            "  Adicionar número à list:\n\n" +
                                    "Por favor, um NÚMERO INTEIRO para adicionar na lista:\n" +
                                    "       (Números inteiros são números positivos e negativos que não possuem casa decimal).\n"
                    );
                    novoNumero = reading.nextInt();
                    lista.adicionarNumero(novoNumero);
                    System.out.println("\nNúmero adicionado com sucesso!\n");
                    break;
                case 2:
                    System.out.println(
                            "  Calcular soma dos números da lista:\n");
                    lista.calcularSoma();
                    break;
                case 3:
                    System.out.println("  Encontrar o MENOR número da lista:\n");
                    lista.encontrarMaiorNumero();
                    break;
                case 4:
                    System.out.println("  Encontrar o MENOR número da lista:\n");
                    lista.encontrarMenorNumero();
                    break;
                case 5:
                    System.out.println("  Exibir lista numérica:\n");
                    lista.exibirNumeros();
                    break;
                case 6:
                    System.out.println("  Créditos:\n\n" +
                            "Projeto DIO - Java - Estudos Collections.\n" +
                            "Setembro de 2023.\n" +
                            "Desenvolvido por Marcos Paulo Silva.\n" +
                            "www.linkedin/in/souomarcos\n" +
                            "www.github.com/souomarcos\n");
                    break;
                case 7:
                    System.out.println("Obrigado por utilizar este programa!\nEncerrando!");
                    running = false;
                    break;
                default:
                    System.out.println("  Opção inválida!\n    Digite um número de 1 a 7.");
                    break;
            }
        }while (running);
    }
}
