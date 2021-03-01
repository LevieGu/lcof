public class offer_12 {

    /**
     * 矩阵中的路径
     * 链接：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/
     * @param board 矩阵数组
     * @param word 查找路径
     * @return 是否查找到
     */
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        //
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * 深度搜索
     * @param board 矩阵数组
     * @param word  查找路径
     * @param row 行坐标
     * @param column 列坐标
     * @param k 匹配字符串长度
     * @return
     */
    public boolean dfs(char[][] board, char[] word, int row, int column, int k) {
        if(row>=board.length || row<0 || column>=board[0].length || column<0 || board[row][column] != word[k]) {
            return false;
        }
        if(k == word.length -1) {
            return true;
        }
        board[row][column] = '\0';
        boolean res = dfs(board, word, row+1, column, k+1) || dfs(board, word, row-1, column, k+1) ||
                dfs(board, word, row, column+1, k+1) || dfs(board, word, row , column-1, k+1);
        board[row][column] = word[k];
        return res;
    }
}
