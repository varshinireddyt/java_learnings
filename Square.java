public class Square implements Shapes {

  public void area(){
    int s = 5;
    int a = s * s;
    System.out.println("Area of Square: "+ a);
  }

  public void nameOfTheShape(){
    System.out.println("Square");
  }

  public void color(){
    System.out.println("Red");
  }
}
