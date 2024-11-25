import java.util.Scanner;

public class comparacion1 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x;
        int y;

        System.out.print("escriba el primer entero: ");
        x=input.nextInt();

        System.out.print("escriba el segundo entero: ");
        y=input.nextInt();

        if(x>y){
            System.out.printf("%d es mas grande que %d\n",x,y);
        } else if (x<y){
            System.out.printf("%d es mas grande que %d\n",y,x);
        } else {
            System.out.printf("%d y %d son iguales\n",x,y);
        }
    }
}
