public class StudentProfile {

    String firstName;
    String lastName;
    String declareMajor;
    double gpa;
    int expectedGraduationYear;
    

    
    public StudentProfile(String firstName, String lastName, String declareMajor, double gpa, int expectedGraduationYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.declareMajor = declareMajor;
        this.gpa = gpa;
        this.expectedGraduationYear = expectedGraduationYear;
    }

    public void incrementExpectedGraduationYear(){
        this.expectedGraduationYear = this.expectedGraduationYear + 1;

    }

    public static void main(String[] args) {
        
        StudentProfile profileOne = new StudentProfile("Sally", "Salmon", "CSC", 3.80, 2022);

        System.out.println("Student firstName: "+ profileOne.firstName);
        System.out.println(profileOne.firstName.charAt(0));
    }
    
}
