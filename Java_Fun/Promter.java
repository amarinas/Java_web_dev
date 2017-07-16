import java.util.Scanner;

class Promter{

  private Game game;

  public Promter(Game game){
    this.game = game;

  }

  public boolean promptForGuess(){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a letter: ");
      String guessInput = scanner.nextLine();
      char guess = guessInput.charAt(0);
      return game.applyGuess(guess);


    }
  }
