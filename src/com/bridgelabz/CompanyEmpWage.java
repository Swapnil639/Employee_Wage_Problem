package com.bridgelabz;

interface IEmpWage{
    public void addCompanyEmpWage(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth);

    public void computeEmpWage();
}

public class CompanyEmpWage {
    private String companyName;
    private int empRatePerHr;
    private int numOfWorkingDays;
    private int maxHoursPerMonth;
    private int totalEmpWage;

    public CompanyEmpWage(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmpRatePerHr() {
        return empRatePerHr;
    }

    public void setEmpRatePerHr(int empRatePerHr) {
        this.empRatePerHr = empRatePerHr;
    }

    public int getNumOfWorkingDays() {
        return numOfWorkingDays;
    }

    public void setNumOfWorkingDays(int numOfWorkingDays) {
        this.numOfWorkingDays = numOfWorkingDays;
    }

    public int getMaxHoursPerMonth() {
        return maxHoursPerMonth;
    }

    public void setMaxHoursPerMonth(int maxHoursPerMonth) {
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "companyName='" + companyName + '\'' +
                ", empRatePerHr=" + empRatePerHr +
                ", numOfWorkingDays=" + numOfWorkingDays +
                ", maxHoursPerMonth=" + maxHoursPerMonth +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }
}
