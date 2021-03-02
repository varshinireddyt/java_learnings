public class Circle implements Shapes {

  public void area() {
    int r = 4;
    double a = Math.PI * r * r;
    System.out.println("Area of Circle: " + a);
  }

  public void nameOfTheShape() {
    System.out.println("Round");
  }

  public void color() {
    System.out.println("White");
  }
}
