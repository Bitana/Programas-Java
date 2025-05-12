import java.util.Scanner;
import java.util.Random;

public class ARRAYS {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.println("EJERCICIOS DEL REPARTIDO Nro 3 de PROGRAMACIÓN II");
        System.out.println("1. Cantidad de pares e impares en el array");
        System.out.println("2. Intercambiar elementos");
        System.out.println("3. Verificar si existe nombre ");
        System.out.println("4. Matriz de 3x3, Mostrar y Suma por Fila");
        System.out.println("5. Matriz 4x4, Mostrar elementos de diagonal principal");
        System.out.print("SELECCIONA una opción: (1/5): ");
        int opcion = leer.nextInt();
        leer.nextLine(); // Limpia el buffer después de leer el número

        if (opcion == 1) {
            int array[] = {10, 4, 5, 7, 9, 4, 2, 5, 7, -56};
            int sumaPares = 0;
            int sumaImpares = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    System.out.println(num + " es par.");
                    sumaPares += num;
                } else {
                    System.out.println(num + " es impar.");
                    sumaImpares += num;
                }
            }
            System.out.println("Suma de números pares: " + sumaPares);
            System.out.println("Suma de números impares: " + sumaImpares);
        } else if (opcion == 2) {
            int[] vec1 = {2, 6, 4, 5, 8, 9, 6, 4};
            int[] vec2 = {10, 2, 5, 10, 4, 7, 5, 6};
            vec1[1] = vec2[1]; vec1[3] = vec2[3];
            vec1[5] = vec2[5]; vec1[7] = vec2[7];
            vec2[1] = 6; vec2[3] = 5;
            vec2[5] = 9; vec2[7] = 4;
            System.out.print("vec1 = [");
            for (int i = 0; i < vec1.length; i++) {
                System.out.print(vec1[i] + (i < vec1.length - 1 ? ", " : ""));
            }
            System.out.println("]");
            System.out.print("vec2 = [");
            for (int i = 0; i < vec2.length; i++) {
                System.out.print(vec2[i] + (i < vec2.length - 1 ? ", " : ""));
            }
            System.out.println("]");
        } else if (opcion == 3) {
            String[] nombres = {"Ana", "Carlos", "Elena", "Javier", "Lucía"};
            System.out.print("Ingresa un nombre: ");
            String nombreBuscado = leer.nextLine();
            boolean encontrado = false;
            for (String nombre : nombres) {
                if (nombre.toLowerCase().equals(nombreBuscado.toLowerCase())) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                System.out.println("El nombre " + nombreBuscado + " se encuentra en el arreglo.");
            } else {
                System.out.println("El nombre " + nombreBuscado + " no está en el arreglo.");
            }
        }
        if (opcion == 4) {
            // Crear una matriz 3x3 con números aleatorios entre 1 y 9
            int[][] matriz3x3 = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz3x3[i][j] = random.nextInt(9) + 1;
                }
            }
            System.out.println("Matriz 3x3 generada:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz3x3[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\nSuma de cada fila:");
            for (int i = 0; i < 3; i++) {
                int sumaFila = 0;
                for (int j = 0; j < 3; j++) {
                    sumaFila += matriz3x3[i][j];
                }
                System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
            }

        } else if (opcion == 5) {
           int[][] matriz4x4 = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matriz4x4[i][j] = random.nextInt(9) + 1;
                }
            }
            System.out.println("Matriz 4x4 generada:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz4x4[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nElementos de la diagonal principal:");
            for (int i = 0; i < 4; i++) {
                System.out.print(matriz4x4[i][i] + " ");
            }
            System.out.println();
        }
        leer.close(); // Cerrar el Scanner
    }
}


