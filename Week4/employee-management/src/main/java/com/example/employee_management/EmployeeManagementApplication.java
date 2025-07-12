package com.example.employee_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring/employee.xml")
public class EmployeeManagementApplication {
	    public static void main(String[] args) {
	        SpringApplication.run(EmployeeManagementApplication.class, args);
	    }

}

