public class RichestCustomerWealth {
    public static void main(String[] args) {
        /*
            Input: accounts = [[1,2,3],[3,2,1]]
            Output: 6
            Explanation:
            1st customer has wealth = 1 + 2 + 3 = 6
            2nd customer has wealth = 3 + 2 + 1 = 6
            Both customers are considered the richest with a wealth of 6 each, so return 6.
        */
        int[][] sample = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(sample));
    }

    public static int maximumWealth(int[][] accounts){
        int highest = 0;
        int customerPosition = 0;
        for(int i=0; i < accounts.length; i++){ // i = customer
            int value = 0;
            for(int j=0; j < accounts[i].length; j++){ // j = bank
                value += accounts[i][j];
            }
            if(value > highest){
                highest = value;
                customerPosition = i+1;
            }
        }
        System.out.println(customerPosition+"st customer has the most wealth: "+highest);
        return highest;
    }
}
