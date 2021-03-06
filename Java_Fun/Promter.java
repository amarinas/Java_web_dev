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
      boolean isHit = false;
      try{
        isHit = game.applyGuess(guess);

      }catch(IllegalArgumentException iae){
        System.out.println(iae.getMessage());
      }

      return isHit;

    }

  public void displayProgress(){
    System.out.printf("You have %d tries left to solve: %s%n",game.getRemainingTries(), game.getCurrentProgress());
  }
  }
