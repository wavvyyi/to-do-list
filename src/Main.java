
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
            }

        } while (choice != 5);

    }

    private void createTask() {
        String name = IO.readln("Enter the name of the task (required):\n");
        String description = IO.readln("Enter a description (optional):\n");
        tasks.addLast(new Task(name, description));
    }

}
