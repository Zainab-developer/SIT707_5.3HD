package sit707_week5;

import java.util.ArrayList;
import java.util.List;

public class TaskInbox {
    private List<Task> tasks;

    public TaskInbox() {
        this.tasks = new ArrayList<>();
    }

    public List<Task> getTasksForStudent(int studentId) {
       
        return new ArrayList<>(tasks);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
}
