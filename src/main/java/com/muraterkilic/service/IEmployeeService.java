package com.muraterkilic.service;

import com.muraterkilic.dto.EmployeeDto;

public interface IEmployeeService {

    public EmployeeDto findEmployeeById(Long id);
}
