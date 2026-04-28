package ecuacionsegundogradoramas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double x1, x2;

        System.out.print("Ingrese a: ");
        a = sc.nextInt();

        System.out.print("Ingrese b: ");
        b = sc.nextInt();

        System.out.print("Ingrese c: ");
        c = sc.nextInt();
        x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        x2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

        System.out.println("Raiz 1: " + x1);
        System.out.println("Raiz 2: " + x2);
    }
}