package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        int isFullTime = 1;
        int isPartTime = 2;
        Random random = new Random();
        int empCheck = random.nextInt(3);
        int wagePerHour = 20;
        int empHrs;
        int salary;

        if (empCheck == isFullTime) {
            System.out.println("Employee Full Time wage");
            empHrs = 8;
            salary = (wagePerHour * empHrs);
            System.out.println("Salary: " + salary);
        } else if (empCheck == isPartTime) {
            System.out.println("Employee Part Time wage");
            empHrs = 4;
            salary = (wagePerHour * empHrs);
            System.out.println("Salary: " + salary);
        } else {
            System.out.println("Employee is Absent");
        }

    }
}
