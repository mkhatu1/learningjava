import java.util.ArrayList;
import java.util.Random;

public class MainOddArrayList {

    public static void addRandomNumber(ArrayList<Integer> list){
        int originalSize = list.size();
        Random random = new Random();
        int n = random.nextInt(1000);
        
        if(list instanceof ConditionArrayList){
            ConditionArrayList conditionList = (ConditionArrayList) list;
            while (!conditionList.isEligible(n)){
                n = random.nextInt(1000);
            }
        }
        list.add(n);
    }
    public static void main(String[] args) {
        ConditionArrayList oddListy = new ConditionArrayList(
            n -> Math.abs(n)% 2 == 1);
        System.out.println(oddListy);
        oddListy.add(1); 
        oddListy.add(2);
        addRandomNumber(oddListy);
        System.out.println(oddListy);

        ConditionArrayList evenListy = new ConditionArrayList(
            n -> Math.abs(n)%2 == 0);
        evenListy.add(1);
        evenListy.add(2);
        addRandomNumber(evenListy);
        System.out.println(evenListy);

        ArrayList<Integer> listy = new ArrayList<>();
        listy.add(1);
        listy.add(2);
        // listy.add(-3);
        // listy.add(4);
        // listy.add(7);
        addRandomNumber(listy);
        System.out.println(listy);
        // System.out.println(listy.size());
    }
    
}
