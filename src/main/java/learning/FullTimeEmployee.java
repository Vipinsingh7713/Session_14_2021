package learning;

import io.pragra.IEmployee;

public class FullTimeEmployee implements IEmployee {
    private double annualSalary;
    public FullTimeEmployee(double annualSalary){
        this.annualSalary = annualSalary;
        System.out.println(annualSalary/12);
    }
    @Override
    public void work() {
        System.out.println("Work");

    }

    @Override
    public void hire() {
        System.out.println("hire");
    }

    @Override
    public void terminate() {
        System.out.println("Terminate");
    }

    @Override
    public double getPaid() {
        return 0;
    }
}
