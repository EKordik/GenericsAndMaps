/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author emmakordik
 */
public class EmployeeRecords {
    public static void main(String[] args) {
        Map<String,String> e1 = new HashMap<>();
        e1.put("FirstName", "John");
        e1.put("LastName", "Smith");
        e1.put("EmpID", "25");
        
        Map<String,String> e2= new HashMap<>();
        e2.put("FirstName", "Sally");
        e2.put("LastName", "Jones");
        e2.put("EmpID", "22");
        
        List<Map<String,String>> employees = new ArrayList<>();
        
        employees.add(e1);
        employees.add(e2);
        
        
    }
}
