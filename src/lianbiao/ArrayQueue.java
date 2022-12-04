package lianbiao;

/**
 * @ClassName: ArrayQueue
 * @Description: 顺序队列
 * @Author yuyang（yuyang_keep@163.com）
 * @Date 2022/11/26 09:44
 * @Version 1.0
 */
public class ArrayQueue {

    static int head =0;
    static int tail = 0;
    static int length = 4;

    static int[] queue = new int[4];


    static boolean enqueue(int num){
        if (tail == length) {
            if (head == 0) return false; //满队列
            for (int i = head; i < tail; i++) {//数据迁移
                queue [i - head] =queue[i];
            }
            head = 0;
            tail = tail - head; //修改指针
        }
        queue[tail] = num;
        tail++;
        return true;
    }


    static int dequeue(){
        if (tail == head) {
            return -1;
        }
        int ans =  queue[head];
        head++;
       return   ans;
    }

}
