package strings;

/**
 * Determine if a string has all unique characters.
 * Cracking the Coding Interview question 1.1.
 * @author Bill
 *
 */
public class Unique {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(uniqueASCII("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(uniqueASCII("aaa"));
        System.out.println(uniqueASCII("aAbBcC"));
    }
    
    /**
     * Determine is the input String s has all unique characters.
     * This implementation assumes only ASCII characters.
     * @param s
     * @return
     */
    public static boolean uniqueASCII(String s) {
        int[] counts = new int[256];
        char[] chars = s.toCharArray();
        
        for(char c : chars) {
            int i = (int)c;
            counts[i]++;
            if(counts[i] > 1) {
                return false;
            }
        }
        
        return true;
    }

}
