package skypro.HomeWork18.service;

import org.springframework.stereotype.Service;
import skypro.HomeWork18.dto.Employee;
import skypro.HomeWork18.exception.EmployeeAlreadyAddedException;
import skypro.HomeWork18.exception.EmployeeNotFoundException;
import skypro.HomeWork18.exception.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employees;
    private static final int EMPLOYEES_SIZE = 3;

    public EmployeeServiceImpl() {
        this.employees = new ArrayList<>();
    }
@Override
    public Employee addEmployee(String firstName, String lastName) {
        if (employees.size() == EMPLOYEES_SIZE) {
            throw new EmployeeStorageIsFullException();
        }


        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        employees.add(employee);
        return employee;
    }
@Override
    public Employee removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.remove(employee)){
            throw new EmployeeNotFoundException();
        }
        return employee;
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
        return employee;

    }
@Override
    public Employee getEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
        return employee;

    }


}
