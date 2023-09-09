package list.OpecacoesBasicas.ListaDeTarefas;

import java.util.Scanner;

public class TesteOperacoesBasicas {
    public static void main(String[] args) {

        ListaTarefas novaLista = new ListaTarefas();
        boolean running = true;
        Scanner readingMenu = new Scanner(System.in);
        Scanner reading = new Scanner(System.in);
        int menuOption = 0;
        String desciption = "";

        do {
            System.out.println(
                "  Menu:\n" +
                "  Escolha uma opção:\n\n" +
                    "1 - Adicionar tarefa;\n" +
                    "2 - Remover tarefa;\n" +
                    "3 - Número total de tarefas cadastradas;\n" +
                    "4 - Imprimir decrições das tarefas;\n" +
                    "5 - Créditos;\n" +
                    "6 - Encerrar o programa;\n"
            );

            menuOption = readingMenu.nextInt();

            switch (menuOption){
                case 1:
                    System.out.println(
                        "  Adicionar tarefa:\n\n" +
                        "Por favor, digite a descrição da tarefa que deseja adicionar:\n");
                    desciption = reading.nextLine();
                    novaLista.adicionarTarefa(desciption);
                    System.out.println("\nTarefa adicionada com sucesso!\n");
                    break;
                case 2:
                    System.out.println(
                            "  Remover tarefa:\n\n" +
                            "Descrição das tarefas adicionada:");
                    novaLista.obterDescricoesTarefas();
                    System.out.println("Por favor, digite a descrição da tarefa que deseja remover:\n");
                    desciption = reading.nextLine();
                    novaLista.removerTarefa(desciption);
                    System.out.println("\nTarefa removida com sucesso!\n");
                    break;
                case 3:
                    System.out.println("  Número total de tarefas cadastradas:\n");
                    System.out.println(novaLista.obterNumeroTotalTarefas() + ".");
                    break;
                case 4:
                    System.out.println("  Imprimir descrição das tarefas:\n");
                    novaLista.obterDescricoesTarefas();
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
            }
        }while (running);
    }
}
