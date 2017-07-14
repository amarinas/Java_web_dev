import java.io.Console;

public class Intro{

  public static void main(String[]args){
    Console console = System.console();
    String bye = "goodbye";
    console.printf("hello, my name is ali\n");
    console.printf("%s see you later\n", bye);

    String yourName = console.readLine("What is your name?  ");

    console.printf("nice to meet you %s \n", yourName);
  }
}
