package com.muraterkilic.controller.impl;

import com.muraterkilic.controller.RestEmployeeController;
import com.muraterkilic.dto.EmployeeDto;
import com.muraterkilic.model.RootEntity;
import com.muraterkilic.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("list/{id}")
    @Override
    public RootEntity<EmployeeDto> findEmployeeById(@PathVariable Long id) {
        return ok(employeeService.findEmployeeById(id));
    }
}
