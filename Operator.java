public class Operator{
  private double result = 0.0d;

  public double doOperation(String operationType, double num1, double num2){
    switch(operationType){
      case "Addition" :
        result = num1 + num2;
        break;

      case "Multiplication" :
        result = num1 * num2;
        break;

      case "Division" :
        result = num1 / num2;
        break;

      default :
        System.out.println("OOPS .... No supported operation types found !!!!");

    }
    return result;
  }


  //behaviours
  public void addition (double x, double y) {
    result = x + y;
    //return result;
    System.out.println("Addition is " + result);
  }
  public void subtraction (double x, double y) {
    result = x - y ;
    System.out.println("Substraction is " + result);
    //return result;
  }
  void division (double x, double y) {
    result = x / y ;
    System.out.println("Division is " + result);
  }
  void multiplication(double x, double y){
    result = x * y ;
    System.out.println("multiplication is " + result);
  }
  void percentage(double x, double y) {
    result = x % y ;
    System.out.println("Percentage is " + result);
  }
  void exponention(double x, double y) {
    result = Math.pow(x,y);
    System.out.println("Exponention is " + result);
  }
}
