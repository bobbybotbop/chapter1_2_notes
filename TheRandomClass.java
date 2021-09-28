import java.util.*;
public class TheRandomClass
{
  public static void main ()
  {
    //className objectName = new className(parameters)
    Random nG = new Random();
    //ng number generator
    int num1 = nG.nextInt(4);
    //4 distinct numbers, 0, 1, 2, 3
    System.out.println(num1);

    //num2 that will store a number between 1 and 10
    int num2 = nG.nextInt(10) + 1;
    System.out.println(num2);

    int num3 = (nG.nextInt(5)+1)*5;
    System.out.println(num3);

    double num4 = nG.nextDouble();
    System.out.println(num4);
    //[0,1)

    //another way thats more common

    int num5 = (int)(Math.random() *4);
    System.out.println(num5);
    //1, 2, 3, 4


    
    
  }
}