package Queue;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        Queue<Integer> temp = new LinkedList<>();

        while(!a.isEmpty()){
            temp.add(a.remove());
        }
        while(!temp.isEmpty()){
            System.out.print(temp.peek() + " ");
            a.add(temp.remove());
        }
    }
}
