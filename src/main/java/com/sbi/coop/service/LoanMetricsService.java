package com.sbi.coop.service;

import com.sbi.coop.domain.LoanMetrics;
import com.sbi.coop.repository.LoanMetricsRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by mgohain on 10/24/2017.
 */
@Service
public class LoanMetricsService {

    @Inject
    LoanMetricsRepository loanMetricsRepository;

    public LoanMetrics saveLoanMetric(LoanMetrics loanMetrics) {
        return loanMetricsRepository.save(loanMetrics);
    }
}
