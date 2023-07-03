package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public final static int Is_Full_Time = 1;
    public final static int Is_Part_Time = 2;
    String company;
    int empRatePerHour;
    int numOfWorkingDays;
    int maxHoursPerMonth;
    int totalEmpWage=0;

    public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmployeeWage() {
        int totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empHrs=0;
            Random random = new Random();
            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case Is_Full_Time:
                    System.out.println("Employee Full Time wage");
                    empHrs = 8;
                    break;
                case Is_Part_Time:
                    System.out.println("Employee Part Time wage");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            totalEmpHrs += empHrs;
            System.out.println("Day " +totalWorkingDays+  " :"  + " " + "Emp Hrs : " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total employee wage for company : " + company + " " + "is:" + totalEmpWage);
    }

    @Override
    public String toString() {
        return "EmployeeWage{" +
                "company='" + company + '\'' +
                ", empRatePerHour=" + empRatePerHour +
                ", numOfWorkingDays=" + numOfWorkingDays +
                ", maxHoursPerMonth=" + maxHoursPerMonth +
                '}';
    }

    public static void main(String[] args) {
        EmployeeWage tcs=new EmployeeWage("TCS", 20, 2, 10);
        tcs.computeEmployeeWage();
        System.out.println(tcs);

        EmployeeWage infosys=new EmployeeWage("INFOSYS", 10, 3, 20);
        infosys.computeEmployeeWage();
        System.out.println(infosys);
    }
}