class Solution {
    public boolean isPerfectSquare(int num) {

        int left =0;
        int right = num;

        while(left<=right){
            int mid = left +(right-left)/2;
            if((long)mid*mid==num){
                return true;
            }
            else if ((long)mid*mid<num){
                left = mid +1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
        
    }
}
