class Solution {
    public boolean isPalindrome(int x) {

        String s = ""+x;
        return s.equals(new StringBuilder(s).reverse().toString());
        
    }
}
