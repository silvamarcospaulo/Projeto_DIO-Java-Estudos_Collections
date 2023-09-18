package map.Ordenacao.AgendaDeEventos;

import java.time.LocalDate;
import java.util.*;

public class TesteAgendaEventos {
    public static void main (String [] args){

        int menu = 0;
        int dia = 0;
        int mes = 0;
        int ano = 0;
        boolean run = true;
        String nomeEvento = "";
        String nomeAtracao = "";
        Scanner readE = new Scanner(System.in);
        Scanner readA = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        AgendaEventos agenda = new AgendaEventos();
        Map<LocalDate, Eventos> eventos = null;

        do{
            System.out.println(
                    "Menu:\n\n" +
                        "   1 - Adicionar Evento;\n" +
                        "   2 - Exibir agenda;\n" +
                        "   3 - Próximo evento;\n" +
                        "   4 - Encerrar programa.\n"
            );

            System.out.print("Digite uma opção entre 1 e 4: ");
            menu = read.nextInt();
            System.out.println("");

            switch (menu){
                case 1:
                    System.out.println("Adicionar evento:\n");

                    System.out.print("Nome do evento: ");
                    nomeEvento = readE.nextLine();
                    System.out.print("Atração do evento: ");
                    nomeAtracao = readA.nextLine();
                    System.out.println("Data do evento:");
                    System.out.print("  Dia: ");
                    dia = read.nextInt();
                    System.out.print("  Mês: ");
                    mes = read.nextInt();
                    System.out.print("  Ano: ");
                    ano = read.nextInt();
                    agenda.adicionarEvento(LocalDate.of(ano, mes, dia), nomeEvento, nomeAtracao);
                    System.out.println();
                    break;
                case 2:
                    eventos = agenda.exibirAgenda();
                    if (eventos.isEmpty()){
                        System.out.println("A agenda está vazia!\n");
                    }else {
                        System.out.println("Exibir agenda:\n");
                        for (Map.Entry<LocalDate, Eventos> entry : eventos.entrySet()) {
                            LocalDate data = entry.getKey();
                            Eventos evento = entry.getValue();
                            System.out.println(
                                    "Nome: " + evento.getNomeEvento() + ".\n" +
                                    "Data: " + data + ".\n" +
                                    "Atração: " + evento.getNomeAtracao() + ".\n"
                            );
                        }
                    }
                    eventos = null;
                    break;
                case 3:
                    eventos = agenda.obterProximoEvento();
                    if (eventos.isEmpty()){
                        System.out.println("Não há eventos futuros cadastrados!\n");
                    }else{
                        System.out.println("Próximo evento:\n");
                        for (Map.Entry<LocalDate, Eventos> entry : eventos.entrySet()) {
                            LocalDate data = entry.getKey();
                            Eventos evento = entry.getValue();
                            System.out.println(
                                    "Nome: " + evento.getNomeEvento() + ".\n" +
                                    "Data: " + data + ".\n" +
                                    "Atração: " + evento.getNomeAtracao() + ".\n"
                            );
                        }
                    }
                    break;
                case 4:
                    System.out.println("Encerando...\n");
                    run = false;
                    break;
                default:
                    System.out.println("Opção inválida!\n");
                    break;
            }
        }while(run);
    }
}