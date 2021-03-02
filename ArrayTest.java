public class ArrayTest {
 public static void main(String[] args) {
  /*  int[][] a = new int[2][2];
    for(int i=0;i < a.length; i++){
      for(int j=0; j < a.length; j++){
        System.out.println(a[i][j] + );
      }
      System.out.println( );
    }
  }
}*/
//1 2 3    (0,0)  (0,1)  (0,2)
//4 5 6    (1,0)  (1,1)  (1,2)
//7 8 9    (2,0)  (2,1)  (2,2)
//int a[][] = {{1,2,3}};
int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
for(int i=0; i<a.length; i++){
  for(int j=0; j< a[i].length; j++){
    System.out.print(a[i][j]+ " ");
  }
  System.out.println();
 }
 System.out.println("size : " + a.length);
}
}
