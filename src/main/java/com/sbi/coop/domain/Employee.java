package com.sbi.coop.domain;

import com.wordnik.swagger.annotations.ApiModel;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;

/** Database entity class for Employee
 * Created by mgohain on 10/6/2017.
 */
@Entity
@Table(name = "T_EMPLOYEE")
@ApiModel(value = "Employee", description = "Details about an employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "emp_no", nullable = false)
    private String empNo;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "br_code", nullable = false)
    private String branchCode;

    @Column(name = "br_name", nullable = false)
    private String branchName;

    @Column(name = "pfi_no", nullable = false)
    private String pfiNo;

    @Column(name = "ln_lf_no")
    private String loanLfNo;

    @Column(name = "ln_inst")
    private long loanInstallment;

    @Column(name = "emg_lf_no")
    private String empLfNo;

    @Column(name = "emg_inst")
    private long empInst;

    @Column(name = "thrift_lf_no")
    private String thriftLfNo;

    @Column(name = "thrift_inst")
    private long thriftInstallment;


    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @Column(name = "dob", nullable = false)
    private DateTime dob;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @Column(name = "dor", nullable = false)
    private DateTime dor;

    @Column(name = "cadre", nullable = false)
    private String cadre;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getLoanInstallment() {
        return loanInstallment;
    }

    public void setLoanInstallment(long loanInstallment) {
        this.loanInstallment = loanInstallment;
    }

    public String getEmpLfNo() {
        return empLfNo;
    }

    public void setEmpLfNo(String empLfNo) {
        this.empLfNo = empLfNo;
    }

    public long getEmpInst() {
        return empInst;
    }

    public void setEmpInst(long empInst) {
        this.empInst = empInst;
    }

    public String getThriftLfNo() {
        return thriftLfNo;
    }

    public void setThriftLfNo(String thriftLfNo) {
        this.thriftLfNo = thriftLfNo;
    }

    public long getThriftInstallment() {
        return thriftInstallment;
    }

    public void setThriftInstallment(long thriftInstallment) {
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
