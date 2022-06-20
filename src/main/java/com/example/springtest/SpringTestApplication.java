package com.example.springtest;

import com.example.springtest.dto.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringTestApplication {

private static EmployeeMapperImpl employeeMapper = new EmployeeMapperImpl();

    public static void main(String[] args) {

        SpringApplication.run(SpringTestApplication.class, args);
        Employee emp = new Employee(12 , "kia" , "shamaei");
        Employee emp1 = new Employee(12 , "kia1" , "shamaei");

        Employee emp2 = new Employee(12 , "kia2" , "shamaei");

        Employee emp3 = new Employee(12 , "kia3" , "shamaei");

        Employee emp4 = new Employee(12 , "kia4" , "shamaei");
        List<Employee> list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        TestEx testEx = new TestEx(12 , 8);
        TestExDto testExDto = employeeMapper.toTestDto(testEx);




        EmployeeDto employeeDto = employeeMapper.toDto(emp);
        EmployeeListDto employeeListDto = employeeMapper.toDtoList(list , "5" , "12","10");
        System.out.println(employeeDto.getFullName());
        System.out.println(employeeListDto.getEmployeeList().toString());
        System.out.println(testExDto.getFullNumber());



    }

}
