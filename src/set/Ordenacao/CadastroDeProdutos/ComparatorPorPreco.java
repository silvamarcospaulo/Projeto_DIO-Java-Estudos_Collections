package set.Ordenacao.CadastroDeProdutos;

import java.util.Comparator;

public class ComparatorPorPreco implements Comparator<Produto> {
    public int compare (Produto p1, Produto p2){
        if (p1.getPreco() > p2.getPreco() )return -1;
        else if (p1.getPreco() < p2.getPreco() )return +1;
        else return 0;
    }
}