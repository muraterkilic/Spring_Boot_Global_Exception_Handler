package com.muraterkilic.service;

import com.muraterkilic.controller.exception.BaseException;
import com.muraterkilic.controller.exception.ErrorMessage;
import com.muraterkilic.controller.exception.MessageType;
import com.muraterkilic.dto.DepartmentDto;
import com.muraterkilic.dto.EmployeeDto;
import com.muraterkilic.model.Department;
import com.muraterkilic.model.Employee;
import com.muraterkilic.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto findById(Long id) {
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
