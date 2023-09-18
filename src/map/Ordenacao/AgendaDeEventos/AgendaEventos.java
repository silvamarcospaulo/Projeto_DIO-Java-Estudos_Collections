package map.Ordenacao.AgendaDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Eventos> agenda;

    public AgendaEventos(){
        this.agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao){
        agenda.put(data, new Eventos(nomeEvento, nomeAtracao));
    }

    public Map<LocalDate, Eventos> exibirAgenda(){
        Map<LocalDate, Eventos> agendaOrdenada = new TreeMap<>(agenda);
        return agendaOrdenada;
    }

    public Map<LocalDate, Eventos> obterProximoEvento(){
        Map<LocalDate, Eventos> proximo = new HashMap<>();
        Map<LocalDate, Eventos> agendaOrdenada = new TreeMap<>(agenda);
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Eventos proximoEvento = null;
        for (Map.Entry<LocalDate, Eventos> entry : agendaOrdenada.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                proximo.put(proximaData, proximoEvento);
                return proximo;
            }
        }
        return proximo;
    }
}