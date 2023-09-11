package list.Ordenacao.OrdenacaoDePessoas;
import java.util.Comparator;

public class ComparadorPorAltura implements Comparator<Pessoa> {

    public int compare (Pessoa p1, Pessoa p2){
        if (p1.getAltura() > p2.getAltura() )return -1;
        else if (p1.getAltura() < p2.getAltura() )return +1;
        else return 0;
    }
}
