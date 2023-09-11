package list.Ordenacao.OrdenacaoDePessoas;
import java.util.Comparator;

public class ComparadorPorIdade implements Comparator<Pessoa> {

    public int compare (Pessoa p1, Pessoa p2){
        if (p1.getIdade() > p2.getIdade() )return -1;
        else if (p1.getIdade() < p2.getIdade() )return +1;
        else return 0;
    }
}
