package com.sbi.coop.repository;

import com.sbi.coop.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface that provides JAVA persistence APIs to access data of Employee
 * Created by mgohain on 10/24/2017.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findById(Long employeeId);
    Employee deleteOneById(Long employeeId);
}






























