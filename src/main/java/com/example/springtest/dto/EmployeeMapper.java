package com.example.springtest.dto;



import com.example.springtest.utils.HelperFunction;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeeMapper {
//    EmployeeMapper INSTANCE = Mappers.getMapper( EmployeeMapper.class );
    @Mapping(target = "fullName",source ="emp" , qualifiedByName = "fullNameByFirstAndLastName")
//@Mapping(target = "lastname",source ="lastName")
//@Mapping(target = "firstname",source ="firstName")
    EmployeeDto toDto (Employee emp);




@InheritInverseConfiguration(name = "toDto")
    Employee fromDto(EmployeeDto dto);
@Named("fullNameByFirstAndLastName")
default  String fullNameByFirstAndLastName(Employee emp){
    return emp.getFirstName() + ' ' + emp.getLastName();
}
@Mapping(target = "employeeList" , source = "employeeList")
EmployeeListDto toDtoList ( List<Employee> employeeList , String page , String pageSize , String total);
@Mapping(target ="fullNumber" , expression ="java(com.example.springtest.utils.HelperFunction.sumState(testEx.getState() , testEx.getNumber()))")
    TestExDto toTestDto (TestEx testEx);

}
