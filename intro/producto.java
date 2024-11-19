import java.util.Scanner;

public class producto {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        int x;
        int y;
        int z;
        int producto;

        System.out.print("escriba el primer entero: ");
        x=entrada.nextInt();

        System.out.print("escriba el segundo entero: ");
        y=entrada.nextInt();

        System.out.print("escriba el tercer entero: ");
        z=entrada.nextInt();

        producto=x*y*z;
        System.out.printf("El producto es %d\n", producto);
    }    
}
