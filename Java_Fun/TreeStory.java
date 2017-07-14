//Simple Madlib

import java.io.Console;


public class TreeStory{
  public static void main(String[] args){


    Console console = System.console();
  /* Terms:
     noun - Person, Place or thing
     verb - an Action
     adjective - a description used to modify or describe a noun
  */

    String name = console.readLine("Enter a name:  ");
    String adjective = console.readLine("Enter an adjective:  ");
    String noun = console.readLine("Enter a noun:  ");
    String adverb = console.readLine("Enter an adverb:  ");
    String verb = console.readLine("Enter a verb ending with -ing:  ");

    console.printf("Your TreeStory:\n -----------\n");
    console.printf("%s is a %s %s.  ", name, adjective, noun);
    console.printf("They are always %s %s \n", adverb, verb);

  }
}
