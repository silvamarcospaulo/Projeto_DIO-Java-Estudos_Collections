package set.OperacoesBasicas.ConjuntoDeConvidados;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado remove = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                remove = c;
                break;
            }
        }
        convidadoSet.remove(remove);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println("Lista de convidados:\n");
        for (Convidado c : convidadoSet){
            System.out.print(
                    c.getCodigoConvite() + " - " + c.getNome() + ".\n");
        }
        System.out.println("");
    }
}