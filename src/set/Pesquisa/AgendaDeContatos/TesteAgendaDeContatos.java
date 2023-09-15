package set.Pesquisa.AgendaDeContatos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteAgendaDeContatos {
    public static void main (String [] args){
        int menuOption = 0;
        boolean running = true;
        Scanner read = new Scanner(System.in);
        Scanner readS = new Scanner(System.in);
        AgendaDeContatos agendaDeContatos = new AgendaDeContatos();
        String nome = "";
        int numero = 0;

        do{
            System.out.println(
                    "Menu:\n" +
                            "   1 - Adicionar contato;\n" +
                            "   2 - Exibir contatos;\n" +
                            "   3 - Pesquisar contato por nome;\n" +
                            "   4 - Atualizar contato;\n" +
                            "   5 - Encerrar;\n"
            );

            menuOption = read.nextInt();
            System.out.println("");

            switch (menuOption){
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    nome = readS.nextLine();
                    System.out.print("Digite o código do contato: ");
                    numero = read.nextInt();
                    agendaDeContatos.adicionarContato(nome, numero);
                    System.out.println("");
                    break;
                case 2:
                    agendaDeContatos.exibirContatos();
                    break;
                case 3:
                    System.out.print("Digite o nome do contato que deseja pesquisar: ");
                    nome = readS.nextLine();
                    System.out.println();
                    Set<Contato> c = agendaDeContatos.pesquisarPorNome(nome);
                    System.out.println(
                            "------------------------------------------------------------\n" +
                            "| Lista de contatos que começam com " + nome + ":\n" +
                            "-------------------------------------------------------------");
                    for (Contato con : c){
                        System.out.println(
                                "| Nome: " + con.getNome() + ".\n" +
                                "| Número: " + con.getNumero() + ".\n" +
                                "------------------------------------------------------------");
                    }
                    break;
                case 4:
                    agendaDeContatos.exibirContatos();
                    System.out.print("Digite o NOME do contato que deseja atualizar: ");
                    nome = readS.nextLine();
                    System.out.println();
                    System.out.print("Digite o novo número NÚMERO: ");
                    numero = read.nextInt();
                    System.out.println();
                    agendaDeContatos.atualizarNumeroContato(nome, numero);
                    System.out.println();
                    agendaDeContatos.exibirContatos();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (running);
    }
}
