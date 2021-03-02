package edu.vaishnavi.java.executor.oracledatabase;
import edu.vaishnavi.java.executor.mysqldatabase;

public class DatabaseChild extends edu.vaishnavi.java.executor.mysqldatabase.DatabaseSuper {

  protected void getDatabase() {
    super.getDatabase();
    System.out.println("Child Data");
  }

}
