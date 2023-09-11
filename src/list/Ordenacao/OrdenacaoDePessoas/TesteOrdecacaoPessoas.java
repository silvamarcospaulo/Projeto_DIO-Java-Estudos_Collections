package list.Ordenacao.OrdenacaoDePessoas;

import sun.invoke.empty.Empty;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class TesteOrdecacaoPessoas {
    public static void main (String[] args){
        int menuOption = 0;
        boolean running = true;
        OrdenacaoPessoas novaListaDePessoas = new OrdenacaoPessoas();
        String nome = "";
        int idade = 0;
        double altura = 0;
        Scanner reading = new Scanner(System.in);
        Scanner readingNome = new Scanner(System.in);
        Scanner readingMenu = new Scanner(System.in);

        do {
            System.out.println(
                    "Menu:\n\n" +
                    "    1 - Adicionar pessoa à lista;\n" +
                    "    2 - Ordernar lista;\n        Filtro: IDADE.\n" +
                    "    3 - Ordernar lista;\n        Filtro: ALTURA.\n" +
                    "    4 - Encerrar o programa\n");
            System.out.print("Digite uma opção: ");

            menuOption = readingMenu.nextInt();
            System.out.println("");

            switch (menuOption){
                case 1:
                    System.out.println("    Adicionar pessoa à lista:\n");
                    System.out.println("Por favor preencha os campos a seguir:");
                    System.out.print("NOME COMPLETO: ");
                    nome = readingNome.nextLine();
                    System.out.print("\nIDADE (anos): ");
                    idade = reading.nextInt();
                    System.out.print("\nALTURA (em metros): ");
                    altura = reading.nextDouble();
                    try {
                        novaListaDePessoas.adicionarPessoa(nome, idade, altura);
                        System.out.println(nome + " adicionado(a) à lista com sucesso!\n");
                    }catch (Exception e){
                        System.out.println("Não foi possível adicionar " + nome + " à lista!\nTente novamente.\n");
                    }
                    break;
                case 2:
                    try {
                        List<Pessoa> listaIdade = new LinkedList<>(novaListaDePessoas.ordenarPorIdade());
                        System.out.println("    Ordernar lista:\n            Filtro: IDADE.\n");
                        for (Pessoa p : listaIdade){
                            System.out.println(
                                    "    ---------------------------\n" +
                                    "    | Nome: " + p.getNome() + ".\n" +
                                    "    | Idade: " + p.getIdade() + " anos.\n" +
                                    "    | Altura: " + p.getAltura() + "m.\n" +
                                    "    ---------------------------\n"
                            );
                        }
                    }catch (Exception e){
                        System.out.println("ERRO!    A lista está vazia.\n");
                    }
                    break;
                case 3:
                    try {
                        List<Pessoa> listaAltura = new LinkedList<>(novaListaDePessoas.ordenarPorAltura());
                        System.out.println("    Ordernar lista:\n            Filtro: ALTURA.\n");
                        for (Pessoa p : listaAltura){
                            System.out.println(
                                    "    ---------------------------\n" +
                                    "    | Nome: " + p.getNome() + ".\n" +
                                    "    | Altura: " + p.getAltura() + "m.\n" +
                                    "    | Idade: " + p.getIdade() + " anos.\n" +
                                    "    ---------------------------\n"
                            );
                        }
                    }catch (Exception e){
                        System.out.println("ERRO!    A lista está vazia.\n");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar o programa!\nEncerrando.\n");
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida!\n    Escolha uma opção entre 1 e 3.\n");
                    break;
            }
        }while (running);
    }
}
