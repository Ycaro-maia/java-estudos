import java.util.Scanner;



public class DistanciaMoto {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos KM sua moto faz com 1L de combustivel?");

        float consumo = scanner.nextFloat();
        System.out.print("Digite a distancia em KM para onde você vai:");

        float distancia = scanner.nextFloat();

        System.out.print("digite o valor atual da gasolina:");
        float combust = scanner.nextFloat();


        float litros = distancia/consumo;
        float gasto_gasolina = combust*litros;


        System.out.print("Para você rodar " + distancia + "em KM, você vai gastar " + litros + "L de gasolina, e ira pagar no combustivel total: R$" + gasto_gasolina+ "");
        scanner.close();

    }
}