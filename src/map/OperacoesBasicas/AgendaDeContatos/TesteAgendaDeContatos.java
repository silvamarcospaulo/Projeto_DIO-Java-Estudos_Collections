package map.OperacoesBasicas.AgendaDeContatos;

import java.util.Scanner;

public class TesteAgendaDeContatos {
    public static void main (String [] args){
        int menuOption = 0;
        boolean running = true;
        Scanner read = new Scanner(System.in);
        Scanner readS = new Scanner(System.in);
        AgendaContatos agendaDeContatos = new AgendaContatos();
        String nome = "";
        Integer numero = 0;

        do{
            System.out.println(
                    "Menu:\n" +
                            "   1 - Adicionar contato;\n" +
                            "   2 - Remover contatos;\n" +
                            "   3 - Exibir contatos;\n" +
                            "   4 - Pesquisar contato por nome;\n" +
                            "   5 - Encerrar;\n"
            );

            menuOption = read.nextInt();
            System.out.println("");

            switch (menuOption){
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    nome = readS.nextLine();
                    System.out.print("Digite o número de telefone do contato: ");
                    numero = read.nextInt();
                    agendaDeContatos.adicionarContato(nome, numero);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Digite o nome do contato que deseja remover: ");
                    nome = readS.nextLine();
                    agendaDeContatos.removerContato(nome);
                    break;
                case 3:
                    agendaDeContatos.exibirContatos();
                    break;
                case 4:
                    System.out.print("Digite o NOME do contato que deseja pesquisar: ");
                    nome = readS.nextLine();
                    System.out.println(
                            "Nome: " + nome + ".\n" +
                            "Número: " + agendaDeContatos.pesquisarPorNome(nome) + ".\n");
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