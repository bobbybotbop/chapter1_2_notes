public class PrintEscapeCharacter
{
  public static void main()
  {
    System.out.println("this will print and then go to a new line");
    System.out.print("This will be ");
    System.out.println("on the same line");
    //println displays what is in the "" and then goes to the next line
    //print displays what is in the "" and stays on the current line
    //escape character, \
    System.out.println("it\ncan\ngo\nto\na\nnew\nline");
    System.out.println("it\tcan\tbe\tused\tto\ttab");
    System.out.println("it can be used to display a \" on the screen");

    System.out.println("This is the escape character, \\");
    System.out.println("it can also be used to print symbols \u01A9");
    //the ecape character can tell the computer "I know this next character has a special meaning but just ignore it and display it"
    System.out.println("here is another symbol \u262D");
    System.out.println("hi\nhi");
    System.out.println("hi\thi");
    System.out.println(" \"bruh\"");
    System.out.println("\\\\\\\\\\");
  }
}