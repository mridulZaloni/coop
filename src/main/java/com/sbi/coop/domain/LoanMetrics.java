package com.sbi.coop.domain;

import com.wordnik.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Hibernate entity for loan metrics
 * Created by mgohain on 10/25/2017.
 */
@Entity
@Table(name = "T_LOAN_METRICS")
@ApiModel(value = "Loan_Metrics", description = "Details about a loan type")
public class LoanMetrics implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loan_id", nullable = false)
    private int loanId;

    @Column(name = "loan_type", nullable = false)
    private String loanType;

    @Column(name = "duration", nullable = false)
    private int duration;

    @Column(name = "interest_rate", nullable = false)
    private float interestRate;

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "LoanMetrics{" +
            "loanId=" + loanId +
            ", loanType='" + loanType + '\'' +
            ", duration=" + duration +
            ", interestRate=" + interestRate +
            '}';
    }
}
