import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Requisito 1: Pedir uma medida em metros
        System.out.println("Entre com a medida em metros: ");
        double metros = scanner.nextDouble();
        scanner.close();

        // Requisito 2: Calcular centimetros a partir do metro
        double centimetros = metros * 100;

        // Requisito 3: Imprima medida em centimetros
        System.out.print("A medida em centimetros será: " + centimetros);

    }

}
