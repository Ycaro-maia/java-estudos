import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num2;
        int num1;
        while (true) {

            System.out.println("Calculadora em java ");

            System.out.printf("Digite o primeiro valor: ");
            num1 = scanner.nextInt();

            System.out.printf("Digite o segundo valor: ");
            num2 = scanner.nextInt();

            System.out.println("Digite: \n1 - soma \n2 - subtração \n3 - multiplicação \n4 - divisão \n5 - exit");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("multiplicação: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("divisão " + (num1 / num2));
                    break;
                case 5: {
                    System.out.print("Saindo");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.print("Opção invalida");
                    break;

            }

            if (opcao == 5){
                break;
            }

        }
        scanner.close();

    }
}
