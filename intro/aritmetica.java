import java.util.Scanner;

public class aritmetica{
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);

        int x;
        int y;
        int producto;
        int suma;
        int coeciente;
        int diferencia;

        System.out.print("escriba el primer entero: ");
        x=entrada.nextInt();

        System.out.print("escriba el segundo entero: ")
        y=entrada.nextInt();

        suma=x+y;
        diferencia=x-y;
        producto=x*y;
        coeciente=x%y;

        System.out.printf("la suma es %d\n",suma);
        System.out.printf("la resta es %d\n",diferencia);
        System.out.printf("el producto es %d\n",producto);
        System.out.printf("el coeciente es %d\n",coeciente);
    }
}
