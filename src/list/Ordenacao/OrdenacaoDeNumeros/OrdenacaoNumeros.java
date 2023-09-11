package list.Ordenacao.OrdenacaoDeNumeros;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros = new LinkedList<>();

    public OrdenacaoNumeros(){
        this.listaNumeros = new LinkedList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ascendente = new LinkedList<>(listaNumeros);
        Collections.sort(ascendente, new ComparadorAscendente());
        return ascendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> descendente = new LinkedList<>(listaNumeros);
        Collections.sort(descendente, new ComparadorDescendente());
        return descendente;
    }
}