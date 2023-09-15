package set.Ordenacao.CadastroDeProdutos;

import java.util.Comparator;

public class ComparatorPorNome implements Comparator<Produto> {
    public int compare(Produto p1, Produto p2) {
        return p1.getNome().compareTo(p2.getNome());
    }
}