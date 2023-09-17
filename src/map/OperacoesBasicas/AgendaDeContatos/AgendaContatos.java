package map.OperacoesBasicas.AgendaDeContatos;

import set.Pesquisa.AgendaDeContatos.AgendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaDeContatos;

    public AgendaContatos(){
        this.agendaDeContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero){
        agendaDeContatos.put(nome, numero);
    }

    public void removerContato(String nome){
        if (!agendaDeContatos.isEmpty()){
            agendaDeContatos.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaDeContatos);
    }

    public Integer pesquisarPorNome(String nome){
        Integer pesquisaPorNome = null;
        if (!agendaDeContatos.isEmpty()){
            pesquisaPorNome = agendaDeContatos.get(nome);
        }
        return pesquisaPorNome;
    }
}