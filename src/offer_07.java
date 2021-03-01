import java.util.HashMap;

public class offer_07 {

    /**
    * Definition for a binary tree node.
    */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 重建二叉树 [无重复节点]
     * 链接：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
     * @param preorder 前序遍历结果
     * @param inorder 中序遍历结果
     * @return 返回二叉树根节点
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> dic = new HashMap<>();
        for(int i=0; i<inorder.length; i++) {
            dic.put(inorder[i], i);
        }
        return buildTree(0,0, inorder.length-1, preorder ,dic);
    }

    public TreeNode buildTree(int root, int left, int right, int[] preorder, HashMap<Integer, Integer> dic) {
        if(right < left) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[root]);
        int i = dic.get(preorder[root]);
        node.left = buildTree(root+1, left, i-1, preorder, dic);
        node.right = buildTree(root + i - left + 1, i + 1, right, preorder, dic);
        return  node;
    }
}
