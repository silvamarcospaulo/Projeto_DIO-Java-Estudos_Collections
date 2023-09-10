package list.Pesquisa.SomaDeNumeros;

import list.Pesquisa.CatalogoDeLivros.Livro;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumerica = new LinkedList<>();

    public SomaNumeros() {
        this.listaNumerica = new LinkedList<>();
    }

    public void adicionarNumero(int numero){
        listaNumerica.add(new Integer(numero));
    }

    public void calcularSoma(){
        if (listaNumerica.isEmpty()){
            System.out.println("Lista numérica está vazia!\n");
        }else{
            int soma = 0;
            for (Integer n : listaNumerica){
                soma = soma + (n.intValue());
            }
            System.out.println("Resultado da soma: " + soma + ".\n");
        }
    }

    public void encontrarMaiorNumero(){
        if (listaNumerica.isEmpty()){
            System.out.println("Lista numérica está vazia!\n");
        }else {
            Integer maiorNumero = listaNumerica.stream().max(Integer::compare).get();
            System.out.println("O MAIOR número contido na lista numérica é: " + maiorNumero.intValue() + ".\n");
        }
    }

    public void encontrarMenorNumero(){
        if (listaNumerica.isEmpty()){
            System.out.println("Lista numérica está vazia!\n");
        }else {
            Integer menorNumero = listaNumerica.stream().min(Integer::compare).get();
            System.out.println("O MENOR número contido na lista numérica é: " + menorNumero.intValue() + ".\n");
        }
    }

    public void exibirNumeros(){
        if (listaNumerica.isEmpty()){
            System.out.println("Lista numérica está vazia!\n");
        }else{
            System.out.print("Lista numérica:");
            for (Integer n : listaNumerica){
                System.out.print(" " + n.intValue());
            }
            System.out.println(".\n");
        }
    }
}
