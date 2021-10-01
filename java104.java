public class java104 {


    public static double calculateYearlyIncome(double hoursPerWeek, double payPerHour, double vacationDays) {
        
        if(hoursPerWeek < 0){
            return -1;
        }

        if(payPerHour < 0){
            return -1;
        }

        double weeklyIncome = hoursPerWeek * payPerHour;
        double unpaidDays = vacationDays * payPerHour;
        double totalYearlyIncome = weeklyIncome * 52 - unpaidDays;


        return totalYearlyIncome;
    }
    public static void main(String[] args) {

        double result = calculateYearlyIncome(40.0, 15.0, 8);

        System.out.println("Total yearly income with vacation days " + result);
       
    }
    
}
