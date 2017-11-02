package com.sbi.coop.web.rest.dto;

/**
 * Created by mgohain on 10/25/2017.
 */
public class LoanMetricsDTO {
    private Integer loanId;
    private String loanType;
    private Integer duration;
    private Float interestRate;

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
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
