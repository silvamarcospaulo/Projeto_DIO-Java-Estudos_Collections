package map.Pesquisa.EstoqueDeProdutosComPreco;

public class Produto {

    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto:\n" +
                "Nome: " + nome + ".\n" +
                "Quantidade: " + quantidade + ".\n" +
                "Preço: " + preco + ".\n";
    }
}
