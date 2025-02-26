package com.muraterkilic.controller;

import com.muraterkilic.dto.EmployeeDto;

public interface RestEmployeeController {

    public EmployeeDto findById(Long id);
}
