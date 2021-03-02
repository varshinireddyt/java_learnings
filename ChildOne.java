/* Method Overloading and Overriding
Method overloading rules:
  1. overloading can happen in the same class or super-sub Class
  2. non-static method cannot overload static method and vice versa
  3. static method overloading is possible provided both the methods have static keyword
  4. return type will not be considered as method signature [number, type and order]
  5. compile time binding or polymorphism*/

public class ChildOne extends Object{
  private int one = 0;
  private int two = 0;
  private char three = '\u0000';
  private String four = null;
  private boolean five = false;

  public ChildOne(){
    this.five = true;
  }

  public ChildOne(int one, int two, char three, String four, boolean five){
    this(three, four, five); // this and super has to be the first ststaement in the constructor
    this.one = one; // avoiding shadowing
    this.two = two;

    //this(); // constructor chaining default or another paramterized constructor
  }

  public ChildOne(char three, String four, boolean five){
    this();
    this.three = three;
    this.four = four;
  }

  public String toString(){ // when you try to print the object -- this will override Object class toStirng()
    return "Object states are: " + one + " :: " + two + " :: " + three + " :: " + four + " :: " + five;
  }

  public int doAddition(int x, int y) { //parametrized constructor
    return doOperation(x, y, "add");
  }

  public int doSubstraction (int x, int y) { //wrapper methods
    return doOperation(x, y, "subtract");
  }

  private int doOperation(int num1, int num2, String type){
    if (type.equals("add"))
      return num1+num2;
    else
      return num1-num2;
  }
}
