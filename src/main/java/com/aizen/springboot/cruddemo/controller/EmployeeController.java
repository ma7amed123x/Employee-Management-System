package com.aizen.springboot.cruddemo.controller;

import com.aizen.springboot.cruddemo.entity.Employee;
import com.aizen.springboot.cruddemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmployeeController {
    EmployeeService employeeService;
    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }
    @GetMapping("/")
    public String showHome() {
        return "redirect:/employees";
    }
    @GetMapping("/employees")
    public String listEmployees(Model theModel) {
        List<Employee> employees = employeeService.findAll();
        theModel.addAttribute("employees", employees);
        return "list-employees";
    }
    @GetMapping("/employees/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        theModel.addAttribute("employee", new Employee());
        return "employee-form";
    }
    @PostMapping("/employees/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
        employeeService.save(theEmployee);
        return "redirect:/employees";
    }
    @GetMapping("/employees/showFormForUpdate")
    public String showFormForUpdate(Model theModel,@RequestParam("employeeId") int theId) {
        Employee theEmployee = employeeService.findById(theId);
        theModel.addAttribute("employee", theEmployee);
        return "employee-form";
    }
    @GetMapping("/employees/delete")
    public String deleteEmployee(@RequestParam("employeeId") int theId) {
        employeeService.deleteById(theId);
        return "redirect:/employees";
    }


}
