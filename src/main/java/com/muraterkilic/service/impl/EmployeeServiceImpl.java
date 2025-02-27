package com.muraterkilic.service.impl;

import com.muraterkilic.exception.BaseException;
import com.muraterkilic.exception.ErrorMessage;
import com.muraterkilic.exception.MessageType;
import com.muraterkilic.dto.DepartmentDto;
import com.muraterkilic.dto.EmployeeDto;
import com.muraterkilic.model.Department;
import com.muraterkilic.model.Employee;
import com.muraterkilic.repository.EmployeeRepository;
import com.muraterkilic.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto findEmployeeById(Long id) {
        EmployeeDto employeeDto = new EmployeeDto();
        DepartmentDto departmentDto = new DepartmentDto();

        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isEmpty()) {
            throw new BaseException(new ErrorMessage(MessageType.NOT_RECORD_EXIST, id.toString()));
        }

        Employee employee = optional.get();
        Department department = employee.getDepartment();

        BeanUtils.copyProperties(employee,employeeDto);
        BeanUtils.copyProperties(department,departmentDto);

        employeeDto.setDepartment(departmentDto);
        return employeeDto;
    }
}
