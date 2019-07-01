public class Shadow{
  public int x = 0;
  public float y = 0.0f;
  public String z = null;
  public double i = 0.0d;

  public Shadow(){
  //  this("First Constructor");
  // this(x + y);
  }
  public Shadow(String a){
  //  System.out.println(a);
  //  this(3,5.4f);
    this(a, 3, 5.4f);
  }

  public Shadow(String v, int a, float b){
    this(a, b, 0.007d, v);
  /*  this.x = a;
    this.y = b;
    System.out.println("Second Constructor");*/
  //  this("Third Constructor", 2.24d);
  }
  public Shadow(String a, double b){
    this.z = a;
    this.i = b;
    //this()

  }
  public Shadow(int a, float b, double c, String d){
    this.x = a;
    this.y = b;
    this.z = d;
    this.i = c;
  }
}
