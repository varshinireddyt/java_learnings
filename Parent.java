public class Parent {
  int VariableOne = 79;
  int VariableTwo = 68;
  public void doAddition(int x, int y) {
    System.out.println(x+y);
  }

  public int dosubstraction (int x, int y) {
    return x-y;

  }
  public Parent(){

  }
  public Parent(int a, int b) {
    this.VariableOne = a;
    this.VariableTwo = b;
  }
}
