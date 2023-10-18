package com.cbfacademy;

import com.cbfacademy.FileHandler.FilenameException;

public class App {
    public static void main(String[] args) {
      // src\main\resources\example.json
      String employeeURL = "src/main/java/com/cbfacademy/Employee/Employee.java";
    // private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    JSONFileHandler fileHandler = new JSONFileHandler();
    try {
      JSONFileHandler.readFile(employeeURL);
    } catch (FilenameException e) {
      System.out.println("Input file is not JSON and cannot be read");
      e.printStackTrace();
    }
    
    // try {
    //   fileHandler.readFile(employeeURL);
    // } catch (FilenameException e) {
      
    //   e.printStackTrace();
    // }
    }
}
