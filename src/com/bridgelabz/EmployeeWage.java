package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public final static int Is_Full_Time = 1;
    public final static int Is_Part_Time = 2;
    static int Wage_Per_Hour = 20;

    public static void main(String[] args) {
        Random random = new Random();
        int empCheck = random.nextInt(3);
        int empHrs;
        int salary;

        switch (empCheck) {
            case Is_Full_Time:
                System.out.println("Employee Full Time wage");
                empHrs = 8;
                salary = (Wage_Per_Hour * empHrs);
                System.out.println("Salary: " + salary);
                break;
            case Is_Part_Time:
                System.out.println("Employee Part Time wage");
                empHrs = 4;
                salary = (Wage_Per_Hour * empHrs);
                System.out.println("Salary: " + salary);
                break;
            default:
                System.out.println("Employee is Absent");
        }

    }
}
