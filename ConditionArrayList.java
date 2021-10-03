import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConditionArrayList extends ArrayList<Integer> {

    private Predicate<Integer> condition;

    public ConditionArrayList(Predicate<Integer> predicate, Integer... nums){
       
            super(Arrays.stream(nums).filter(predicate).collect(Collectors.toList()));
            this.condition = predicate;
        }
        // .filter(this::isEligible)
        // .collect(Collectors.toList()));

    // }

    
    
    @Override
    public void add(int index, Integer element){
        if(isEligible(element)){
            super.add(index, element);
        }
    }
    
    @Override
    public boolean add(Integer element){
        if(isEligible(element)){
            return super.add(element);
        } else {
            return false;
        }
    }
    
    public boolean isEligible(Integer element){
        return condition.test(element);
    }
}
