public class Animal{
  private String name ;
  public int weight;
  public int value = 90;
  public void show(){
    System.out.println("Animal");
  }
  public String getName(){
    return "hi";
  }
  public int getWeight(){
    return weight;
  }
  public Animal(){
    System.out.println("Parent Class");
  }
    /*{
      System.out.println("Instance Intializer block");
    }
  /*public Animal(String name){
    this.name = name;
    System.out.println(name);

  }
  public Animal(int weight){
    this.weight =weight;
    System.out.println(weight);
  }*/
}
