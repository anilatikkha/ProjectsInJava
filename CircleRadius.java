//************* Lecture 2 *****************
import java.util.Scanner;
public class CircleRadius {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the radius of the circle:");
      double radius=sc.nextDouble();
      double area= 3.14*radius* radius;
      System.out.println("area of a circle with radius "+ radius+" is: "+area);
      sc.close();
      System.out.println(area);
    }
}
