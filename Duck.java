public class Duck{
  public int pounds = 6;
  public String name = "mike";
  public boolean canFly = true;
  public float maxSpeed = 25;
  public float floatability = 2.4f;
  /*public Duck(){
    this(5);
    System.out.println("Type 1 Duck ");

  }
  public Duck(int p){
    //this(false);
    this(28.9f, 4.5f, p);
    this.pounds = p;
    System.out.println("Type 2 Duck weights: " + p);
    //this(28.9f, 4.5f, p);
  }
  public Duck(boolean fly){
    //this.canFly = fly;
    //this(28.9f, 4.5f, p);
      if(fly == true){
        System.out.println("Type 4 Duck can Fly");
      }
      else{
        System.out.println("Type 5 Duck cannot fly");
      }
  }
  public Duck(float s, float f, int a ){
    this(true);
    this.maxSpeed = s;
    this.floatability = f;
    System.out.println("Type 3 Duck speed: "+ s + " floatability: " + f );
  }*/
  public Duck(int pounds,String name,float s,float f,boolean fly){
    pounds = pounds;
    name = name;
    canFly = fly;
    maxSpeed = s;
    floatability = f;
    System.out.println(pounds + name + canFly + maxSpeed + floatability);
  }
}
