public class Hangman{

  public static void main(String[] args){
    if (args.length ==0){
      System.out.println("Usage: java hangmean <answer>");
      System.err.println("answer is required");
      System.exit(1);

    }
    Game game = new Game(args[0]);
    Promter prompter = new Promter(game);
    while(game.getRemainingTries()> 0 && !game.isWon()){

    prompter.displayProgress();
    prompter.promptForGuess();
    }
    prompter.displayOutcome();

  }
}
