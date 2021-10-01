import java.util.Stack;

public class StackDemo {


    static void IntStack(){
        Stack<Integer> stk = new Stack<>();
        stk.push(14);
        stk.push(13);
        stk.push(0);
        stk.push(-1);
        stk.push(29);

        System.out.println("Initial stack: " + stk);

        int y = stk.pop();
        System.out.println("First popped item: "+ y);

        y = stk.pop();
        System.out.println("Second popped item: "+ y);

        y = stk.search(14);
        System.out.println("Search position of item 14: " + y);

        System.out.println("Peek item is: "+ stk.peek());

    }

    static void CharStack(){
        Stack<Character> stk2 = new Stack<>();

        boolean bol = stk2.empty();
        System.out.println("Check the stack intial status if empty: "+ bol);

        for(char c = 'a'; c <= 'h'; c++){
            
            stk2.push(c);
        }

        System.out.println("initial stack: "+ stk2);

        char i = stk2.pop();
        System.out.println("Fist popped item: "+ i);

        i = stk2.pop();
        System.out.println("Second popped item: "+ i);

        // i = stk2.search();

        System.out.println("Final stack: "+ stk2);

        i = stk2.peek();
        System.out.println("Peek item now: "+ i);

        int j = stk2.search('f'); // search() returns the position of the object in 1-based. 
        // search() does not return in 0-based.
        System.out.println("Search position of character f: "+ j);
        
        bol = stk2.empty();
        System.out.println("Check the stack final status if empty: "+ bol);

    }

    public static void main(String[] args) {
       
        CharStack();
        // IntStack();

        
        
    }

   


    
}
