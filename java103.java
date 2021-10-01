public class java103{

    public static double calculateMealPrice(double listedMealPrice, double tipRate, double taxRate){

        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;

        // System.out.println("Your total meal price is "+ result);
        return result;
    }

    public static void main(String[] args) {
        // calculateMealPrice(15, .2, .08);
        // calculateMealPrice(25, .18, .08);

        double groupTotalPrice = calculateMealPrice(100, .2, .08);

        System.out.println("Group total meal price "+ groupTotalPrice);

        double individualPrice = groupTotalPrice / 5;

        System.out.println("Individual meal price "+ individualPrice);
    }

}