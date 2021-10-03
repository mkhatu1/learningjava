// inheritance check. SalesPerson inherits from the Employee class.

public class SalesPerson extends Employee {

    private double commision;

    public SalesPerson(String name, int age, double salary, double commision) {
        
        super(name, age, salary);
        this.commision = commision;

    }
    public double getCommision(){
        return this.commision;
    }
    public void raisCommision(){
        if(this.commision < 0.30){
            this.commision = this.commision + 1.2;
        }
    }
}
