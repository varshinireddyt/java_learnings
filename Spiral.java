import java.util.Arrays;
public class Spiral {

    private static int[][] a = new int[8][8];
  //  int n = 4;
    //int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

   public static void main(String[] args) {
     int value = 1;
    for(int row = 0; row < a.length; row++){
      if(row % 2 == 0){
        for(int column = 0; column < a[row].length; column++) {
          a[row][column] = value;
          value += 1;
        }
      }
      else {
        //[1 2 3 4 5]
        for(int col= a[row].length - 1; col >= 0; col-- ) {
          a[row][col] = value;
          value += 1;

        }
      }

      System.out.println(Arrays.toString(a[row]));
      //break;
    }


  }
}
/* 1 2 3 4     0
 8 7 6 5     1
 9 10 11 12  2
 16 15 14 13 3*/
