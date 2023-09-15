package set.Pesquisa.AgendaDeContatos;

import set.OperacoesBasicas.ConjuntoDeConvidados.Convidado;

import java.util.HashSet;
import java.util.Set;

public class AgendaDeContatos {
    private Set<Contato> contatoSet;

    public AgendaDeContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato (String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(
                "------------------------------\n" +
                "| Lista de contatos:\n" +
                "------------------------------");
        for (Contato c : contatoSet){
            System.out.println(
                    "| Nome: " + c.getNome() + ".\n" +
                    "| Número: " + c.getNumero() + ".\n" +
                    "------------------------------");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
