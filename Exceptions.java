public class Exceptions {

  private static int divisionByZero (int numOne,int numTwo) {
    int result = numOne / numTwo;
    return result;
  }
  private static void arrayException(int[] ar) {
    int value = 2;
    for(int i =0;i < 5; i++) {
      ar[i] = value++;
    }
    System.out.println("Value at index one is "+ ar[0]);
    System.out.println("value "+ar[5]);
  }
  public static void main(String[] args) {
    int a = 1;
    int b = 0;
    try{
      int result = 1/0;
    }
    catch(ArithmeticException e) {
      System.out.println("Infinite");
    }
    System.out.println(Exceptions.divisionByZero(50, 10));
    int[] myArray = new int[5];

    try{
      myArray[6] = 2;
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Increase the size of array");
    }

      Exceptions.arrayException(myArray);
  }
}
