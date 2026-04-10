public class SingleNumber {
    public int singleNumber(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int tmp = 0;
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] == nums[j]) {
                    break;
                }
                tmp += 1;
            }
            if (tmp == size - 1) {
                return nums[i];
            }
        }
        return -1;
    }
}
