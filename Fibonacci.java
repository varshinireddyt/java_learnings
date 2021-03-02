public class Fibonacci {

  public void testFibonacci(int n)
  {
    int a[] = new int[n];
    a[0] = 0;
    a[1] = 1;
    System.out.print(a[0] + " " + a[1]);
    for(int x = 2; x<n; x++) {
      a[x] = a[x-1] + a[x-2];
      System.out.print(" " + a[x]);
}
  }
  public void doPrime(int n){

    for(int i=2; i*i<=n; i++) {
      int rem = n % i;
      if(rem == 0) {
        System.out.println(n + "is not a prime");
        return;
      }
      System.out.println(n + "is prime");

    }
}

public void doPrimeNumbers(int n) {
  for(int i=2; i<=n; i++) {
    doPrime(i);
  }
}

public void doPalindrome() {

String str = "hio";
String temp = "";
for(int i = str.length()-1; i>= 0; i--) {
  temp = temp + str.charAt(i);
}
if(temp.equals(str)) {
  System.out.println(str + " is a  palindrome");

}
else{
  System.out.println(str + " is not palindrome");
}
}
public void palindrome() {

  String str= "hih";
  for(int i = 0; i < str.length(); i++)
  {
    if(str.charAt(i) != str.charAt(str.length()-1-i)) {
      System.out.println("not a palindrome");
      return;
    }
  }
      System.out.println("palindrome");
}

public void doReverse() {
  String str = "Hi";
  String reverse = "";
  for(int i = str.length() - 1; i >= 0; i--) {
    reverse = reverse + str.charAt(i);

  }
  System.out.println(reverse);
}

public void runLength(String str) {

  int length = str.length();
  for(int i = 0; i < length; i++) {
    int count=1;
    while(i < length-1 && str.charAt(i) == str.charAt(i+1)) {
      count++;
      i++;
    }
    System.out.print(str.charAt(i));
    System.out.print(count);
  }

}

public static void main(String[] args) {

    Fibonacci obj = new Fibonacci();
    // obj.testFibonacci(6);
    // obj.doPrime(6);
    // obj.doPrimeNumbers(20);
    // obj.doPalindrome();
    // obj.palindrome();
    obj.doReverse();
    obj.runLength("aaabbaaccdaa");
  }
}
