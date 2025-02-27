package com.muraterkilic.controller;

import com.muraterkilic.dto.EmployeeDto;
import com.muraterkilic.model.RootEntity;

public interface RestEmployeeController {

    public RootEntity<EmployeeDto> findEmployeeById(Long id);
}
