class PezDispenser{
  final private String characterName;
  public static final int MAX_PEZ = 12;
  private int pezCount;
  //final can only be declared once

  public PezDispenser(String name){
    this.characterName =  name;
    pezCount = 0;

  }


  public void fill(){
    fill(MAX_PEZ);
  }

  public boolean isEmpty(){
    return pezCount == 0;
  }

  public String getCharacterName(){
    return characterName;
  }

  public boolean dispense(){
    boolean wasDispensed = false;
    if(!isEmpty()){
      pezCount --;
      wasDispensed = true;
    }
    return wasDispensed;

  }

  public void fill(int pezAmount){
      int newAmount = pezCount + pezAmount;
      if (newAmount > MAX_PEZ) {
        throw new IllegalArgumentException("Too Many PEZZ!!!");
      }
      pezCount = newAmount;

  }
  // public String swapHead(String characterName){
  //   String originalCharacterName = this.characterName;
  //   this.characterName = characterName;
  //   return originalCharacterName;
  // }

}
