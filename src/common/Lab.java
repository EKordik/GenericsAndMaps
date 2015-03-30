/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author emmakordik
 */
public class Lab {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Smith", "John", "111-11-1111");
        Employee employee2 = new Employee(2, "Doe", "Jane", "222-22-2222");
        Employee employee3 = new Employee (1, "Someone", "Mark", "111-11-1111");
        Employee employee4 = new Employee(3, "Jones", "Sue", "333-33-3333");
        
        Map<String, Employee> employees = new HashMap<>();
        
        employees.put("Emp1", employee1);
        employees.put("Emp2", employee2);
        employees.put("Emp3", employee3);
        employees.put("Emp4", employee4);
        
        
       
        //Option One for iterating through
        System.out.println("\nOption One:");
        Set keys = employees.keySet();
        for(Object key: keys){
            System.out.println(employees.get(key));
        }
        
        //Option Two for iterating through
        System.out.println("\nOption Two:");
        Collection values = employees.values();
        for(Object emp: values){
            System.out.println((Employee)emp);
        }
        
        //Looping through the keys
        System.out.println("\nKeys");
        Collection keyList = keys;
        for(Object emp2: keyList){
            System.out.println(emp2);
        }
        
        System.out.println("\nTreeMaps");
        //Tree Map
        Map<String,Employee> employees2 = new TreeMap<>();
        employees2.putAll(employees);
        
        //Iterationg through sorting automatically
        System.out.println("Sorted TreeMap:");
        Set keys2 = employees2.keySet();
        for(Object key: keys2){
            System.out.println(key);
            System.out.println(employees2.get(key));
        }
        
        //Sorted by SSN
        System.out.println("\nSorted by SSN");
        Collection employeesCol = employees2.values();
        List<Employee> sortedList = new ArrayList<>(employeesCol);
        
        Collections.sort(sortedList, new EmployeeBySsn());
        for(Employee emp: sortedList){
            System.out.println(emp);
        }
        
        //TreeSet
        System.out.println("\nTree Set Stuff");
        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(employee4);
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        
        for(Employee emp: employeeSet){
            System.out.println(emp);
        }
         
        System.out.println("\nTree Set Sorted By Last Name");
        Collection empCol = employees2.values();
        List<Employee> sortedList2 = new ArrayList<>(empCol);
        
        Collections.sort(sortedList2, new EmployeeByLastName());
        for(Employee emp: sortedList2){
            System.out.println(emp);
        }
                
    }
}
