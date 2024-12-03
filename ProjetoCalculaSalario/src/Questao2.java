import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preco da gasolina: ");
        double gasolina = scanner.nextDouble();

        System.out.println("Digite a distancia que sera percorrida: ");
        double distancia = scanner.nextDouble();

        double custo = (distancia/12) * gasolina;
        System.out.println("O custo total será " + custo);
        scanner.close();

    }
}
