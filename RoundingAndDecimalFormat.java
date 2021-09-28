import java.text.*;
public class RoundingAndDecimalFormat
{
  public static void main ()
  {
    DecimalFormat f = new DecimalFormat("0.###");

    DecimalFormat bruh = new DecimalFormat("0.###");
    //className objectName = new className(parameters);
    double pi = Math.PI;
    System.out.println(pi);
    System.out.println("Pi rounded to 3 decimal places is " + f.format(pi));
    System.out.println("Pi rounded to 3 decimal places is " + bruh.format(pi));
  }
}