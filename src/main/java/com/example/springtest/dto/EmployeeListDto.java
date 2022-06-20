package com.example.springtest.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class EmployeeListDto {
    private  String pageSize ;
    private String page;
    private String total ;
    private List<Employee> employeeList;
}
