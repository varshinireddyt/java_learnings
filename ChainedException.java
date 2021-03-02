public class ChainedException {
  public static void main(String[] args) {
    try
    {
      // NumberFormatException e = new NumberFormatException("Exception");
      // e.initCause(new  NullPointerException("Caution of Exception"));
      // throw ex;
      int a[]=new int[7];
      a[4] = 30/0;
      System.out.println("you shouldn't divide a number by zero");
    }
    catch(NumberFormatException ex)
    {
      System.out.println("NumberFormatException -1");
    }
    catch(ArithmeticException ex)
    {
      System.out.println("ArithmeticException -2");
    }
    catch(Exception ex)
    {
      System.out.println("some other Exception");
    }
    catch(ArrayIndexOutOfBoundsException ex){
      System.out.println("ArrayIndexOutOfBoundsException - 4");
    }
  }
}
