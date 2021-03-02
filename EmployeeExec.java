import java.util.Arrays;
public class EmployeeExec {
  public static void main(String[] args) {
    //Employee objectOne = new Employee();
    Employee objectOne = new Employee(22, "Mike", 777, "09091997");
    Employee objectTwo = new Employee();
    objectTwo.setAge(4);
    objectTwo.setRollNumber(999);
    objectTwo.setDateOfBirth("09091899");
    objectTwo.setName("Mike");
    System.out.println(objectOne.getAge()); //objectOne.toString()
    System.out.println(objectTwo.getRollNumber());
  //  Employee objectThree = objectOne.clone();
    //int[] a = new int[2];
    Employee[] emp = new Employee[2];
    emp[0] = objectOne;
    emp[1] = objectTwo;

    Arrays.sort(emp);
   System.out.println(Arrays.toString(emp));


  }
}
