public class offer_04 {

    /**
     * 二维数组中的查找
     * 链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * @param matrix  n * m 的二维数组，从左到右、从上到下递增递增的顺序排序
     * @param target 查找目标数
     * @return 是否找到
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rows = matrix.length - 1;
        int col = 0;
        while (rows >= 0 && col < matrix[0].length) {
            int value = matrix[rows][col];
            if(value == target) {
                return true;
            } else if(value > target) {
                rows--;
            } else  {
                col++;
            }
        }
        return false;
    }
}
