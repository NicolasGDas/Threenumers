import java.util.Scanner;

/**
 * 3number
 */
public class threenumber 
{
    public static void main(String[] args) 
    {
        int num1,num2,num3;
        String scan;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor a comparar");
        scan = sc.nextLine();
        num1=Integer.parseInt(scan);
        System.out.println("Ingrese el segundo valor a comparar");
        scan = sc.nextLine();
        num2=Integer.parseInt(scan);
        System.out.println("Ingrese el tercer valor a comparar");
        scan = sc.nextLine();
        num3=Integer.parseInt(scan);
        if(num1==num2 && num3==num2)
        {
            System.out.println("Los tres numeros son iguales");
        }
        


    }
    
}