package com.sbi.coop.web.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sbi.coop.domain.Employee;
import com.sbi.coop.service.EmployeeService;
import com.sbi.coop.web.rest.dto.EmployeeDTO;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

/**
 * Controller class for REST APIs to handle operations related to an <code><i>Employee</i></code>
 * Created by mgohain on 10/10/2017.
 */
@RestController
@RequestMapping("/api")
public class EmployeeResource {
    @Inject
    EmployeeService employeeService;

    @RequestMapping(value = "/employee",
    method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Saves details of an employee", nickname = "saveEmployee")
    public ResponseEntity addEmployee(@RequestBody EmployeeDTO _employee) {
        ModelMapper modelMapper = new ModelMapper();
        Employee employee = modelMapper.map(_employee, Employee.class);
        EmployeeDTO _savedEmployee = modelMapper.map(employeeService.addEmployee(employee), EmployeeDTO.class);
        Map<String, Object> results = new HashMap<>();
        results.put("message", "Successfully saved employee details");
        results.put("result", _savedEmployee);
        return new ResponseEntity<>(results, HttpStatus.CREATED);
    }

}
