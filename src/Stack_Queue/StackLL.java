package Stack_Queue;

                            //------- Stacks using linked list implementation------- //

public class StackLL {

    static class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            }
        }
    public static class Stack{
        Node head = null;

        void push(int x){
            Node n = new Node(x);
            n.next = head;
            head = n;
        }

        int peek(){
            if(head == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return head.val;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack Underflow");
                return -1;
            }
            int a = head.val;
            head = head.next;
            return a;
        }
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            return count;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            return head == null;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        st.push(4);
        System.out.println(st.peek());
        st.push(5);
        System.out.println(st.pop());
        st.display();
        st.push(5);
        st.push(11);
        st.display();
    }
}
