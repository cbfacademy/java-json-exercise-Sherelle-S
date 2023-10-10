package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.cbfacademy.Employee.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JSONFileHandler {
    // String EmployeeURL = "src/main/java/com/cbfacademy/Employee/Employee.java";
    // private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static List<Employee> readFile(String EmployeeURL){

        Gson gson = new Gson();// new instance of gson
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(EmployeeURL))) {
            String inputLine;
        while((inputLine = bf.readLine()) != null){
            System.out.println(inputLine);
        // employeeList.add(inputLine);
        Type employeeType = new TypeToken<Employee>() {}.getType();
        Employee employee = gson.fromJson(inputLine, employeeType);
        employees.add(employee);
        }
        // TypeToken<List<Employee>> collectionType = new TypeToken<List<Employee>>(){};
        // Collection<Employee> employ = gson.fromJson(inputLine, collectionType);
        // }
            //read the content from the file, capture to variable
        } catch (IOException e) {
            System.out.println("An error occured while reading your file");
            e.printStackTrace();
        }
        return employees;
        
    }
        
    public static void save(Employee employee, String outputFile){
        List<String> previousData = readFile(outputFile);
        try (BufferedWriter bw = new BufferedWriter(new FileReader(outputFile))) {
            if(previousData != null){
                previousData.forEach(line -> {
                    try {
                        bw.write(line);
                        bw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                        // TODO: handle exception
                    }
                });
            }
            Gson gson = new Gson();
            System.out.println("Buffered writer has started to write.");
            String employeeJson = gson.toJson(employeeJson);
            bw.write(employeeJson);
        } catch (IOException e) {
            System.out.println("a problem occured while trying to write your file.");
            e.printStackTrace();
        }
    }
}
            // then do type token.
            // then fromjson method 




//         List<Employees> ints = Arrays.asList{} //we are working with a list of employees

//         String json = gson.toJson(Employee);//to serialise
//     // Gson gson = new GsonBuilder().setPrettyPrinting().create();

   

//     // provide it with json string and the type we want it to convert to
//     List<Employee> employees = new ArrayList<>();
//     Type employeeListType = new TypeToken<List<Employee>>(){}.getType();

//     try (Reader reader = new FileReader(EmployeeURL)) {
//         employees = gson.fromJson(reader, employeeListType);
//     } catch (IOException e) {
//         e.printStackTrace();
//         // TODO: handle exception
//     }

//     return employees;
// }
//     String json = gson.toJson(EmployeeURL);
//     System.out.println(json);
//     // Type Type = new TypeToken<List<Employee>>(){}.getType();
//     return null;

//     // List<Employee> employees = gson.fromJson(EmployeeURL, getClass());
//     }

// //     // TypeToken<Collection<Integer>> collectionType = new TypeToken<Collection<Integer>>(){};
// // // now we read the file 
// // //Read json file
// //     String EmployeeURL = "src/main/java/com/cbfacademy/Employee/Employee.java";
// //    public static List<String> readFile(String EmployeeURL){
// //     List<String>employeeList = new ArrayList<>();
// //     try (BufferedReader bf = new BufferedReader(new FileReader(EmployeeURL))) {
// //         String inputLine;
// //         while((inputLine = bf.readLine()) != null){
// //             System.out.println(inputLine);
// //             employeeList.add(inputLine);
// //         }
// //     } catch (Exception e) {
// //         // TODO: handle exception
// //     }
// //     return employeeList;
// // }

// // public static void save(Employee employee, String outputFile){
// //     try (FileWriter fileWriter = new FileWriter(outputFile)) {
// //         employeeList
//     } catch (Exception e) {
//         // TODO: handle exception
//     } 
// }
   
// //     return List<Employee>;
// //    }

// //    Collection<Integer> ints2 = gson.fromJson(json, collectionType);

// //    //write to json file
// //    Collection<Integer> ints2 = gson.fromJson(json, collectionType);
// // //    The save method should:

// // // save the given employee to the path defined by outputFile.
// // // create outputFile if it doesn't exist and update the file to include the new object, if it does.
// //    }