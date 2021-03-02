public class VarshDaughter extends MangaMom{
  /*public String printDaughterState(){
    return "VarshDaughter object states are : " + hair + " :: " + isHavingSpec +
      " :: " + isFair + " :: " + heightDesc + " :: " + foodHabbit + " :: " + musicTaste;
  }*/
  public String printOnlyMyFeatures(){
    isFair = false; //overridding the property
    heightDesc = "moderate";
    //foodHabbit = "non-veg";
    return isFair + " :: " + heightDesc;
  }

  public char loveKid(){ // method overridding if not final
    System.out.println("No mom, I love son not daughter");
    return 'm';
  }

  public String travellingDetails() {
    super.printPassion();
    System.out.println("I am not a traveller");
    return "mountain :: seabeach";
  }
/*  public String printPassion(){
    System.out.println(" drawing");
    super.printPassion();
    return "Nature :: Wlldlife";
  }*/
}
