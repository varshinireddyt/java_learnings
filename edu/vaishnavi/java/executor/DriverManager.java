package edu.vaishnavi.java.executor;

import edu.vaishnavi.java.linkedlist.*;
import edu.vaishnavi.java.executor.oracledatabase.DatabaseChild;
import edu.vaishnavi.java.executor.mysqldatabase.DatabaseSuper;

public class DriverManager extends edu.vaishnavi.java.executor.oracledatabase.DatabaseChild {

  public static void main(String args[]){
  /*  System.out.println(Helper.whatToDo());
    Helper help = new Helper();
    help.doSomething();
    LinkedListImpl list = new LinkedListImpl();
    System.out.println(list.getTypeOfDS());
    //private as well as protected
    //superclass and subclass
    //default or package access specifier
    DatabaseImpl data = new DatabaseImpl();
    System.out.println(data.getDBType());*/
//   edu.vaishnavi.java.executor.mysqldatabase.DatabaseSuper database = new DatabaseChild();
  // DatabaseChild database = new DatabaseChild();
  //edu.vaishnavi.java.executor.oracledatabase.DatabaseSuper database = new edu.vaishnavi.java.executor.oracledatabase.DatabaseSuper();
  //  ((DatabaseChild)database).getDatabase();
    edu.vaishnavi.java.executor.oracledatabase.DatabaseChild database = new DriverManager();
    //DriverManager manager = new DriverManager();
    ((DriverManager)database).getDatabase();
  }
}
