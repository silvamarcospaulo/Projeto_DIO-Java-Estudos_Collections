package set.Ordenacao.CadastroDeProdutos;

import java.util.Objects;

public class Produto{
    private String nome;
    private long  cod;
    private double preco;
    private int quantidade;

    public Produto(String nome, long cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return  "-----------------------------------------\n" +
                "| Produto:\n" +
                "-----------------------------------------\n" +
                "| Nome: " + nome + "\n" +
                "| Código do Produto: " + cod + "\n" +
                "| Preço: " + preco + "\n" +
                "| Quantidade: " + quantidade + "\n" +
                "-----------------------------------------\n";
    }
}
