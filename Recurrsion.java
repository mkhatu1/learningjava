import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Recurrsion {
    
    // recursion method
    public static int recursion(int n){
        // base case
        if(n <= 0){
            return 0;
        } 
        // recursive case.
        else{
            return n + recursion(n-1);
        }

    }

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    // 4*3*2*1 = 24

    public static int exponential(int n, int p){
        if(p <= 0){
            return 1;
        }
        else{
            return n * exponential(n, p-1);
        }

    }


//     public static int count(Stack<Integer> s){
//     int c = 0;
//     // LinkedList<Integer> l = new LinkedList<>();
//     Stack<Integer> st = new Stack<>();

//     while(!s.empty()){
//         if(s.peek() == 1){
//         c++;
//         s.pop();
//         st.push(c);
//         System.out.println(st);
//         }
//         else s.pop();
        
//         return count(s);
//     }
//     return findMax(st);
    
// }

// public static int findMax(Stack<Integer> st){
//     int max = 0;
//     for(int i = 0; i < st.size(); i++){
//         if(st.elementAt(i) > max){
//             max = st.elementAt(i);
//         }
//         //  else return max;
//     }
//     // System.out.println(max);
//     return max;
// }

// find the max number of consecutive 1s.
public static int getMaxConsecutiveOnes(Stack<Integer> s){
    int c = 0;
    int r = 0;
    for(int i = 0; i < s.size(); i++){
        if(s.elementAt(i) == 0){
            c = 0;
        } else{
            c++;
            r = Math.max(r, c);
        }
        
    }
    return r;
}
       
 

    public static void main(String[] args) {
        // recursion(3);
        // System.out.println(recursion(1));
        // System.out.println(factorial(4));
        // System.out.println(exponential(2, 3));


        Stack<Integer> s = new Stack<>();
        // LinkedList<Integer> s = new LinkedList<>();
        s.push(1);
        s.push(1);
        s.push(0);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(0);
        // System.out.println(s);
        // System.out.println(countConsecutiveOnes(s));
        

        // System.out.println(findMax(s));
        // System.out.println(count(s));
        System.out.println(getMaxConsecutiveOnes(s));

     
    }
}
