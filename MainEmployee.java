public class MainEmployee {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Sam", 32, 11100.0, "India");
        Employee employee2 = new Employee("Ron", 33, 9000, "USA");

        employee1.raiseSalary();
        employee2.raiseSalary();
    }
    
}
