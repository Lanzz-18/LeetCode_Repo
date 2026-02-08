import java.util.regex.Pattern;

public class RansomNote {
    public static void main(String[] args) {
        /*
            Input: ransomNote = "a", magazine = "b"
            Output: false
        */
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] charList = new int[26];

        // Storing the values and instance counts
        for(char letter : magazine.toCharArray()){
            charList[letter - 'a']++;
        }

        // Checking the list
        for(char letter : ransomNote.toCharArray()){
            charList[letter - 'a']--; // Reduce the instance count of the letter

            if(charList[letter - 'a'] < 0){
                return false;
            }
        }

        return true;
    }
}
