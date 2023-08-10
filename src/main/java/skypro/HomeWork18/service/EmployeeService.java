package skypro.HomeWork18.service;

import skypro.HomeWork18.dto.Employee;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName);

    Employee removeEmployee(String firstName, String lastName);

    Employee getEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);
}
