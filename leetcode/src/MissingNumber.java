public class MissingNumber {
    public static int missingNumber(int[] nums){
        int size = nums.length;
        int noMissingNumber = -1 ;
        boolean isMissing = false;
        for (int i=0 ; i <= size ; i++){
            int tmp = 0;
            for(int j : nums){
                if(i!=j){
                    tmp+=1;
                }
                if(tmp==size){
                    return i;
                }
            }
        }
        return noMissingNumber;
    }
}
