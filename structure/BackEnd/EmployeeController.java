package sjsu.cmpe172project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping
	public String getEmployees(Model model) {
		List<Employee> employees = employeeService.getEmployees();
		model.addAttribute("employees", employees);
		return "home";
	}

}
