package set.OperacoesBasicas.ConjuntoDeConvidados;

import java.util.Scanner;

public class TesteConjuntoDeConvidados {
    public static void main (String [] args){
        int menuOption = 0;
        boolean running = true;
        Scanner read = new Scanner(System.in);
        Scanner readS = new Scanner(System.in);
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        String nomeConvidado = "";
        int codigoConvidado = 0;
        do{
            System.out.println(
                    "Menu:\n" +
                    "   1 - Adicionar convidado;\n" +
                    "   2 - Remover convidado;\n" +
                    "   3 - Imprimir quantidade de convidados;\n" +
                    "   4 - Exibir lista de convidados;\n" +
                    "   5 - Encerrar;\n"
                    );

            menuOption = read.nextInt();
            System.out.println("");

            switch (menuOption){
                case 1:
                    System.out.print("Digite o nome do convidado: ");
                    nomeConvidado = readS.nextLine();
                    System.out.print("Digite o código do convidado: ");
                    codigoConvidado = read.nextInt();
                    conjuntoConvidados.adicionarConvidado(nomeConvidado, codigoConvidado);
                    System.out.println("");
                    break;
                case 2:
                    conjuntoConvidados.exibirConvidados();
                    System.out.print("Digite o código do convidado: que deseja remover: ");
                    codigoConvidado = readS.nextInt();
                    conjuntoConvidados.removerConvidadoPorCodigoConvite(codigoConvidado);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados() + ".\n");
                    break;
                case 4:
                    conjuntoConvidados.exibirConvidados();
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
