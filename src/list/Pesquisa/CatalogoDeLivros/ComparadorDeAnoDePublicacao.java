package list.Pesquisa.CatalogoDeLivros;
import java.util.Comparator;

public class ComparadorDeAnoDePublicacao implements Comparator<Livro> {

    public int compare (Livro l1, Livro l2){
        if (l1.getAnoDePublicacao() < l2.getAnoDePublicacao() ) return -1;
        else if (l1.getAnoDePublicacao() > l2.getAnoDePublicacao() ) return +1;
        else return 0;
    }

}
