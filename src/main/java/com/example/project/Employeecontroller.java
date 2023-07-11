package com.example.project;






import java.util.List;
import java.util.Optional;
import java.util.ArrayList;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employeecontroller {
	
	
	
	
private List<Employee> emp=new ArrayList<>();
	
	{
		emp.add(new Employee("1","Akshay","Accounting"));
		emp.add(new Employee("2","balu","Accounting"));
	}

	
	@GetMapping("/employee/{id}/{depname}")
	public Optional<Employee> display(@PathVariable String id,@PathVariable String depname)
	{
		return emp.stream().filter( Employee-> Employee.getId().equals(id))
				.filter(Employee -> Employee.getDepname().equals(depname))
				.findFirst();
				
				
			
	}
	

}
