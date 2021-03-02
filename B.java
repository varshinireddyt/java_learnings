public class B extends A {
  String name = "Z" ;
  int i = 20;
  int variableOne = 90;
  public void methodOne() {
    //this.methodTwo();
    System.out.println("Method Two" + super.variable);
  }




  /*public B() {
    this(54 );
  }



  public B(int value) {
    super("OMG");
    System.out.println("constructor 2 :" + value);
  }
   public B(String firstName, String lastName) {
     super.name = firstName + lastName;

     this.name = "ABCCC";

     System.out.println("super " + super.name);
     System.out.println("child "+ this.name);
   }*/
}
