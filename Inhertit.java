public class Inhertit{
  public static void main(String args[]){
    //Shape sh = new Shape();
    /*Rectangle r = new Rectangle();
    System.out.println(r.toString());*/
    //System.out.println(sh.areaOfShape());
    //System.out.println(sh.isParent);
    //Rectangle r = new Rectangle(23, "yellow", 45);
    //Rectangle r = new Rectangle(24, 36, "black", "Rectangle");
    Shape r = new Rectangle(24, 36, "black", "rec"); // IS-A A Sub class is a type of Superclass
    System.out.println(r.areaOfShape());
    System.out.println(r.toString());
  }
}
