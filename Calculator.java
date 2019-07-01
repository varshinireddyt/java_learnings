public class Calculator{
  public static void main(String[] args) {
    Operator calc = new Operator();
    // Datatypes implicit and explicit conversion
    /*calc.addition(5.0, 7.0);
    calc.multiplication(45.0, 98.0);
    calc.percentage(58.9, 8.0);
    calc.division(93.0, 3.1);
    calc.subtraction(78.4, 99.5);
    calc.exponention(2.0, 6.0);*/
    System.out.println("Result is : " + calc.doOperation("Addition", 5, 7));
    System.out.println("Result is : " + calc.doOperation("Multiplication", 45.29, 98.37));
    System.out.println("Result is : " + calc.doOperation("Division", 58.9876, 13));
  }
}
