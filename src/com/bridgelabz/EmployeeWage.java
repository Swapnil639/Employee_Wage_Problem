package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public final static int Is_Full_Time = 1;
    public final static int Is_Part_Time = 2;
    static int WAGE_PER_HOUR = 20;
    static int NUM_OF_WORKING_HRS = 100;
    static int NUM_OF_WORKING_DAYS = 20;

    public static void computeWage() {
        int empHrs = 0;
        int salary;
        int totalSalary = 0;
        int totalEmpHr = 0;
        int totalWorkingDay = 0;
        while (totalEmpHr < NUM_OF_WORKING_HRS && totalWorkingDay < NUM_OF_WORKING_DAYS) {
            totalWorkingDay++;
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
            salary = WAGE_PER_HOUR * empHrs;
            System.out.println("Day:" + totalWorkingDay + "  " + "Salary:" + salary);
            totalSalary = totalSalary + salary;
            totalEmpHr = totalEmpHr + empHrs;
        }
        System.out.println("Total Employee Hrs:" + totalEmpHr + " " + "Total Working Days:" + totalWorkingDay);
        System.out.println("Total salary: " + totalSalary);                     
    }

    public static void main(String[] args) {
        computeWage();
    }
}