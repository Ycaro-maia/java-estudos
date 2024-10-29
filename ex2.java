import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe os ultimos 4 digitos da placa: ");
        String placa = scanner.next();
        String fnplaca = placa.substring(3,4);


        switch (fnplaca) {
            case "1":
            case "2":
                System.out.print("Seu rodizio é na segunda feira! ");
                break;

            case "3":
            case"4":
                System.out.print("Seu rodizio é na terça feira! ");
                break;

            case "5":
            case "6":
                System.out.print("Seu rodizio é na quarta feira!");
                break;

            case "7":
            case "8":
                System.out.print("Seu rodizio é na quinta feira! ");
                break;

            case "9":
            case "0":
                System.out.print("Seu rodizio é na sexta feira! ");
                break;

            default:
                System.out.print("Invalido ");







        }




        scanner.close();
    }
}
