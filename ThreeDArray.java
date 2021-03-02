///import java.util.Arrays;
public class ThreeDArray {

  public int[][][] arr = new int[10][20][30];
  {
  arr[0][0][0] = 1;
  arr[0][1][0] = 2;
  }

  public void testString() {
  String s = "java";
//  s=s.concat("programming");
  String stringTwo= "Java";
  if(s.equals(stringTwo)){
    System.out.println("True");
  }
  else
  System.out.println("False");
}
public void testStringTwo() {
  String s = "java";
  String stringOne = "java";
  String stringTwo = new String("java");
  if(s==stringTwo){
    System.out.println("True");
  }
  else
    System.out.println("False");
}
public void testStringConcatenation() {
  String s = "java";
  String sOne = "programming";
  String sTwo = s.concat(sOne);
  System.out.println(sTwo);
}



  //  System.out.println("TwoD Array" + arr[0][0]);

}
