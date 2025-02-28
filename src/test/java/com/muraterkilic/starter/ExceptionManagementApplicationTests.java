package com.muraterkilic.starter;

import com.muraterkilic.dto.EmployeeDto;
import com.muraterkilic.service.IEmployeeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;


	@BeforeEach
	public void beforeEach() {
		System.out.println("before each çalıltı");
	}

	@Test
	public void testFindEmployeeById() {
		EmployeeDto employeeDto = employeeService.findEmployeeById(1L);
		if (employeeDto != null){
			System.out.println("isim : " + employeeDto.getName());
		}
	}

	@AfterEach
	public void afterEach() {
		System.out.println("after each çalıltı");
	}
}
