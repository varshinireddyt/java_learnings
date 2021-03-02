public class Shape{ //square ... Base | Parent class or Super class

  /*
    non-static or instance properties */
  public double width = 0;
  public String color = "Blue";
  private boolean isParent = false;
  private String name = null;

  public Shape(){
    this.name = "Square";
    this.isParent = true;
  }

  public Shape(String name){
    this.name = name;
  }

  public Shape(double width, String color, boolean isParent, String name){
    this(name);
    this.width = width;
    this.color = color;
    this.isParent = isParent;
  }

  public double areaOfShape(){
    return Math.pow(this.width,2);
  }
  private String typeOfShape(){
    if (this.name == null)
      return "Square".toLowerCase();
    else
      return this.name.toLowerCase();
  }

  public String toString(){
    return (this.name + " details are : Width: " + this.width + " Color: " + this.color +
      " Type: " + typeOfShape() + " Parent: " + this.isParent + " Area: " + areaOfShape());
  }
}
