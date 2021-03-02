public class Test{ //main class Test.main()
  int value1;
  int value2;
  String name = "micky";
  private static int objectCount = 0; // global variabl if I modify the access specifier to public or protected
  Test(int a){
    value1 = a;
    System.out.println("result 1");
    objectCount++;
  }
  Test(int a, int b){
    value1 = a;
    value2 = b;
    System.out.println("result 2");
    objectCount++;
  }

  //Static methods can access only static variables
  // non-static method can access both static and non-static variables

  protected static void check(){ // static or class method [all the objects sare the same copy]
    System.out.println("Common for all the objects: " + objectCount);

    //System.out.println("Common for all the objects: " + value1);
  }
  public void display(){ // object has their individual copy .... non-static or instance method
    System.out.println("value 1 :  " + value1);
    System.out.println("value2 : "+ value2);
    System.out.println("Common for all the objects: " + objectCount);
    name = "mimi";
    System.out.println("What is your name: " + name);

  }

  private void changeName(){
    System.out.println("Print the name again: " + name);
    String name = "titu";
     int age = 30;
    System.out.println("Please name: " + name + " :: " + age);
  }
private int printAge(){
  System.out.println("Please name: " + name );//" :: " + age);
  return 123;
}


  public static void main (String args[]) {
    Test t1 = new Test(30);
    Test t2 = new Test(30, 40);
    Test.check();

    //t1.display();
    t2.display();
    t2.changeName();
    System.out.println("Return from printAge method: " + t2.printAge());
    int age = t2.printAge();
  }
}
