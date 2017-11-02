package com.sbi.coop.web.rest;

import com.sbi.coop.domain.LoanMetrics;
import com.sbi.coop.service.LoanMetricsService;
import com.sbi.coop.web.rest.dto.LoanMetricsDTO;
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
 * Created by mgohain on 10/25/2017.
 */
@RestController
@RequestMapping("/api")
public class LoanMetricsResource {
    @Inject
    LoanMetricsService loanMetricsService;

    @RequestMapping(value = "/loanmetrics",
    method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Saves details of a loan type", nickname = "saveLoanMetric")
    public ResponseEntity saveLoanDetails(@RequestBody LoanMetricsDTO _loanMetrics) {
        ModelMapper mapper = new ModelMapper();
        LoanMetrics loanMetrics = mapper.map(_loanMetrics, LoanMetrics.class);
        LoanMetricsDTO _savedLoanMetrics = mapper.map(loanMetricsService.saveLoanMetric(loanMetrics), LoanMetricsDTO.class);
        Map<String, Object> results = new HashMap<>();
        results.put("message", "Loan details successfully saved.");
        results.put("result", _savedLoanMetrics);
        return new ResponseEntity<>(results, HttpStatus.CREATED);
    }
}
