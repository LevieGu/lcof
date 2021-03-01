import java.util.LinkedList;

public class offer_09 {

    /**
     * 用两个栈实现队列
     * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
     * 注：Java 中 Stack 继承 Vector 接口需要考虑扩容和移位问题，而 LinkedList 实现了 Deque 接口，故 Stack 可以实现的 LinkedList 也可以实现
     * 同时提高效率
     */
    class CQueue {

        // Stack<Integer> stackA, stackB;
        LinkedList<Integer> stackA, stackB;

        public CQueue() {
            stackA = new LinkedList<>();
            stackB = new LinkedList<>();
        }

        public void appendTail(int value) {
            stackA.add(value);
        }

        public int deleteHead() {
            if(!stackB.isEmpty()) {
                return stackB.pop();
            }
            if(stackA.isEmpty()) {
                return -1;
            }
            while (!stackA.isEmpty()) {
                stackB.add(stackA.pop());
            }
            return stackB.pop();
        }
    }
}
