import java.util.Scanner;
public class REPARTIDO2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Identificar si un número es positivo o negativo");
            System.out.println("2. Contar las cifras de un número ingresado entre 0 y 999");
            System.out.println("3. Encontrar el mayor de tres números");
            System.out.println("4. Calcular el IMC");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número: ");
                    int numero = leer.nextInt();
                    //uso operador ternario//
                    System.out.println("El número ingresado es " + (numero >= 0 ? "positivo" : "negativo") + ".");
                    break;
                case 2:
                    System.out.print("Ingresa un número entre 0 y 999: ");
                    int cifra = leer.nextInt();
                    if (cifra < 0 || cifra > 999) {
                        System.out.println("Número fuera del rango (0/999).");
                    } else {
                        int cantidadCifras = (cifra < 10) ? 1 : (cifra < 100) ? 2 : 3;
                        System.out.println("El número tiene " + cantidadCifras + " cifras y es " + cifra + ".");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa tres números separados por un espacio: ");
                    int a = leer.nextInt();
                    int b = leer.nextInt();
                    int c = leer.nextInt();
                    int mayor = (a > b && a > c) ? a : (b > c ? b : c);
                    System.out.println("El mayor de los tres números ingresados es " + mayor + ".");
                    break;
                case 4:
                    System.out.print("Ingresa tu peso en kg: ");
                    double peso = leer.nextDouble();
                    System.out.print("Ingresa tu altura en metros: ");
                    double altura = leer.nextDouble();
                    double imc = peso / (altura * altura);
                    System.out.printf("Tu Índice de Masa Corporal (IMC) es %.2f.%n", imc);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");

            }
        } while (opcion != 5);

        leer.close();
    }
}