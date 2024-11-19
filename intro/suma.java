//el rpograma usa la clase Scanner
import java.util.Scanner;
public class suma {
    public static void main(String args[]){
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;   
        int suma;

        System.out.print("Escriba el primer entero ");
        numero1 = entrada.nextInt(); //lee el pirmer numero del usuario

        System.out.print("Escriba el segundo entero ");
        numero2=entrada.nextInt();

        suma=numero1+numero2;

        System.out.printf("La suma es %d\n", suma);
    }
}
