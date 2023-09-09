package list.OpecacoesBasicas.CarrinhoDeCompras;

import list.OpecacoesBasicas.ListaDeTarefas.Tarefa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new LinkedList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item (nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new LinkedList<>();
        for (Item i : carrinho){
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        for (Item i : carrinho){
            valorTotal = valorTotal + (i.getPreco() * i.getQuantidade());
        }
        System.out.println("Valor total do carrinho: R$ " + valorTotal + ".");
    }

    public void exibirItens(){
        for (Item i : carrinho){
            System.out.println(
                "----------------------------------\n" +
                "Item:\n" +
                    "Nome: " + i.getNome() + ".\n" +
                    "Preço: " + i.getPreco() + ".\n" +
                    "Quantidade: " + i.getQuantidade() + ".\n" +
                    "Valor total: R$ " + i.getPreco() * i.getQuantidade() + ".\n" +
                "----------------------------------\n"
                    );
        }
    }
}
