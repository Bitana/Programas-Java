import java.util.Scanner;
public class EJERCICIOS {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("EJERCICIOS DEL REPARTIDO Nro 1 de PROGRAMACIÓN II");
        System.out.println("1. Saludo personalizado");
        System.out.println("2. Suma de dos números");
        System.out.println("3. Calculadora de edad ");
        System.out.println("4. Área de un rectángulo");
        System.out.println("5. Conversor de temperatura");
        System.out.println("6. Simulador de compra");
        System.out.println("7. Información del usuario");
        System.out.print("SELECCIONA una opción: (1/7)");
        int opcion = leer.nextInt();

        if (opcion ==1) {
            System.out.print("Nombre del estudiante: ");
            String nombreEstudiante = leer.next();
            System.out.print("Hola: " + nombreEstudiante + " Bienvenid@");
        }
        if (opcion ==2) {
            System.out.println("Ingresá el primer número:");
            int num1 = leer.nextInt();
            System.out.println("Ingresa el segundo número:");
            int num2 = leer.nextInt();
            int suma = num1 + num2;
            System.out.println("La suma es: " + suma);
        }
        if (opcion ==3) {
            System.out.println("Ingresá el año actual:");
            int añoActual = leer.nextInt();
            System.out.println("Ingresa tu año de nacimiento:");
            int añoNacimiento = leer.nextInt();
            int edad = añoActual - añoNacimiento;
            System.out.println("Tu edad es: " + edad + " años");
        }
        if (opcion ==4) {
            System.out.println("Ingresá el largo del rectángulo:");
            int largo = leer.nextInt();
            System.out.println("Ingresa el ancho del rectángulo:");
            int ancho = leer.nextInt();
            int area = largo * ancho;
            System.out.println("El área es: " + area);
        }
        if (opcion ==5) {
            System.out.println("Ingresá la temperatura en Celsius:");
            double temperatura = leer.nextDouble();
            double Faranheit =((temperatura *9/5) + 32);
            System.out.println("La temperatura en Faranheit es : " + Faranheit);
        }
        if (opcion ==6) {
            System.out.println("Ingresá el precio del primer producto:");
            double precio1 = leer.nextDouble();
            System.out.println("Ingresá el precio del segundo producto:");
            double precio2 = leer.nextDouble();
            System.out.println("Ingresá el  precio del tercer producto:");
            double precio3 = leer.nextDouble();
            double Total = precio1 + precio2 + precio3 ;
            double TotalConIva = Total * 1.22;
            System.out.println("El total final es : " + TotalConIva);
        }
        if (opcion ==7) {
            System.out.println("Ingresá el nombre:");
            String nombreUsuario = leer.next();
            System.out.println("Ingresá la edad:");
            int edadUsuario = leer.nextInt() ;
            System.out.println("Ingresá la ciudad donde vivis:");
            String ciudadsuario = leer.next();
            System.out.println("Hola  " +nombreUsuario + " tenés  " + edadUsuario +" años y vivis en  " +ciudadsuario );
        }
                            }
}
