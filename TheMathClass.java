import java.util.*;
public class TheMathClass
{
  public static void main()
  {
  //The math class is special in that it is Static
  //we NEVER create an object of the math class
  //We call methods directly on the word Math
  System.out.println(Math.abs(-2));
  double abs1 = Math.abs(-3.14);
  System.out.println(abs1);
  System.out.println(Math.sqrt(16));
  double pow1 = Math.pow(2,3);
  System.out.println(pow1);
  System.out.println(Math.PI);
  }
}
