public class Executor{
  public static void main(String args[]){
    /*ChildOne childOne = new ChildOne(10, 25, 'f', "vaish", false);
    //Executor exec = new Executor();
    System.out.println(childOne.toString()); // calls by default toString() method of that object reference class
    System.out.println(childOne); // by default calls Object's toString()
    //print an object or reference variable --> The class name it is being referred to and the memory address in Hex format*/

    /*VarshDaughter daughter = new VarshDaughter();
    System.out.println(daughter.loveKid());

    MangaMom mom = new MangaMom();
    System.out.println(mom.loveKid());*/

    /** IS-A relationship - A Subtype is a Supertye but A super type can not be a subtype**/
    MangaMom mom /* reference variable super type */ = new VarshDaughter(); //object
    VarshDaughter daughter = (VarshDaughter)mom; // type casting
    //compile-time check whether this property or method is present in the refernce class
    //System.out.println(daughter.loveKid()); // runtime type of object -- VarshDaughter
    //System.out.println(mom.travellingDetails());
    daughter.travellingDetails();




    //daughter.foodHabbit = "non-veg";
    //daughter.MUSICTASTE = "ROCK"; // this is not possible as it's a final variable
    //System.out.println(daughter.printDaughterState());
    //System.out.println(daughter.isFair + " :: " + daughter.heightDesc);
    //System.out.println(daughter.printPassion());
    //System.out.println(daughter.travellingDetails());
    //System.out.println(daughter.printOnlyMyFeatures() + " :: " + daughter.foodHabbit + " :: " + daughter.MUSICTASTE);
  }
}
