import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        char check;
        Double preco;

        System.out.print("Digite o codigo do seu destino: ");

        System.out.println("Digite: \n 1- Região Norte \n 2- Região Nordeste \n 3- Região Centro-Oeste \n 4- Região Sul  ");
        int regiao = scanner.nextInt();

        switch (regiao){
            case 1:
                System.out.print("A sua passagem é ida e volta? S = Sim e N = Não ");
                check = scanner.next().charAt(0);
                if (check == 'S'){
                    System.out.print("O valor da sua passagem partindo de São Paulo para Região Norte. Ida e Volta ficou R$900 ");
                    break;

                }
                else {
                    System.out.print("O valor da sua passagem partindo de São Paulo para Região Norte. Somente ida ficou R$500 ");
                    break;

                }

            case 2:
                System.out.print("A sua passagem é ida e volta? S = Sim e N = Não ");
                check = scanner.next().charAt(0);

                if (check=='S'){
                    System.out.print("O valor da sua passagem partindo de São Paulo para Região Nordeste. Ida e Volta ficou R$650 ");
                    break;

                }
                else {
                    System.out.print("O valor da sua passagem partindo de São Paulo para Região Nordeste. Somente ida ficou R$350 ");
                    break;

                }

            case 3:
                System.out.print("A sua passagem é ida e volta? S = Sim e N = Não ");
                check = scanner.next().charAt(0);

                if (check=='S'){
                    System.out.print("O valor da sua passagem partindo de São Paulo para Centro-Oeste. Ida e Volta ficou R$600 ");
                    break;

                }
                else {
                    System.out.print("O valor da sua passagem partindo de São Paulo para Centro-Oeste. Somente ida ficou R$350 ");
                    break;

                }

            case 4:
                System.out.print("A sua passagem é ida e volta? S = Sim e N = Não ");
                check = scanner.next().charAt(0);

                if (check=='S'){
                    System.out.print("O valor da sua passagem partindo de São Paulo para Região Sul. Ida e Volta ficou R$550 ");
                    break;

                }
                else {
                    System.out.print("O valor da sua passagem partindo de São Paulo para Região Sul. Somente ida ficou R$600 ");
                    break;

                }

            default:
                System.out.print("Região INVALIDA! ");
        }



        scanner.close();
    }
}
