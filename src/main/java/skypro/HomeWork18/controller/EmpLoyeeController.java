package skypro.HomeWork18.controller;

import org.springframework.web.bind.annotation.*;
import skypro.HomeWork18.dto.Employee;
import skypro.HomeWork18.service.EmployeeService;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmpLoyeeController {
    private EmployeeService employeeService;

    public EmpLoyeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.removeEmployee(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.findEmployee(firstName, lastName);
    }


}
