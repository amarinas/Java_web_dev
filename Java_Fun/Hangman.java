public class Hangman{

  public static void main(String[] args){

    Game game = new Game("treehouse");
    Promter prompter = new Promter(game);
    boolean isHit = prompter.promptForGuess();
    if (isHit){
      System.out.println("We got a hit");
    }else{
      System.out.println("wrong letter");
    }
  }


}
