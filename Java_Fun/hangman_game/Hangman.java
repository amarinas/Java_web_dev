public class Hangman{

  public static void main(String[] args){

    Game game = new Game("treehouse");
    Promter prompter = new Promter(game);
    while(game.getRemainingTries()> 0 && !game.isWon()){

    prompter.displayProgress();
    prompter.promptForGuess();
    }
    prompter.displayOutcome();

  }
}
