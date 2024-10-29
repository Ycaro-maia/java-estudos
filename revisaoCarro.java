import java.util.Scanner;


public class revisaocarro {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos KM seu carro esta agora: ");
        float km_atual = scanner.nextFloat();
        float revisao = 60000;

        if (km_atual >= revisao) {
            float passou = km_atual - revisao;
            System.out.print("Seu carro precisa urgente fazer revisão, você andou " + passou + "KM a mais ");
        }
        else {
            float sobrando = revisao - km_atual;
            System.out.print("Seu carro ainda pode rodar mais KM " + sobrando+ "");
        }


        scanner.close();
    }
}
