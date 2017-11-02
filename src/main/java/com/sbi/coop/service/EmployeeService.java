package com.sbi.coop.service;

import com.sbi.coop.domain.Employee;
import com.sbi.coop.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Service class to handle operations related to an <code><i>Employee</i></code>
 * Created by mgohain on 10/10/2017.
 */
@Service
public class EmployeeService {

    @Inject
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
