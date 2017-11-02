package com.sbi.coop.web.rest.dto;

import org.joda.time.DateTime;

/**
 * Created by mgohain on 10/24/2017.
 */
public class EmployeeDTO {

    private Long id;


    private String empNo;


    private String name;


    private String branchCode;


    private String branchName;


    private String pfiNo;


    private String loanLfNo;


    private Long loanInstallment;


    private String empLfNo;


    private Long empInst;


    private String thriftLfNo;


    private Long thriftInstallment;


    private DateTime dob;


    private DateTime dor;


    private String cadre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getPfiNo() {
        return pfiNo;
    }

    public void setPfiNo(String pfiNo) {
        this.pfiNo = pfiNo;
    }

    public String getLoanLfNo() {
        return loanLfNo;
    }

    public void setLoanLfNo(String loanLfNo) {
        this.loanLfNo = loanLfNo;
    }

    public Long getLoanInstallment() {
        return loanInstallment;
    }

    public void setLoanInstallment(Long loanInstallment) {
        this.loanInstallment = loanInstallment;
    }

    public String getEmpLfNo() {
        return empLfNo;
    }

    public void setEmpLfNo(String empLfNo) {
        this.empLfNo = empLfNo;
    }

    public Long getEmpInst() {
        return empInst;
    }

    public void setEmpInst(Long empInst) {
        this.empInst = empInst;
    }

    public String getThriftLfNo() {
        return thriftLfNo;
    }

    public void setThriftLfNo(String thriftLfNo) {
        this.thriftLfNo = thriftLfNo;
    }

    public Long getThriftInstallment() {
        return thriftInstallment;
    }

    public void setThriftInstallment(Long thriftInstallment) {
        this.thriftInstallment = thriftInstallment;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public DateTime getDor() {
        return dor;
    }

    public void setDor(DateTime dor) {
        this.dor = dor;
    }

    public String getCadre() {
        return cadre;
    }

    public void setCadre(String cadre) {
        this.cadre = cadre;
    }

    @Override
    public String toString() {
        return "Employee = {" +
            "id = " + id + ", " +
            "empNo = " + empNo + ", " +
            "name = " + name + ", " +
            "branchCode = " + branchCode + ", " +
            "branchName = " + branchName + ", " +
            "PFINo = " + pfiNo + ", " +
            "LoanLfNo = " + loanLfNo + ", " +
            "loanInstallment = " + loanInstallment + ", " +
            "empLfNo = " + empLfNo + ", " +
            "empInstallment = " + empInst + ", " +
            "thriftLfNo = " + thriftLfNo + ", " +
            "thriftInstallment = " + thriftInstallment + ", " +
            "DOB = " + dob + ", " +
            "DOR = " + dor + ", " +
            "cadre = " + cadre + "}";
    }
}
