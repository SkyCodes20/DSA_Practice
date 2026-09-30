package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Mark Done\n4. Delete Task\n5. Exit");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Task name: ");
                    tasks.add(new Task(sc.nextLine()));
                    break;
                case 2:
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ": " + tasks.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Task index to mark done: ");
                    tasks.get(Integer.parseInt(sc.nextLine())).markDone();
                    break;
                case 4:
                    System.out.print("Task index to delete: ");
                    tasks.remove(Integer.parseInt(sc.nextLine()));
                    break;
                case 5:
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
