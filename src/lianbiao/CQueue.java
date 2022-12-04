package lianbiao;

import java.util.Stack;

/**
 * @ClassName: CQueue
 * @Description: 用两个栈实现一个队列 https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/11/29 20:36
 * @Version 1.0
 */
public class CQueue {
    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    public CQueue() {

    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return -1;
            }
            intoout();
        }
       return stack2.pop();
    }

    public void intoout(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }


}
