import java.util.Scanner;

public class UtilidadesNumericas {
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    public static void mostrarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("El mayor número es: " + mayor);
    }

    public static long factorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * factorial(numero - 1);
    }

    public static void imprimirDescendente(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        imprimirDescendente(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Verificar si un número es par o impar");
            System.out.println("2. Encontrar el mayor de 5 números");
            System.out.println("3. Calcular el factorial de un número");
            System.out.println("4. Imprimir los números desde n hasta 1");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número entero: ");
                    int numero = scanner.nextInt();
                    System.out.println("¿El número " + numero + " es par? " + esPar(numero));
                    break;
                case 2:
                    int[] numeros = new int[5];
                    System.out.println("Ingresa 5 números enteros:");
                    for (int i = 0; i < 5; i++) {
                        numeros[i] = scanner.nextInt();
                    }
                    mostrarMayor(numeros);
                    break;
                case 3:
                    System.out.print("Ingresa un número para calcular su factorial: ");
                    int numFactorial = scanner.nextInt();
                    System.out.println("El factorial de " + numFactorial + " es: " + factorial(numFactorial));
                    break;
                case 4:
                    System.out.print("Ingresa un número para imprimir desde n hasta 1: ");
                    int numDescendente = scanner.nextInt();
                    imprimirDescendente(numDescendente);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
    }
}