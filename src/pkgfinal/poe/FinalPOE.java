import java.util.Scanner;

public class TaskManager {

    static final int MAX_TASKS = 100; // Maximum number of tasks that can be stored
    static String[] developers = new String[MAX_TASKS];
    static String[] taskNames = new String[MAX_TASKS];
    static String[] taskIDs = new String[MAX_TASKS];
    static int[] taskDurations = new int[MAX_TASKS];
    static String[] taskStatuses = new String[MAX_TASKS];
    static int taskCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample tasks for demonstration
        addTask("Alice", "Task 1", "ID1", 5, "done");
        addTask("Bob", "Task 2", "ID2", 10, "in progress");
        addTask("Charlie", "Task 3", "ID3", 8, "done");
        addTask("Dave", "Task 4", "ID4", 12, "done");

        displayTasksByStatus("done");
        displayLongestTask();
    }

    static void addTask(String developer, String taskName, String taskID, int taskDuration, String taskStatus) {
        if (taskCount < MAX_TASKS) {
            developers[taskCount] = developer;
            taskNames[taskCount] = taskName;
            taskIDs[taskCount] = taskID;
            taskDurations[taskCount] = taskDuration;
            taskStatuses[taskCount] = taskStatus;
            taskCount++;
        } else {
            System.out.println("Maximum number of tasks reached.");
        }
    }

    static void displayTasksByStatus(String status) {
        System.out.println("Tasks with status: " + status);
        for (int i = 0; i < taskCount; i++) {
            if (taskStatuses[i].equalsIgnoreCase(status)) {
                System.out.println("Developer: " + developers[i] + ", Task Name: " + taskNames[i] + ", Duration: " + taskDurations[i] + " hours");
            }
        }
    }

    static void displayLongestTask() {
        int maxDurationIndex = 0;
        for (int i = 1; i < taskCount; i++) {
            if (taskDurations[i] > taskDurations[maxDurationIndex]) {
                maxDurationIndex = i;
            }
        }
        System.out.println("Task with the longest duration:");
        System.out.println("Developer: " + developers[maxDurationIndex] + ", Duration: " + taskDurations[maxDurationIndex] + " hours");
    }
}
import java.util.Scanner;
import java.util.Arrays;

public class TaskManager {

    static final int MAX_TASKS = 100; // Maximum number of tasks that can be stored
    static String[] developers = new String[MAX_TASKS];
    static String[] taskNames = new String[MAX_TASKS];
    static String[] taskIDs = new String[MAX_TASKS];
    static int[] taskDurations = new int[MAX_TASKS];
    static String[] taskStatuses = new String[MAX_TASKS];
    static int taskCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample tasks for demonstration
        addTask("Mike Smith", "Create Login", "ID1", 5, "To Do");
        addTask("Edward Harrison", "Create Add Features", "ID2", 8, "Doing");
        addTask("Samantha Paulson", "Create Reports", "ID3", 2, "Done");
        addTask("Glenda Oberholzer", "Add Arrays", "ID4", 11, "To Do");

        displayTasksByStatus("Done");
        displayLongestTask();
        searchTaskByName("Create Login");
        searchTasksByDeveloper("Samantha Paulson");
        deleteTask("Create Reports");
        displayAllTasks();
    }

    static void addTask(String developer, String taskName, String taskID, int taskDuration, String taskStatus) {
        if (taskCount < MAX_TASKS) {
            developers[taskCount] = developer;
            taskNames[taskCount] = taskName;
            taskIDs[taskCount] = taskID;
            taskDurations[taskCount] = taskDuration;
            taskStatuses[taskCount] = taskStatus;
            taskCount++;
        } else {
            System.out.println("Maximum number of tasks reached.");
        }
    }

    static void displayTasksByStatus(String status) {
        System.out.println("Tasks with status: " + status);
        for (int i = 0; i < taskCount; i++) {
            if (taskStatuses[i].equalsIgnoreCase(status)) {
                System.out.println("Developer: " + developers[i] + ", Task Name: " + taskNames[i] + ", Duration: " + taskDurations[i] + " hours");
            }
        }
    }

    static void displayLongestTask() {
        int maxDurationIndex = 0;
        for (int i = 1; i < taskCount; i++) {
            if (taskDurations[i] > taskDurations[maxDurationIndex]) {
          
                maxDurationIndex = i;
            }
            
