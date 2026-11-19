
import java.util.ArrayList;

public class Main {

    private ArrayList<Task> tasks = new ArrayList<>();

    public void main() {

        int choice;
        do {

            IO.println("1. Create Task");
            IO.println("2. Edit Task");
            IO.println("3. View Tasks");
            IO.println("4. Delete Task");
            IO.println("5. Quit");
            choice = Integer.parseInt(IO.readln());

            switch (choice) {
                case 1 -> createTask();
                case 2 -> editTask();
                case 3 -> viewTasks();
            }

        } while (choice != 5);

    }

    private void createTask() {

        String name = IO.readln("Enter the name of the task (required):\n");

        for (Task t : tasks ) {

            if (t.getName().equals(name)) {
                
                IO.println("Task already exists.");
                return;

            }

        }

        String description = IO.readln("Enter a description (optional):\n");
        
        tasks.addLast(new Task(name, description));

    }

    private void editTask() {

        String name = IO.readln("Enter the name of the task you wish to modify:\n");

        for (Task t : tasks) {

            if (t.getName().equals(name)) {

                String newName = IO.readln("Enter a new name or press Enter to continue:\n");
                String newDescription = IO.readln("Enter a new description or press Enter to continue:\n");

                if (!(newName.equals(""))) {
                    t.setName(newName);
                }

                if (!(newDescription.equals(""))) {
                    t.setDescription(newDescription);
                }

                return;

            }

        }

        IO.println("No task found.");

    }

    private void viewTasks() {

        if (tasks.size() == 0) {
            IO.println("Create some tasks first!");
            return;
        }

        IO.println("Todo List:");
        IO.println();
        for (int i = 0; i < tasks.size(); i++) {

            IO.println((i + 1) + ". " + tasks.get(i).toString());
            IO.println();

        }

    }

}
