import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cargo;
        double sal;
        double nv_sal;
        double aumento;

        System.out.print("Digite o codigo do cargo do funcionario: ");
        cargo = scanner.nextInt();

        System.out.print("Digite o salario do funcionario R$");
        sal = scanner.nextDouble();

        switch (cargo) {

            case 1:
                nv_sal = (sal * 0.50) + sal;
                aumento = nv_sal - sal;
                System.out.println("O seu funcionario do cargo Escriturário teve um aumento de " + aumento + " e seu novo salário é de R$" + nv_sal + ".");
                break;

            case 2:
                nv_sal = (sal * 0.35) + sal;
                aumento = nv_sal - sal;
                System.out.println("O seu funcionario do cargo Secretário teve um aumento de " + aumento + " e seu novo salário é de R$" + nv_sal + ".");
                break;

            case 3:
                nv_sal = (sal * 0.20) + sal;
                aumento = nv_sal - sal;
                System.out.println("O seu funcionario do cargo Caixa teve um aumento de " + aumento + " e seu novo salário é de R$" + nv_sal + ".");
                break;
            case 4:
                nv_sal = (sal * 0.10) + sal;
                aumento = nv_sal - sal;
                System.out.println("O seu funcionario do cargo Gerente teve um aumento de " + aumento + " e seu novo salário é de R$" + nv_sal + ".");
                break;
            case 5:
                System.out.println("O seu funcionario do cargo Diretor não tem aumento");
                break;
            default:
                System.out.println("Cargo digitado invalido!");
                break;

        }
    }
}
