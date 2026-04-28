package ecuacionsegundogradomain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double discriminante, x1, x2;

        System.out.print("Ingrese a: ");
        a = sc.nextDouble();

        System.out.print("Ingrese b: ");
        b = sc.nextDouble();

        System.out.print("Ingrese c: ");
        c = sc.nextDouble();

        // Validación de ecuación cuadrática
        if (a == 0) {
            System.out.println("No es ecuacion de segundo grado (a no puede ser 0).");
            return;
        }

        discriminante = (b * b) - (4 * a * c);

        if (discriminante > 0) {

            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Dos raices reales diferentes:");
            System.out.println("Raiz 1: " + x1);
            System.out.println("Raiz 2: " + x2);

        } else if (discriminante == 0) {

            x1 = (-b) / (2 * a);

            System.out.println("Una raiz real doble:");
            System.out.println("Raiz: " + x1);

        } else {

            System.out.println("No existen raices reales (discriminante negativo).");
        }
    }
}