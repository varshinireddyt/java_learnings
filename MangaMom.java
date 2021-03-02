/* Method overriding:
  Rule 1: Alwyas happen in super class sub class relationship i.e. between two classes
  Rule 2: private members cannot be inherited
  Rule 3: final class cannot be exetended itself
  Rule 4: public, private, protected and fault --- access specifier
  Rule 5: static, final -- access modifiers
  Rule 6: final method cannot be overidden

*/

public class MangaMom{
  private String hair = "curly"; // not accessible from child class
  private boolean isHavingSpec = true;
  public boolean isFair = true;
  public String heightDesc = "tall";
  public String foodHabbit = "veg";
  public final String MUSICTASTE = "classical"; // no one can change the value of this property



  public String printPassion(){
    System.out.println("I love drawing");
    return "Nature :: Wlldlife";
  }

  /*public char loveKid(){
    System.out.println("I love daughter");
    return 'f';
  }*/

  /*static String travellingDetails(){ // not accessible
    System.out.println("I am vivid traveller");
    return "mountain :: seabeach";
  }*/


  //parametrized Constructor - initilize the state of your mom


}
