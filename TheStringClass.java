public class TheStringClass
{
  public static void main ()
  {
    System.out.println("The String Class"); 
    //primitives are javas most basic data type
    //objects are more complex
    //strings are objects

    String dayOfWeek = new String ("Friday"); //when creating any object you will follow this format
    //ClassName objectName = new ClassName (parameters);

    //because strings are used so often they can be created or instantiated using a primitive way

    int x = 2;
    String tom = "Saturday"; //ONLY STRINGS

    //objects have things they can do, methods
    //some of these methods need additional information to complete the task, parameters

    //method signature
    //int length()
    //returns an int, its called length, and requires no additional information
    //returnType methodName(parameters)
    //return type is the kind of variable you get back

    //when we call a method
    //returnType variableName = objectName.methodName(parameters)


    int len1 = dayOfWeek.length();
    int len2 = tom.length();

    System.out.println("the word " + dayOfWeek + " has " + len1 + " characters");
    System.out.println("the word " + tom + " has " + len2 + " characters");


    //int indexOf(String str)
    int loc1 = dayOfWeek.indexOf("r");
    System.out.println(loc1);

    //indices start at 0
    int loc2 = tom.indexOf("Sat");
    System.out.println(loc2);

    //if it is not found, it returns -1
    int loc3 = tom.indexOf("sat");
    System.out.println(loc3);

    System.out.println("hello".indexOf("l"));
    /*//if find multiple, it chooses the first 1

    String end = dayOfWeek.substring(3);
    System.out.println(end);
    //Friday || counts 3, then it starts printing the value
    //string substring(int offset)
    //returns a new string that starts at index offset and extends to the end

    String start = tom.substring(0, 3);
    System.out.println(start);
    //saturday
    System.out.println("Hello".substring(1,3));
    //string substring(int offset, int endIndex)
    //returns a new string that starts at index offset and ends with the character at position endIndex-1

    System.out.println("Hello".substring(0,0));
    //prints empty
    System.out.println("Hello".substring(4,5));
    //System.out.println("Hello".substring(3,6));
    //runtime error, index out of bounds

    boolean same1 = dayOfWeek.equals(tom);
    boolean same2 = tom.equals(tom);

    System.out.println(same1 + " " + same2);

    int compVal1 = "Dog".compareTo("Cat");
    System.out.println(compVal1);
    //prints 1
    int compVal2 = "Cat".compareTo("Dog");
    System.out.println(compVal2);
    //prints -1
    int compVal3 = "Dog".compareTo("cat");
    System.out.println(compVal3);
    //prints -31
*/
  }
}