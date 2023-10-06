package com.cbfacademy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.cbfacademy.Employee.Employee;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JSONFileHandler {
    Gson gson = new Gson();

    // TypeToken<Collection<Integer>> collectionType = new TypeToken<Collection<Integer>>(){};
// now we read the file 
//Read json file
    String EmployeeURL = "src/main/java/com/cbfacademy/Employee/Employee.java";
   public static List<String> readFile(String EmployeeURL){
    List<String>employeeList = new ArrayList<>();
    try (BufferedReader bf = new BufferedReader(new FileReader(EmployeeURL))) {
        String inputLine;
        while((inputLine = bf.readLine()) != null){
            System.out.println(inputLine);
            employeeList.add(inputLine);
        }
    } catch (Exception e) {
        // TODO: handle exception
    }
    return employeeList;
}

public static void save(Employee employee, String outputFile){
    
}
   
//     return List<Employee>;
//    }

//    Collection<Integer> ints2 = gson.fromJson(json, collectionType);

//    //write to json file
//    Collection<Integer> ints2 = gson.fromJson(json, collectionType);
// //    The save method should:

// // save the given employee to the path defined by outputFile.
// // create outputFile if it doesn't exist and update the file to include the new object, if it does.
   }
   public static void main(String[] args) {
    readFile("src/main/java/com/cbfacademy/Employee/Employee.java");
   }
}