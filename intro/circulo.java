import java.util.Scanner;

public class circulo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int r = 0;

        System.out.print("Escriba el valor del radio de la circunferencia: ");
        r = scanner.nextInt(); // Leer el radio

        // Calcular el diámetro
        double d = 2 * r;
        System.out.printf("El diámetro de la circunferencia es: %.2f\n", d);

        // Calcular el área
        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("El área de la circunferencia es: %.2f\n", area);

        // Calcular el perímetro
        double p = 2 * Math.PI * r;
        System.out.printf("El perímetro de la circunferencia es: %.2f\n", p);

        scanner.close(); // Cerrar el Scanner (buena práctica)
    }
}
