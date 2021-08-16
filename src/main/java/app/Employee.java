package app;

public class Employee extends Person{
    //public static Employee emp;
    private int emplId;
    public Employee(String name,int age,double hourlyrate, int emplId){
        super(name,age);
        //this.hourlyrate = hourlyrate;
        this.emplId = emplId;
    }
    public void displayDetails(){
       //System.out.println("Salary"+this.calculateSalary());
        System.out.println("EmpId"+emplId);
        super.displayDetails();
    }
    /*public double calculateSalary(){
        //double hourlyrate;
        return hourlyrate*20*8;


    }

     */


}
