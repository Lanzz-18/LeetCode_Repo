import java.util.ArrayList;
import java.util.List;

public class FIzzBuzz {
    public static void main(String[] args) {
        /*
            Input: n = 3
            Output: ["1","2","Fizz"]
        */

        System.out.println(fizzBuzz(3));
    }

    public static List<String> fizzBuzz(int n){
        if(n == 0){
            List<String> arr = new ArrayList<String>();
            arr.add("Empty");
            return arr;
        }
        List<String> arr = new ArrayList<>();

        for(int i=1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                arr.add("FizzBuzz");
            } else if(i % 3 == 0){
                arr.add("Fizz");
            } else if(i % 5 == 0){
                arr.add("Buzz");
            } else {
                arr.add(String.valueOf(i));
            }
        }

        return arr;
    }
}
