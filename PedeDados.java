import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class PedeDados { // Declaração da classe principal chamada PedeDados
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");

        int idade = scanner.nextInt();

        System.out.print("Você tem " + idade + " anos de idade");

        scanner.close();

    }
}
