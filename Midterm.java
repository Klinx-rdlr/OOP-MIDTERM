/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.util.Scanner;

public class Midterm {
    public static Scanner getinput = new Scanner(System.in);
 
    public static void main(String[] args) {
           Salary object = new Salary("OMANOIL", "S");
           Salary object2 = new Salary("SHELL", "T");
    }  
}
class Employee{
    private final String company;
    private final String category;
    public Employee(String company, String category){
        this.company = company;
        this.category= category;
    }
}
    class Salary extends Employee{

    private String name;
    private final double basic;
    private final double overtime;
    private final double total;
    
    public Salary(String company, String category){
        super(company, category);
        if(company.equals("OMANOIL") && category.equals("S")){
            this.name = company;
            this.basic = 550.0;
            this.overtime = basic * 0.05;
            this.total = this.basic + this.overtime;
            System.out.println("TOTAL SALARY " + this.name + " = " + this.total);
        }else if(company.equals("SHELL") && category.equals("T")){
            this.name = company;
            this.basic = 350.0;
            this.overtime = basic * 0.1;
            this.total = this.basic + this.overtime;
            System.out.println("TOTAL SALARY " + this.name + " = " + this.total);
        } 
    }
}
   

