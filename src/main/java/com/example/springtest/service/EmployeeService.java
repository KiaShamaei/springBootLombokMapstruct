package com.example.springtest.service;


import com.example.springtest.controller.res.EmployeeResponse;
import com.example.springtest.dto.Employee;
import com.example.springtest.dto.EmployeeMapperImpl;
import com.example.springtest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private static EmployeeMapperImpl employeeMapper = new EmployeeMapperImpl();
    @Autowired
 private EmployeeRepository employeeRepository;
    public ResponseEntity<EmployeeResponse> getAllEmployee(){
        List<Employee> list = employeeRepository.findAll();
        EmployeeResponse employeeResponse = new EmployeeResponse();
        var listDto = employeeMapper.toDtoList(list , "0" ,"10" , "15" );
         employeeResponse.setEmployeeList(listDto);
        return ResponseEntity.ok(employeeResponse);

    }
    public void save(Employee employee){
        employeeRepository.save(employee);
    }
}
