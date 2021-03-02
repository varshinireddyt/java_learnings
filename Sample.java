//This Class is created to practice several programs.
public class Sample {
  public void palindrome(String stringOne){
    //String stringOne = "java";
    String s = "";
  //  System.out.println(s.length());
    for(int i = stringOne.length()-1 ; i >= 0;i--){
      s = s + stringOne.charAt(i);
    //  s.charAt(i) = s.charAt(s.length() - 1);
    //  s.charAt(s.length()-1) = s.charAt(i);
    }
    System.out.println(s);
  }
  /*
  The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
   We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
   */
  public boolean sleepIn(boolean weekDay, boolean vacation) {
    if(weekDay == true && vacation == false){
      return false;
    }
    else
      return true;
  }
  /*
  Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
  */
  public boolean nearHundred(int n) {
    if(Math.abs(n)<=100) {
      return true;
    }
    else
      return false;
  }

  public String missingChar(String str, int n) {
    return str.substring(0,n) + str.substring(n+1);
  }

  public String backAround(String str) {
    String last = str.substring(str.length()-1);
    return last + str + last;
  }

  public 
}
