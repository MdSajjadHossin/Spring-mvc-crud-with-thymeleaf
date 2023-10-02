package com.shossin.springboot.thymeleafdemo.controller;

import com.shossin.springboot.thymeleafdemo.entity.Employee;
import com.shossin.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService theEmployeeService){
		employeeService = theEmployeeService;
	}


	// add mapping for "/list"
	@GetMapping("/list")
	public String listEmployees(Model theModel) {

		// get the employee from db
		List<Employee> theEmployees = employeeService.findAll();


		// add to the spring model
		theModel.addAttribute("employees", theEmployees);

		return "employees/list-employees";
	}

	@GetMapping("/addForm")
	public String addForm(Model theModel){

		//Create Model attribute to bond form data
		Employee theEmployee = new Employee();

		theModel.addAttribute("employee", theEmployee);

		return "employees/employeeForm";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){

		// save the employee
		employeeService.save(theEmployee);

		// use a redirect to prevent duplicate submission
		return "redirect:/employees/list";
	}

	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("employeeId") int theId, Model theModel){

		// get the employee form the service
		Employee theEmployee = employeeService.findById(theId);

		// set employee in the model to prepopulate the form
		theModel.addAttribute("employee", theEmployee);

		// send over to our form
		return "employees/employeeForm";

	}

	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId){

		// delete the employee
		employeeService.deleteById(theId);

		// redirect to the /employees/list
		return "redirect:/employees/list";
	}
}




