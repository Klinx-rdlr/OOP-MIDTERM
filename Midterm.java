
import java.util.Scanner;

public class Midterm {
    public static Scanner getinput = new Scanner(System.in);
 
    public static void main(String[] args) {
            //1st - Company, 2nd - Category, 3rd - Name;
           System.out.println("**********************************************");
           Salary object1 = new Salary("OMANOIL", "S", "Gian");
           object1.printDetails();
           object1.computeTotal();
           object1.printTotal();
           Salary object2 = new Salary("SHELL", "T", "Rhode");
           object2.printDetails();
           object2.computeTotal();
           object2.printTotal();
           Salary object3 = new Salary("Test", "T", "Test");
           object3.printDetails();
           object3.printTotal();
    }  
}
class Employee{
    private final String company;
    private final String category;
    public Employee(String company, String category){
        this.company = company;
        this.category= category;
    }
    
    public void printDetails(){
        System.out.println("COMPANY: " + this.company + "\t\t" + "CATEGORY: " + this.category);
    }
}
    class Salary extends Employee{

    private  final String name;
    private  final double basic;
    private  final double overtime;
    private  double total;
    
    public Salary(String company, String category, String name){
        super(company, category);
        this.name = name;
        if(company.equals("OMANOIL") && category.equals("S")){
            this.basic = 550.0;
            this.overtime = this.basic * 0.05;
        }else if(company.equals("SHELL") && category.equals("T")){
            this.basic = 350.0;
            this.overtime = this.basic * 0.1;
        } else{
           System.out.println("Invalid input, please try again");
           this.basic = 0;
           this.overtime = 0;
        }
    }   
      public void computeTotal(){
          this.total = this.basic + this.overtime;
      }
    
      public void printTotal(){
            System.out.println("NAME: " + this.name);
            System.out.println("TOTAL SALARY " + this.name + " = " + this.total);
            System.out.println("**********************************************");
            
        };
}
   

