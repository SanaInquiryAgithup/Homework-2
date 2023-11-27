/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework2;

public class Main {

    public static void main(String[] args) {
       
        int StudentID = 0;
        String fname = null;
        String sname = null;
        int age = 0;
        String address = null;
        int grade = 0;
        double avg = 0;
        int max = 0;
        int min = 0;

       
        student s = new student(StudentID, grade, avg, max, min, fname, sname, address, age);

    
        s.input();

   
        System.out.println("ID\tFull Name\tAge\tAddress\tGrade\tAverage Mark\tMax\tMin");
        System.out.println("*********************************************************************************");
        System.out.println(s.getStudentID() + "\t" + s.getFname() + " " + s.getSname() + "\t" + s.getAge() + "\t" +
                s.getAddress() + "\t  " + s.getGrade() + "\t" + s.getAvg() + "\t\t" + s.getMax() + "\t" + s.getMin());
    }
}