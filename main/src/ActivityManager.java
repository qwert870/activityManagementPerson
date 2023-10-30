import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityManager{
        private static Map<String, List<String>> taskMap;
        private List<Person> personList;


        public ActivityManager() {
                // Constructor: Initializes a task manager
                // with an empty map to store tasks for different people.
                taskMap = new HashMap<>();
        }


        public static void addTask(String person, String task) {
                if (!taskMap.containsKey(person)) {
                        taskMap.put(person, new ArrayList<>());
                }  // Adds a task to the list of tasks associated with a specific person.
                taskMap.get(person).add(task);
        }


        public void removeTask(String person, String task) {
                if (taskMap.containsKey(person)) {
                        taskMap.get(person).remove(task);
                }// Removes a task from the list of tasks associated with a specific person.
        }


        public void markTaskAsCompleted(String person, String task) {
                if (taskMap.containsKey(person)) {
                        int index = taskMap.get(person).indexOf(task);
                        if (index != -1) {
                                taskMap.get(person).set(index, task + " (Completed)");
                        }
                }  // Marks a task as completed by appending " (Completed)" to its description.
        }


        public List<String> getTasksForPerson(String person) {
                return taskMap.getOrDefault(person, new ArrayList<>());
        }// Retrieves the list of tasks associated with a specific person.


        public void setDueDate(String person, String task, String dueDate) {
                if (taskMap.containsKey(person)) {
                        int index = taskMap.get(person).indexOf(task);
                        if (index != -1) {
                                taskMap.get(person).set(index, task + " (Due Date: " + dueDate + ")");
                        }
                }
        } // Sets a due date for a task by appending " (Due Date: date)" to its description.


        public static void main(String[] args) {
                ActivityManager activityManager= new ActivityManager();
                ActivityManager.addTask("Alice", "Grocery shopping");
                ActivityManager.addTask("Bob", "Study Java");
        }// Main method: Creates a TaskManager instance and adds sample tasks for Alice and Bob.
}
