public class Example{

    public static void main(String[] args){

      System.out.println("We are making a new PEZ Dispenser");
      PezDispenser dispenser = new PezDispenser("Donnatello");
      // dispenser.characterName = "Luke"; // if the class name is private cannot be used

      System.out.printf("The dispenser is %s %n",
                        dispenser.getCharacterName()
                        );
      if(dispenser.isEmpty()){
        System.out.println("Dispenser is emtpy");
      }

      // String before = dispenser.swapHead("Darth");
      // System.out.printf("it was %s but i switched it to %s %n",
      //                     before, dispenser.getCharacterName()
      // );

      System.out.println("filling the dispenser with PEZ...");
      dispenser.fill();
      if(!dispenser.isEmpty()){
        System.out.println("Dispenser is full");
      }

      while(dispenser.dispense()){
        System.out.println("chomp!");
      }
      if (dispenser.isEmpty()){
        System.out.println("Ate it all");
      }

      dispenser.fill(4);
      dispenser.fill(2);

      while(dispenser.dispense()){
        System.out.println("Chomp!!");
      }


      try {
        dispenser.fill(300);
        System.out.println("boo hooo");
      }catch (IllegalArgumentException iae){
        System.out.println("Wut Wut");
        System.out.printf("Error was %s", iae.getMessage());
      }

    }

}
