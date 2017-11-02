package com.sbi.coop.repository;

import com.sbi.coop.domain.LoanMetrics;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mgohain on 10/25/2017.
 */
public interface LoanMetricsRepository extends JpaRepository<LoanMetrics, Integer> {
    LoanMetrics findOneByLoanId(Integer loanId);
}
