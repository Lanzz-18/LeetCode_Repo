import java.util.Arrays;

public class SumOfOneDArray {
    public static void main(String[] args) {
        /*
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
        */
        int[] list = {1, 2, 3, 4};
        System.out.println(Arrays.toString(findSum(list)));
    }

    public static int[] findSum(int[] list){
        if(list.length <= 1){
            return list;
        }
        int[] modifiedList = new int[list.length];
        for(int i=0; i<list.length; i++){
            for(int j=0; j <= i; j++){
                modifiedList[i] += list[j];
            }
        }
        return modifiedList;
    }
}
