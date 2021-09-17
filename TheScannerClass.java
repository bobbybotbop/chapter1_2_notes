import java.util.*;

public class TheScannerClass
{
  public static void main ()
  {
    System.out.println("The Scanner Class");

    String example = new String("word");
    //className objectName = new className(param)
    //all objects follow this format
    //the scanner class allows us to read inpit from the keybaord
    //the class already exists we are just using it 
    //in order to access it we need an import statement

    Scanner scan = new Scanner(System.in);
    System.out.print("what is the name of this class? ");
    String course = scan.nextLine();
    System.out.println(course + " sounds very interesting");
    System.out.print("what period do u have " + course+" ");
    int per = scan.nextInt();
    System.out.println("we have "+course+" everyday period "+per);
    System.out.print("what is ur gpa in this class ");
    double gpa = scan.nextDouble();
    System.out.println("wow "+gpa+" is a great average");

    /*
what is the name of this class? ap comp sci a
ap comp sci a sounds very interesting
what period do u have ap comp sci a 50
we have ap comp sci a everyday period 50
what is ur gpa in this class 5.69
wow 5.69 is a great average
    */
  }
}