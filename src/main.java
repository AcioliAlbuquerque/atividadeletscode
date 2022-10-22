import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de temperaturas");
        int hh = teclado.nextInt();

        int zz = 1;
        List<Double> d = new ArrayList<>();

        for (int i = 0; i < hh; i++) {
            System.out.println("Temperatura " + zz++);
            double kl = teclado.nextDouble();
            d.add(kl);
        }

        System.out.println("Qual o estado de destino: ");

        System.out.println("1 - Kelvin -> Celsius ");
        System.out.println("2 - Kelvin -> Fahrenheit ");
        System.out.println("3 - Celsius -> Kelvin ");
        System.out.println("4 - Celsius -> Fahrenheit ");
        System.out.println("5 - Fahrenheit -> Celsius ");
        System.out.println("6 - Fahrenheit -> Kelvin ");
        int temperaturaDestino = teclado.nextInt();

        int z = 1;
        double soma = 0;
        for (int i = 0; i < d.size(); i++) {
            if (temperaturaDestino == 1) {
                double resul = d.get(i) - 273;
                soma += resul;
                System.out.print(z++ + " Varlos: ");
                System.out.printf("%.2f %n", resul);

            } else if (temperaturaDestino == 2) {
                double resul = (d.get(i) - 273.15) * 9 / 5 + 32;
                soma += resul;
                System.out.print(z++ + " Varlos: ");
                System.out.printf("%.2f %n", resul);

            } else if (temperaturaDestino == 3) {
                double resul = d.get(i) + 273.15;
                soma += resul;
                System.out.print(z++ + " Varlos: ");
                System.out.printf("%.2f %n", resul);

            } else if (temperaturaDestino == 4) {
                double resul = (d.get(i) * 9 / 5) + 32;
                soma += resul;
                System.out.print(z++ + " Varlos: ");
                System.out.printf("%.2f %n", resul);

            } else if (temperaturaDestino == 5) {
                double resul = (d.get(i) - 32) * 5 / 9;
                soma += resul;
                System.out.print(z++ + " Varlos: ");
                System.out.printf("%.2f %n", resul);

            } else if (temperaturaDestino == 6) {
                double resul = (d.get(i) - 32) * 5 / 9 + 273.15;
                soma += resul;
                System.out.print(z++ + " Varlos: ");
                System.out.printf("%.2f %n", resul);
            }
        }
        System.out.printf("Media dos valores : %.2f", soma / d.size());
    }
}



