/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework2;

import java.util.Scanner;

public class PersonClass {

    Scanner input = new Scanner(System.in);
    private String fname;
    private String sname;
    private String address;
    int age;

    public PersonClass(String fname, String sname, String address, int age) {
        this.fname = fname;
        this.sname = sname;
        this.address = address;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public String getSname() {
        return sname;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void input() {
        System.out.println("Enter your first name: ");
        fname = input.next();
        System.out.println("Enter your second name;");
        sname = input.next();
        System.out.println("Enter your age:");
        age = input.nextInt();
        System.out.println("Enter your address:");
        address = input.next();
    }

}
