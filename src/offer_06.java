public class offer_06 {

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    /**
     * 从尾到头打印链表
     * 连接：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
     * @param head 链表表头
     * @return 链表值
     */
    public int[] reversePrint(ListNode head) {
        int len = 0;
        ListNode current = head;
        while (current != null) {
            len++;
            current = current.next;
        }
        int[] args = new int[len];
        for(int i=1; i<=len; i++) {
            args[len-i] = head.val;
            head = head.next;
        }
        return args;
    }

}
