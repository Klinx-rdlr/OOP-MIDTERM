
import java.util.Scanner;

public class Midterm {
    public static Scanner getinput = new Scanner(System.in);
 
    public static void main(String[] args) {
           System.out.println("**********************************************");
           Salary object1 = new Salary("OMANOIL", "S");
           object1.printDetails();
           object1.computeTotal();
           object1.printTotal();
           Salary object2 = new Salary("SHELL", "T");
           object2.printDetails();
           object2.computeTotal();
           object2.printTotal();
           Salary object3 = new Salary("Test", "T");
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

    private  String name;
    private  double basic;
    private  double overtime;
    private  double total;
    
    public Salary(String company, String category){
        super(company, category);
        if(company.equals("OMANOIL") && category.equals("S")){
            this.name = company;
            this.basic = 550.0;
            this.overtime = this.basic * 0.05;
        }else if(company.equals("SHELL") && category.equals("T")){
            this.name = company;
            this.basic = 350.0;
            this.overtime = this.basic * 0.1;
        } else{
           System.out.println("Invalid input, please try again");
        }
    }   
      public void computeTotal(){
          this.total = this.basic + this.overtime;
      }
    
      public void printTotal(){
            System.out.println("TOTAL SALARY " + this.name + " = " + this.total);
            System.out.println("**********************************************");
            
        };
}
   

