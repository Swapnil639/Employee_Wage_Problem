package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public final static int Is_Full_Time = 1;
    public final static int Is_Part_Time = 2;

    public static int computeEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
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
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Employee wage for company : " + company + " is :" + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmployeeWage("TCS", 20, 2, 10);
        computeEmployeeWage("INFOSYS", 10, 3, 20);
    }
}