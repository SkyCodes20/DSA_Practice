package Queue;

public class QueueArrayImplement {

    public static class queue {
        int[] arr = new int[10];
        int front = 0;
        int rear = 0;

        void add(int data) {
            if (rear < arr.length) {
                int a = rear;
                arr[a] = data;
                rear++;
            } else
                System.out.println("out of range");
        }

        int remove() {
                int b = front;
                front++;
                return arr[b];
        }

        int peek() {
            if (front <= arr.length)
                return arr[front];
            System.out.println("out of range");
            return -1;
        }

        void display(){
            for (int i = front; i < rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
//        q.add(4);
//        q.add(5);
//        q.add(6);
//        q.add(7);
//        q.add(8);
//        q.add(9);
//        q.add(10);
//        q.add(11);

        q.remove();
        q.remove();
        q.remove();
//        q.remove();
//        q.remove();
//        q.remove();
//        q.remove();
//        q.remove();
//        q.remove();
//        q.remove();

        q.add(4);


//        System.out.println(q.remove());
        System.out.println(q.peek());
        q.display();
    }
}
