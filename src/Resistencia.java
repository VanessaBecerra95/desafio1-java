import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de resistencias ingrese solo valores positivos");
        float resistencia1;
        do {
            System.out.println("Ingrese el valor de la resistencia 1: ");
            resistencia1 = sc.nextFloat();
            if (resistencia1 <= 0) {
                System.out.println("Dato inválido debe ser positivo");
            }
        } while (resistencia1 <= 0);

        float resistencia2;
        do {
            System.out.println("Ingrese el valor de la resistencia 2: ");
            resistencia2 = sc.nextFloat();
            if (resistencia2 <= 0) {
                System.out.println("Dato inválido debe ser positivo");
            }
        } while (resistencia2 <= 0);

        float resistencia3;
        do {
            System.out.println("Ingrese el valor de la resistencia 3: ");
            resistencia3 = sc.nextFloat();
            if (resistencia3 <= 0) {
                System.out.println("Dato inválido debe ser positivo");
            }
        } while (resistencia3 <= 0);

        float resistenciaTotal = 1 / ((1 / resistencia1) + (1 / resistencia2) + (1 / resistencia3));
        System.out.println("La resistencia total es de " + resistenciaTotal);
    }
}