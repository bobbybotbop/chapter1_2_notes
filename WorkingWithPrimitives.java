public class WorkingWithPrimitives
{
  public static void main()
  {
    System.out.println("This is a String literal");
    
    
    //primitives are the most basic data type in java
    //when you create a primitive there are two components declare and initialize
    //declare is why you give a variable a type
    int age;
    //initialize is when you give it a value
    age = 18;
    //you can only declare a variable of a type once, if you want to make a change you just use the variable name.
    age = 21;
    // = assignment operator
    int year = 2021;
    //did both declare and initialize
    //type variableName = value;
    System.out.print(year);
    System.out.println(" year");
    
    System.out.print("I am ");
    System.out.print(age);
    System.out.println(" years old.");

    //concatenation operator +

    System.out.println("I am " + age + " years old.");
    System.out.println(4+7);
    System.out.println(age+year);
    System.out.println("4+7=" + 4+7);
    System.out.println("4+7=" + (4+7));
    System.out.println(4+7+"4+7");

    //int daysInWeek = 7;
    final int DAYS_IN_WEEK = 7;
    //DAYS_IN_WEEK = 9; cannot assign a value to a final variable

    int one = 1;
    one = 2;
    int two = 2;
    int three = 3;
    int four = 4;
    final int five = 5;
    System.out.println(one + two + three + four + five);

    double temp = 98.62;
    System.out.println(temp);

    double gpa = 3;
    System.out.println(gpa);

    //int gradeAverage = 2.4;

    System.out.println(2+3.1415);
    System.out.println(2+5);
    System.out.println(2.1+3.2);
    //math with only its your result will be an int
    //if one or more numbers are a double the result will be a double
    System.out.println(5-2);
    System.out.println(5*3.2);
    System.out.println(7/2); // this will give me an int because there is no double in the equation.
    //numbers of times it goes in evenly
    System.out.println(7%2);
    //% is remainder only with ints

    System.out.println(3/4);
    System.out.println(3%4);
    System.out.println(3.0/4);

    //CASTING
    //wrapping something up to look like something else
    //casting works with the next number that is in ()
    System.out.println((int)1.6);
    System.out.println((double)(7/4));
    System.out.println((double)(7)/4);

    int q = (int)1.6;

    //pemdas
    //(), expo, */(L---R), +-(L---R)

    //boolean
    //booleans are primitives
    boolean torf1 = true;
    boolean torf2 = false;

    //characters are primitives and are 1 letter
    char letter = 'a';
    
    int number = 1;
    System.out.println(number+1);
    System.out.println(number);

    //number = number + 1; these are the same thing
    number++;

    //number = number - 1; these are the same thing
    number--;

    //number = number + 3; these are the same thing
    number += 3;

    number *= 4; //number = number * 4

    






  }
}