package list.Ordenacao.OrdenacaoDePessoas;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas(){
        this.listaDePessoas = new LinkedList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List <Pessoa> listaIdade = new LinkedList<>(listaDePessoas);
        Collections.sort(listaIdade, new ComparadorPorIdade());
        return listaIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaAltura = new LinkedList<>(listaDePessoas);
        Collections.sort(listaAltura, new ComparadorPorAltura());
        return listaAltura;
    }
}
