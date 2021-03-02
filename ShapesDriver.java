public class ShapesDriver {
  public static void main(String[] args) {
    Shapes obj = new Circle();
    obj.area();
    obj.nameOfTheShape();
    obj.color();
    System.out.println(obj.getClass().getName());
  }
}
