package list.Ordenacao.OrdenacaoDeNumeros;

import java.util.Comparator;

public class ComparadorDescendente implements Comparator<Integer> {

    @Override
    public int compare(Integer n1, Integer n2) {
        if (n1.intValue() > n2.intValue()) return -1;
        else if (n1.intValue() < n2.intValue()) return +1;
        else return 0;
    }
}
