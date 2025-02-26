package com.muraterkilic.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private Long EmpId;
    private String firstName;
    private DepartmentDto department;
}
