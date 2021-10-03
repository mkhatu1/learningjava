public class Analyst extends Employee {

    Analyst(String name, int age, double  salary){
        super(name, age, salary);
    }
    public double getAnnualBonus(){ return this.salary * 0.05; }
    
}
