public class Def {
/* public Def() { //Default Constructor
   //super();
    System.out.println("Def Constructor");
  }
  public Def(String s) { //Parameterized Constructor
    //super();
    System.out.println("Def Parameterized constructor: "+ s);
  }*/
  public static void main(String[] args) {
  //  Def object = new Def();
/*    String str = "Knowledge";
  //  String s = str;
  //  str = str.concat("Base");
    String str1 = "Knowledge";
    String str2 = new String("Knowledge");
    System.out.println(str == str1);
    //System.out.println(str);
    System.out.println(str == str2.intern());
    System.out.println(str.equals(str1));
    System.out.println(str1.equals(str2));
  } */
  Abc object = new Abc();
  System.out.println(object.testStringComparsion());
  //object.testStringComparsion();
  object.returnSpecialCharacters();
}
}
