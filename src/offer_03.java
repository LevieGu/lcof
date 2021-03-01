public class offer_03 {

    /**
     * 找出数组中重复的数字。
     * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
     * @param nums length = n, range in [0, n-1]
     * @return 返回重复的值
     */
    public int findRepeatNumber(int[] nums) {
        int len = nums.length, temp;
        for(int i=0; i<len; i++) {
            while (i != nums[i]) {
                // @reason 数组长度为 n，取值范围 0 - n-1。
                if(nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }
}
