import java.util.Scanner;

public class java102 {

        

    // use functions 
    // announce developer tea time

    
    public static void announceDeveloperTeaTime(){

    System.out.println("Waiting for developer tea time...");
    System.out.println("Type in random words and press Enter to start developer tea time");
  


    }

    public static void main(String[] args) {
        System.out.println("welcome to your job!");

        announceDeveloperTeaTime();
        Scanner input = new Scanner(System.in);
        input.next();

        System.out.println("It's developer tea time!");
        

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();
        input.next();
        input.close();
    

        System.out.println("Get promoted!");
      
        
    }

    
}
