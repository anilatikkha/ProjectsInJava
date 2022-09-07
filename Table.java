import java.util.Scanner;
public class Table {

   public static void main(String[] args)
   {
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter a number: ");
   int number=sc.nextInt();
   int table;
   for(int i=1; i<10; i++)
   {
      table= number*i;
      System.out.println(number+ " X " +i+" = "+ table);
   }
   sc.close();
   
}
}
