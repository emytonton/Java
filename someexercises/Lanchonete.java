package someexercises;
import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String nome;
    double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

class Pedido {
    private ArrayList<Item> itens = new ArrayList<>();

    public void adicionarItem(String nome, double preco) {
        itens.add(new Item(nome, preco));
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("O pedido está vazio.");
            return;
        }
        System.out.println("Itens no pedido:");
        for (Item item : itens) {
            System.out.println("- " + item.nome + " : R$ " + String.format("%.2f", item.preco));
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.preco;
        }
        return total;
    }
}

public class Lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();

        while (true) {
            System.out.println("\n1 - Adicionar Item");
            System.out.println("2 - Listar Itens");
            System.out.println("3 - Calcular Total");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço do item: ");
                    double preco = scanner.nextDouble();
                    pedido.adicionarItem(nome, preco);
                    System.out.println("Item adicionado com sucesso!");
                    break;
                case 2:
                    pedido.listarItens();
                    break;
                case 3:
                    System.out.println("Total a pagar: R$ " + String.format("%.2f", pedido.calcularTotal()));
                    break;
                case 4:
                    System.out.println("Pedido finalizado.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
