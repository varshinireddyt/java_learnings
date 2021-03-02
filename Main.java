public class Main{
  //Method overloading
  public char main = 'a';
  /* public String findName(String name) {
    //System.out.println("name : " + name);
    return name;
  }

/* public String findName(String firstName, String lastName) {
    return firstName + lastName;
  }

  public int findName(int age, char gender) {
    return age;
  }

  public char findName(char gender, int age) {
    return gender;
  }*/

  public static String findName(String name) {
    return name;
  }
  public static char findName(char name) {
    return name;
  }



  //Method overriding
  /* public void findId(){
    System.out.println("ID : "); //super class
  } */
 /* Conditions For Method Overloading :
    1. Multiple Methods having same method name but different number of parameters.
    2. Having different data types.
    3. The sequence of the order of parameters.
    NOTE: Return type of the method doesn't consider to be as a method Overloading
    4. Two Method with same name, same parameters, same data types and have different return type will throw an error.
    5. Overloading two methods is not possible if it differ by only static keyword.
    */
    /* public int findName(char gender, int age) {
      //System.out.println(gender + age);
      return age;
    } */

  public static void main(String[] args) {
    Main obj = new Main();
    //obj.findName("micky");
    //System.out.println("Age : " + obj.findName(24));
    //obj.findName("mike");
    System.out.println(Main.findName('a'));


  }

}
