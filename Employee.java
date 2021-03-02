//public class Employee implements Comparable<Employee>{
public class Employee {
  private int age;
  private String name;
  private long rollNumber;
  private String dateOfBirth;
  public Employee(){}
  public Employee(int age, String name, long rollNumber, String dateOfBirth) {
    this.age = age;
    this.name = name;
    this.rollNumber = rollNumber;
    this.dateOfBirth = dateOfBirth;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public long getRollNumber(){
    return rollNumber;
  }
  public void setRollNumber(long rollNumber) {
    this.rollNumber = rollNumber;
  }
  public String getDateOfBirth(){
    return dateOfBirth;
  }
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  public String toString() {
    return "Employee details are: Age - " + age + " Name - " + name + " Roll Number - " + rollNumber + " Date Of Birth - " + dateOfBirth;
  }
/*  public int compareTo(Employee emp){
    //return this.age - emp.age;
    return emp.age - this.age;
  }
*/
}
