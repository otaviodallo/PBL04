import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();
        Scanner scanner = new Scanner(System.in);

        boolean executando = true;
        while (executando) {
            System.out.println("---- Menu ----");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Listar pessoas");
            System.out.println("3. Buscar pessoas por tipo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a leitura do número

            switch (opcao) {
                case 1:
                    cadastro.cadastrarPessoa();
                    break;
                case 2:
                    cadastro.listarPessoas();
                    break;
                case 3:
                    System.out.print("Digite o tipo de pessoa (cliente, funcionário ou gerente): ");
                    String tipo = scanner.nextLine();
                    cadastro.buscarPessoasPorTipo(tipo);
                    break;
                case 4:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println(); // Adicionar uma linha em branco para melhorar a legibilidade
        }

        System.out.println("Programa encerrado.");
    }
}