class Game{
  private String answer;
  private String hits;
  private String misses;
  public static final int MAX_MISSES = 7;


  public Game(String answer){
    this.answer = answer;
    hits = "";
    misses = "";
  }

  public boolean applyGuess(char letter){
    if (misses.indexOf(letter) != -1 || hits.indexOf(letter) != -1){
      throw new IllegalArgumentException(letter + " has already been guessed");
      
    }
    boolean isHit = answer.indexOf(letter) != -1;
    if (isHit){
      hits += letter;
    }else{
      misses += letter;
    }
    return isHit;
  }

  public String getCurrentProgress(){

    String progress = "";
    for (char letter : answer.toCharArray()){
      char display = '-';
      if (hits.indexOf(letter) != -1){
        display = letter;

      }
      progress += display;
    }
    return progress;
  }

  public int getRemainingTries(){
    return MAX_MISSES - misses.length();
  }

  }
