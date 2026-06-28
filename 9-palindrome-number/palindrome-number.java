class Solution {
    public boolean isPalindrome(int x) {
        String sc = ""+x;
        return sc.equals(new StringBuilder(sc).reverse().toString());
        
    }
}