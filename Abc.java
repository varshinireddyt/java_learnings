public class Abc {
/*  public Abc() { //Default Constructor
    System.out.println("Abc Class");
  }
  public  Abc(String s){  //Parameterized Constructor
    System.out.println(s);
  }*/

  public boolean testStringComparsion() {
    String str1 = "-abc123";
    String str2 = "abc123#";
    char[] character = str1.toCharArray();
    for(int i=0; i<str1.length(); i++) {
      if(str1.charAt(i) != str2.charAt(i)) {
        return false;
      }
    }
    return true;
  }

  public void returnSpecialCharacters() {
    String specialCharacters = "-@#$%^&";
    String stringOne = "Hi@#jk";
    boolean isFound = false;
    for(int i = 0; i < stringOne.length(); i++) {
      for(int j = 0;  j < specialCharacters.length(); j++) {
        if(stringOne.charAt(i) == specialCharacters.charAt(j)) {
          System.out.println(stringOne.charAt(i));
          isFound = true;
        }

      }
    }
    if(isFound = false) {
    System.out.println("No Special Characters found");
    }
  }
}
