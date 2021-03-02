public class A {
  public String name = "vsr";
  public String firstName = "kk";
  public String lastName = "lk";
  public static int variable = 89;
  int i = 89;
  public void methodOne() {
    System.out.println("Method one");
  }
  public void methodTwo() {
    //methodOne();
    methodOne(this);
    System.out.println("Method Two" + variable + name);
  }
  public A coVariant() {
    System.out.println("A");
    return this;
  }
  public A(){

  }

  public A(String name) {
    this.name = name;

    System.out.println("printed name" + name);
    // System.out.println("printed name" + this.name);
  }


  public A(String firstName, String lName) {
    this.firstName = "ABC";
    this.lastName = "DEF";
    System.out.println(firstName + this.lastName);
  }

}
