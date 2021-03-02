public class Driver{
  public static void main(String[] args) {
    /*Utility utilities = new Utility();
    // reversing a string
    String reversedStr = utilities.createReverse("Sun rises in East");
    // expecting - tsae ni sesir nus
    System.out.println("revered string:" + reversedStr);

  // expected output: 323800317
    long reversedNumber = utilities.createReverse(9713008323l);
    // expecting - tsae ni sesir nus
    System.out.println("revered number:" + reversedNumber);

    String appendedString = utilities.insert("rises in the east", "sun ");
    System.out.println("appendedString" + appendedString);*/
    Utility utilities = new Utility();
    //utilities.doRecursive(0);
    //System.out.println("Name starts with vowel ? " + utilities.isVowel("Adavalli"));
    //System.out.println("Srikanth is leagal to drink? " + utilities.isLegalToDrink(24,true));
    System.out.println("Number of Consonants :  " + utilities.isConsonantFor("Sun rises in the east") );
    utilities = null;
  }
}
