package map.Ordenacao.EstoqueDeProdutosComPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoque.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibitProdutos(){
        System.out.println(estoque);
    }

    public double valorTotalEscoque(){
        double valorTotal = 0;

        if (estoque.isEmpty()){
            return valorTotal;
        }else{
            for (Produto p : estoque.values()){
                valorTotal = valorTotal + (p.getPreco() * p.getQuantidade());
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto maisCaro = null;
        if (estoque.isEmpty()){
            return maisCaro;
        }else{
            double maiorPreco = Double.MIN_VALUE;
            for (Produto p : estoque.values()) {
                if (p.getPreco() > maiorPreco) {
                    maisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return maisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto maisBarato = null;
        if (estoque.isEmpty()){
            return maisBarato;
        }else{
            double menorPreco = Double.MAX_VALUE;
            for (Produto p : estoque.values()) {
                if (p.getPreco() < menorPreco) {
                    maisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return maisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0;
        if (estoque.isEmpty()) {
            return produtoMaiorQuantidadeValorNoEstoque;
        }else{
            for (Map.Entry<Long, Produto> entry : estoque.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }
}