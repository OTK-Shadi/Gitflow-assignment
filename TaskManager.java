import java.util.ArrayList;

public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();

    public static void createTask(Task task) {
        tasks.add(task);
        System.out.println("Task created: " + task);
    }

    public static void deleteTask(Task task) {
        if (tasks.remove(task)) {
            System.out.println("Task deleted: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    public static void updateTask(int index, Task updatedTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, updatedTask);
            System.out.println("Task updated to: " + updatedTask);
        } else {
            System.out.println("Task not found at index: " + index);
        }
    }
    
    public static void viewTasks() {
        System.out.println("All tasks:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

}
