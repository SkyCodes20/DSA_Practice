package Stack_Queue;

import java.util.Stack;

public class practice {
    public static class Stack {
        int[] arr = new int[10];
        int idx = 0;

        public void push(int x) {
            if(isFull()){
                System.out.println("Stack Overflow");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        public int peek() {
            if (idx != 0)
                return arr[idx - 1];
            else {
                System.out.println("Stack Underflow");
                return -1;
            }
        }

        public int pop() {
            if (idx != 0) {
                int a = arr[idx - 1];
                arr[idx - 1] = 0;
                idx--;
                return a;
            } else {
                System.out.println("Stack Underflow");
                return -1;
            }
        }

        public boolean isEmpty() {
            return idx == 0;
        }
        public boolean isFull(){
            return idx == arr.length;
        }

        public void display() {
            for (int i = 0; i<idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public int size(){
            return idx;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(777);
        st.push(6);
        st.push(6996);
        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.peek());
        st.display();
    }
}