public class Constructor{
 //javac <classname.java)
 //public Constructor(){}
  int a = 9;
 {
   int b = 30;
   System.out.println("instance block" + b);
 }
 static {
   System.out.println("static block");
 }

 public Constructor(){
  // this(1,2.0f); //parametraized construtor Construtcor(1,2)
  System.out.println("inside constructor");
  //this.method();
  //a = 20;
 }
 /*public Constructor(int a, int b){
   System.out.println("States initialized");
 }

 public Constructor(int c, float d){

 }*/
 public void methodOne(){
   System.out.println("methodOne");
  // this.method();
 }
 public void method() {
   System.out.println("method");
   //methodOne(this);
   //this.methodOne();
 }

public static void main(String[] args) {
  Constructor obj = new Constructor();
}

}
