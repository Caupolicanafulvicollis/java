import java.util.Scanner;


public class aritmetica1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        int z;

        System.out.print("escriba el primer entero: ");
        x=scanner.nextInt();
        System.out.print("escriba el segundo entero: ");
        y=scanner.nextInt();
        System.out.print("escriba el tercer entero: ");
        z=scanner.nextInt();

        int sum=x+y+z;
        int mean= sum/3;

        System.out.printf("la suma es %d\n",sum);
        System.out.printf("la diferencia es %d\n",x-y-z);
        System.out.printf("el producto es %d\n",x*y*z);
        System.out.printf("el promedio es %d\n", mean);

        if (x>y  && x>z){
            System.out.printf("El mayor es ", x);
        } else if (y>x  && y>z){
            System.out.printf("El mayor es ", y);
        } else {
            System.out.printf("El mayor es ", z);
        } 
    }
}