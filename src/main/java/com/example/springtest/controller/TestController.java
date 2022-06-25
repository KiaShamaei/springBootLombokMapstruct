package com.example.springtest.controller;


import com.example.springtest.controller.res.EmployeeResponse;
import com.example.springtest.dto.Employee;
import com.example.springtest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {
    final
    EmployeeService employeeService ;

    public TestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

//    @GetMapping("/test")
//    public ResponseEntity<EmployeeResponse> getEmployeeList(){
//        ResponseEntity<EmployeeResponse> res ;
//        Employee emp1 = new Employee(1,"kiarash" , "shamaii");
//        Employee emp2 = new Employee(1,"korosh" , "shamaii1");
//
//        Employee emp3 = new Employee(1,"kiabale" , "shamaii3");
//
//        Employee emp4 = new Employee(1,"kiaRash" , "shamaii2");
//        List<Employee> empList = new ArrayList<Employee>();
//        empList.add(emp1);
//        empList.add(emp2);
//        empList.add(emp3);
//        empList.add(emp4);
//        EmployeeResponse response = new EmployeeResponse();
//        response.setEmployeeList(empList);
//      return   ResponseEntity.ok(response);
//
//
//
//
//    }
    @GetMapping("/all")
    public  ResponseEntity<EmployeeResponse> getAll(){
       return employeeService.getAllEmployee();

    }
    @PostMapping("/save")
    public void add(@RequestBody Employee employee){
        employeeService.save(employee);
    }
}
