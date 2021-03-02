import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CompareTriplets {

  static List<Integer> triplets(List<Integer> a,List<Integer> b) {
    // List<Integer> a = new ArrayList<Integer>();
    // a.add(1);
    // a.add(2);
    // a.add(5);
    // List<Integer> b = new ArrayList<Integer>();
    // b.add(2);
    int alice = 0;
    int bob = 0;
    List<Integer> result = new ArrayList<Integer>();
    System.out.println("Size: "+a.size());
    for(int i = 0; i < a.size(); i++) {
      if(a.get(i) > b.get(i)) {
      alice =  alice + 1;
      System.out.println("a value:" + alice);
      }
      else if(a.get(i) < b.get(i)) {
      bob = bob + 1;
      System.out.println("b value:" + bob);
      }
    }

    result.add(alice);
    result.add(bob);
    return result;
  }

  public static void main(String[] args) {
    // CompareTriplets obj = new CompareTriplets();
    List<Integer> one = new ArrayList<Integer>();
    one.add(2);
    one.add(3);
    // alice.add(4);
    List<Integer> two = new ArrayList<Integer>();
    two.add(3);
    two.add(8);


  System.out.println( CompareTriplets.triplets(one,two));
  }
}
