import java.util.Scanner;

public class Calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a =sc.nextInt();
        System.out.println("Enter b: ");
        int b =sc.nextInt();
        sc.close();  
        int add= a+b;
        int sub= a-b;
        int mul=a*b;
        int div=a/b;
        System.out.println("Addition: "+add); 
        System.out.println("Substraction: "+sub);
        System.out.println("Multiply: "+mul);
        System.out.println("Divide: "+div);
    }
}
