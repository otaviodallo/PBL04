import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoa {
    private ArrayList<Pessoa> pessoas;

    public CadastroPessoa() {
        pessoas = new ArrayList<>();
    }

    public void cadastrarPessoa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o tipo de pessoa (cliente, funcionário ou gerente): ");
        String tipo = scanner.nextLine();

        if (tipo.equalsIgnoreCase("cliente")) {
            System.out.print("Digite o endereço do cliente: ");
            String endereco = scanner.nextLine();
            Cliente cliente = new Cliente(nome, endereco);
            pessoas.add(cliente);
            System.out.println("Cliente cadastrado com sucesso.");
        } else if (tipo.equalsIgnoreCase("funcionário")) {
            System.out.print("Digite o cargo do funcionário: ");
            String cargo = scanner.nextLine();
            Funcionario funcionario = new Funcionario(nome, cargo);
            pessoas.add(funcionario);
            System.out.println("Funcionário cadastrado com sucesso.");
        } else if (tipo.equalsIgnoreCase("gerente")) {
            System.out.print("Digite o cargo do gerente: ");
            String cargo = scanner.nextLine();
            System.out.print("Digite o departamento do gerente: ");
            String departamento = scanner.nextLine();
            Gerente gerente = new Gerente(nome, cargo, departamento);
            pessoas.add(gerente);
            System.out.println("Gerente cadastrado com sucesso.");
        } else {
            System.out.println("Tipo de pessoa inválido.");
        }
    }

    public void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Não há pessoas cadastradas.");
        } else {
            System.out.println("Lista de pessoas cadastradas:");
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa);
            }
        }
    }

    public void buscarPessoasPorTipo(String tipo) {
        ArrayList<Pessoa> pessoasEncontradas = new ArrayList<>();

        for (Pessoa pessoa : pessoas) {
            if ((tipo.equalsIgnoreCase("cliente") && pessoa instanceof Cliente) ||
                    (tipo.equalsIgnoreCase("funcionário") && pessoa instanceof Funcionario) ||
                    (tipo.equalsIgnoreCase("gerente") && pessoa instanceof Gerente)) {
                pessoasEncontradas.add(pessoa);
            }
        }

        if (pessoasEncontradas.isEmpty()) {
            System.out.println("Nenhuma pessoa do tipo " + tipo + " encontrada.");
        } else {
            System.out.println("Pessoas do tipo " + tipo + ":");
            for (Pessoa pessoa : pessoasEncontradas) {
                System.out.println(pessoa);
            }
        }
    }
}