public class Employee {
    private String name;
    private int age;
    protected double salary;
    protected String location;

    Employee(String name, int age, double salary, String location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void raiseSalary(){
    //    this.raiseSalary(priorSalary, location) = salary, location;

        double newSalary;

        if(location == "India" & age > 30){
            newSalary =   this.salary + this.salary * .50;
            System.out.println("Salary is raised! Salary is now: "+ newSalary);
            // return newSalary;
        }
        else {
            System.out.println("Salary remains the same: " + this.salary);
            // return salary;
        }
        
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }
}
