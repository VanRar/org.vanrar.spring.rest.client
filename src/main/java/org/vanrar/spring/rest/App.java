package org.vanrar.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.vanrar.spring.rest.configuration.MyConfig;
import org.vanrar.spring.rest.entity.Employee;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empByAd = communication.getEmployee(9);
//        System.out.println(empByAd);

//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
//        emp.setId(13);
//
//        communication.saveEmployee(emp);

        communication.deleteEmployee(13);




    }
}
