public class Rectangle extends Shape {
  //all the public properties and behaviours

  /*public Rectangle(){
    //super()
    super("rectangle"); //super class default constructor
  }*/
  //this() current class default or parameterize constructor based on the supplied parameters
  private double length = 0.0d;

  /*public Rectangle(double width, String color, double length){
    //super(45.56, "yellow", false, "Rectangle");
    this.width = width;
    this.color = color;
    this.length = length;
  }*/

  public Rectangle(double length, double width, String color, String name){
    super(width, color, false, name);
    this.length = length;
  }

  public double areaOfShape(){
    return this.length * this.width;
  }

}
