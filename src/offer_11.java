public class offer_11 {

    /**
     * 旋转数组的最小数字
     * 链接：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
     * @param numbers 被旋转的数组
     * @return 返回数组的最小值
     */
    public int minArray(int[] numbers) {
        for(int i=0; i<numbers.length-1; i++) {
            if(numbers[i] > numbers[i+1]) {
                return numbers[i+1];
            }
        }
        return numbers[0];
    }

    public int binaryMinArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if(numbers[mid] < numbers[high]) {
                high = mid;
            } else if (numbers[mid] > numbers[high]) {
                low = mid + 1;
            } else  {
                //[2,2,2,2,0,2]
                high--;
            }
        }
        return numbers[low];
    }
}
