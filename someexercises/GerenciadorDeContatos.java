package someexercises;
import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    String nome;
    String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
}

class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
            return;
        }
        System.out.println("Contatos na agenda:");
        for (Contato c : contatos) {
            System.out.println("- " + c.nome + " : " + c.telefone);
        }
    }

    public void buscarContato(String nome) {
        for (Contato c : contatos) {
            if (c.nome.equalsIgnoreCase(nome)) {
                System.out.println("Contato encontrado: " + c.nome + " - " + c.telefone);
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public void removerContato(String nome) {
        for (Contato c : contatos) {
            if (c.nome.equalsIgnoreCase(nome)) {
                contatos.remove(c);
                System.out.println("Contato removido com sucesso.");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }
}

public class GerenciadorDeContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("\n1 - Adicionar Contato");
            System.out.println("2 - Listar Contatos");
            System.out.println("3 - Buscar Contato");
            System.out.println("4 - Remover Contato");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone do contato: ");
                    String telefone = scanner.nextLine();
                    agenda.adicionarContato(nome, telefone);
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    agenda.listarContatos();
                    break;
                case 3:
                    System.out.print("Digite o nome do contato: ");
                    String nomeBusca = scanner.nextLine();
                    agenda.buscarContato(nomeBusca);
                    break;
                case 4:
                    System.out.print("Digite o nome do contato para remover: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
