package sjsu.cmpe172project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployees() {
		List<Employee> employees = (List<Employee>)employeeRepository.findAll();
		if (employees.size() < 0) {
			return new ArrayList<Employee>();
		}
		return employees;
	}

}
