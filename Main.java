import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = Authentication.login(username, password);

        if (isAuthenticated) {
            System.out.println("Welcome, " + username + "!");
            
            Task task1 = new Task("Learn Spring Boot", "Understand the basics of Spring Boot development", "Pending");
            Task task2 = new Task("Learn GitFlow", "Practice GitFlow workflow in a collaborative project", "In Progress");

            TaskManager.createTask(task1);
            TaskManager.createTask(task2);

            TaskManager.viewTasks();
            TaskManager.updateTask(0, new Task("Learn Spring Boot", "Master Spring Boot concepts and features", "Completed"));

            Authentication.logout();
        } else {
            System.out.println("Authentication failed. Please check your credentials.");
        }

    }
}
