package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public final static int Is_Full_Time = 1;
    public final static int Is_Part_Time = 2;
    static int WAGE_PER_HOUR = 20;
    static int NUM_OF_WORKING_HRS = 100;
    static int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        int empHrs = 0;
        int salary = 0;
        int totalSalary = 0;
        int totalEmpHr = 0;
        int day = 0;
        while (totalEmpHr < NUM_OF_WORKING_HRS && day < NUM_OF_WORKING_DAYS) {
            day++;
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
            System.out.println("Day:" + day + "  " + "Salary:" + salary);
            totalSalary = totalSalary + salary;
            totalEmpHr = totalEmpHr + empHrs;
        }
        System.out.println("Total Employee Hrs:" + totalEmpHr + " " + " Days:" + day);
        System.out.println("Total salary: " + totalSalary);

    }
}