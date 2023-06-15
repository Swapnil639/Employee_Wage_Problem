package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public final static int Is_Full_Time = 1;
    public final static int Is_Part_Time = 2;
    static int Wage_Per_Hour = 20;

    public static void main(String[] args) {
        int empHrs=0;
        int salary=0;
        int totalSalary=0;
        for (int day = 1; day <= 20; day++) {
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
            salary = Wage_Per_Hour * empHrs;
            System.out.println("Day:"+day+"  "+"Salary:"+salary);
            totalSalary=totalSalary+salary;
        }
        System.out.println("Total salary: "+totalSalary);

    }
}