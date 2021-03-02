public class SimpleArraySum {

  static int arraySum(int[] ar){
    int sum = 0;
    // int length = ar.length();
    for(int i = 0; i < ar.length; i++)
    {
      sum = sum + ar[i];
    }
    return sum;
  }
  static long aVeryBigSum(long[] ar){
    long sum = 0;
    for(int i = 0; i < ar.length; i++) {
      sum = sum + ar[i];
    }
    return sum;
  }

  public static void main(String[] args) {

    // SimpleArraySum obj = new SimpleArraySum();
    // int[] s = new int[5];
    int s[]= {1,4,56,34,12};
    // System.out.println(obj.arraySum(s));
    long x[] = {5,1000001,1000002,1000003,1000004,1000005};
    System.out.println(SimpleArraySum.aVeryBigSum(x));
  }
}
