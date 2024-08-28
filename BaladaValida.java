import java.util.Scanner;

public class BaladaValida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seu nome: ");
        String nome = scanner.next();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();


        if (idade >= 18) {
            System.out.print("Esta liberado!");
        } else {
            System.out.print("" + nome + " pode voltar pra casa, menor de idade não entra aqui ");

        }
        scanner.close();
    }

    ;
}






