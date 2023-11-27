/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework2;

import java.util.Random;
import java.util.Scanner;

public class student extends PersonClass {

    private final int StudentID;
    private int grade;
    private double avg;
    private int max;
    private int min;

    public double getAvg() {
        return avg;
    }

    public student(int StudentID, int grade, double avg, int max, int min, String fname, String sname, String address, int age) {
        super(fname, sname, address, age);
        Random r = new Random();
       
        this.StudentID = 0 + r.nextInt(9999);

        this.grade = grade;
        this.avg = avg;
        this.max = max;
        this.min = min;
    }

    public int getStudentID() {
        return StudentID;
    }

    public int getGrade() {
        return grade;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public void input() {
        int s1 ;
        int s2 ;
        int s3 ;
        int s4 ;
        int s5 ;

        super.input();
        System.out.println("Enter your grade ");
        grade = super.input.nextInt();


        System.out.println("Enter your DataBase mark:");
        s1 = input.nextInt();
        System.out.println("Enter your OOP mark:");
        s2 = input.nextInt();
        System.out.println("Enter your Linear Algebra mark:");
        s3 = input.nextInt();
        System.out.println("Enter your Electrical circuit mark:");
        s4 = input.nextInt();
        System.out.println("Enter your Enterpreunership mark:");
        s5 = input.nextInt();

        if (s1 >= 0 && s1 <= 100 && s2 >= 0 && s2 <= 100 && s3 >= 0 && s3 <= 100 && s4 >= 0 && s4 <= 100 && s5 >= 0 && s5 <= 100) {
            int sum = s1 + s2 + s3 + s4 + s5;
            avg = sum / 5.0;
        } else {
            System.out.println("(Mark should be between 0-100 inclusive)");
      
        }

        int[] marks = {s1, s2, s3, s4, s5};
        max = findMax(marks);
        min = findMin(marks);
    }

    private int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    }


