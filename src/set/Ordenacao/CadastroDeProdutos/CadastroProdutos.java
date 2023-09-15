package set.Ordenacao.CadastroDeProdutos;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;


public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos(){
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(String nome,long cod, double preco, int quantidade){
        produtos.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(new ComparatorPorNome());
        if (produtos.isEmpty()) {
            throw new RuntimeException("Estoque vazio!");
        }else{
            produtosPorNome.addAll(produtos);
            return produtosPorNome;
        }
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (produtos.isEmpty()) {
            throw new RuntimeException("Estoque vazio!");
        }else{
            produtosPorPreco.addAll(produtos);
            return produtosPorPreco;
        }
    }
}