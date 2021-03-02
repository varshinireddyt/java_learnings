public class Triangle implements Shapes {
   public void area(){
     int breadth = 4;
     int height = 8;
     int a = (breadth * height)/2;
     System.out.println("Area of Triangle: "+a);
   }

   public void nameOfTheShape() {
     System.out.println("Triangle");
   }

   public void color(){
     System.out.println("Black");
   }
}
