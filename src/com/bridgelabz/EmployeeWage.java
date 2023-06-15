package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        int isFullTime=1;
        Random random = new Random();
        int empCheck = random.nextInt(2);
        int wagePerHour=20;
        int empHrs;
        int salary;

        if (empCheck == isFullTime) {
            System.out.println("Employee Full Time wage");
            empHrs=8;
            salary=(wagePerHour * empHrs);
            System.out.println(salary);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
