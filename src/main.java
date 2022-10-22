import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é a quantidade de temperaturas para transformação que deseja: ");
        int valor = teclado.nextInt();
        System.out.println("Qual é o estado da temperatura que deseja: ");
        System.out.println("1 - Celsius ");
        System.out.println("2 - Kelvin");
        System.out.println("3 - Fahrenheit");

        System.out.println("Qual o estado de origem: ");
        int temperaturaOrigem = teclado.nextInt();

        System.out.println("Qual o estado de destino: ");
        int temperaturaDestino = teclado.nextInt();
        int resultado = 0;

        System.out.println("Kelvin -> Celsius");
        if (temperaturaOrigem == 1 && temperaturaDestino == 2) {
            resultado = valor - 273;
            System.out.println(resultado);

        } else if (temperaturaOrigem == 2 && temperaturaDestino == 3) {
            resultado = ((int) (valor * 1.8)) + 32;
            System.out.println(resultado);


        } else if (temperaturaOrigem == 3 && temperaturaDestino == 4) {
            double fd = valor + 273.15;
            System.out.println(fd);
        }
    }
}
