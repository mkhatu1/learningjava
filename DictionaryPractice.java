import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryPractice {

    public static void main(String[] args) {
        // english to spanish dictionary. dictionary is a key|value pair.
        Map<String, String> englSpanDictionary = new HashMap<String, String>();
        
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "viernes");

        
        // // retrieve from dictionary
        // System.out.println(englSpanDictionary.get("Monday"));
        // // printout all keys
        // System.out.println(englSpanDictionary.keySet());
        // // printout all values
        // System.out.println(englSpanDictionary.values());
        // // printout size
        // System.out.println(englSpanDictionary.size());

        // Shopping list dictionary
        Map<String, Boolean> shopList = new HashMap<String, Boolean>();
        // put some in the dictionary
        shopList.put("Ham", true);
        shopList.put("Bread", false);
        shopList.put("Oreo", Boolean.FALSE);
        shopList.put("Vegetable", Boolean.TRUE);
        shopList.put("Sugar", false);
        // retrive item from the dictionary
        // System.out.println(shopList.get("Vegetable")); 
        // System.out.println(shopList.get("Sugar"));
       
        // // key-value pairs printout
        // System.out.println(shopList.toString());
        // // is dictionary empty?
        // System.out.println(shopList.isEmpty());
        // // remove an item
        // shopList.remove("Oreo");
        // // replace values for a certain things
        // shopList.replace("Ham", true, false);
        // // print out new dictionary
        // System.out.println(shopList.toString());
        // // check for an item
        // System.out.println(shopList.containsKey("Oreo"));
        // // clear our dictionary
        // shopList.clear();
        // System.out.println(shopList.toString());
        // System.out.println(shopList.isEmpty());

        System.out.println(shopList.toString());
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String deafultValue = "Not found";
        // shopList.entrySet(s)
        //     ? System.out.println(shopList.get(s).toString())
        //     : deafultValue);
        if(shopList.containsKey(s))
        {
            System.out.println(s+ "=" + shopList.get(s));
        } else{ System.out.println(deafultValue);}




    }
    
}
