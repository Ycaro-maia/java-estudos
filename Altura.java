import java.util.Scanner; // importando um scanner que seria para alguem digitar
public class Altura {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); // variavel scaner
        System.out.print("Digite sua altura:");

        float altura = scanner.nextFloat(); // variavel altura sempre informar depois da interação com o usuario
        System.out.print("Sua altura é:" + altura + "."); // + é para concatenar juntar





        scanner.close(); // fechar objeto scanner para liberar memoria

    }


}
