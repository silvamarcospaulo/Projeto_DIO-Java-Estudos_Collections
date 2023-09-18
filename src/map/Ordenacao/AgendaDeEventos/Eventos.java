package map.Ordenacao.AgendaDeEventos;

public class Eventos {
    private String nomeEvento;
    private String nomeAtracao;

    public Eventos(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    @Override
    public String toString() {
        return "Evento: " + nomeEvento + ".\n" +
                "Atração: " + nomeAtracao + ".\n";
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }
}
