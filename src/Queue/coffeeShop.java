package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class coffeeShop {
    public static void main(String[] args) {
        Queue<String> coffeeQueue = new LinkedList<>();
        coffeeQueue.add("Rahul - Cappuccino");
        coffeeQueue.add("Priya - Latte");
        coffeeQueue.add("Amit - Black Coffee");

        while(!coffeeQueue.isEmpty()){
            String x = coffeeQueue.poll();
            System.out.println("Serving: "+x);
        }
        System.out.println("All orders fulfilled for the day!");
    }
}
