import java.util.Scanner;

public class Promter{

  private Game game;

  public Promter(Game game){
    this.game = game;

  }

  public boolean promptForGuess(){
    boolean isHit = false;
    Scanner scanner = new Scanner(System.in);
    boolean isAcceptable = false;

    do{
      System.out.print("Enter a letter: ");
      String guessInput = scanner.nextLine();

      try{
        isHit = game.applyGuess(guessInput);
        isAcceptable = true;

      }catch(IllegalArgumentException iae){
        System.out.printf("%s. please try again. %n",
                            iae.getMessage());
      }
    }while(! isAcceptable);
      return isHit;

    }

  public void displayProgress(){
    System.out.printf("You have %d tries left to solve: %s%n",game.getRemainingTries(), game.getCurrentProgress());
  }

  public void displayOutcome(){
    if (game.isWon()){
      System.out.printf("Congrats you won with %d tries remaining. %n", game.getRemainingTries());

    }else{
      System.out.printf("Darn the word was %s.  :( %n", game.getAnswer());
    }
  }
  }
