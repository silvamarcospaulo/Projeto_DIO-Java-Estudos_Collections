package list.Ordenacao.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteComparadorNumeros {
    public static void main(String[] args) {
        int menuOption = 0;
        int num = 0;
        Scanner reading = new Scanner(System.in);
        boolean running = true;
        OrdenacaoNumeros novaLista = new OrdenacaoNumeros();

        do {
            System.out.println("" +
                    "MENU:\n" +
                    "    1 - Adicionar número à lista;\n" +
                    "    2 - Ordernar em ordem ASCENDENTE;\n" +
                    "    3 - Ordernar em ordem DESCENDENTE;\n" +
                    "    4 - Encerrar programa;\n");
            System.out.print("Digite uma opção: ");
            menuOption = reading.nextInt();
            switch (menuOption) {
                case 1:
                    System.out.println("    Adicionar número à lista:\n");
                    System.out.println("Digite um número inteiro: ");
                    num = reading.nextInt();
                    novaLista.adicionarNumero(num);
                    break;
                case 2:
                    System.out.println("    Ordernar em ordem ASCENDENTE:\n");
                    System.out.print("Lista numérica ASCENDENTE:");
                    List<Integer> ascendente = new ArrayList<>(novaLista.ordenarAscendente());
                    for (Integer l : ascendente){
                        System.out.print(" " + l.intValue());
                    }
                    System.out.println(".\n");
                    break;
                case 3:
                    System.out.println("    Ordernar em ordem DESCENDENTE:\n");
                    System.out.print("Lista numérica DESCENDENTE:");
                    List<Integer> descendente = new ArrayList<>(novaLista.ordenarDescendente());
                    for (Integer l : descendente){
                        System.out.print(" " + l.intValue());
                    }
                    System.out.println(".\n");
                    break;
                case 4:
                    System.out.println("Encerrando o programa!");
                    running = false;
                    break;
                default:
                    break;
            }
        } while (running);
    }
}