package yagami_yong;

import java.util.ArrayList;
import java.util.List;


public class ToDoList {
    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask(String name) {
        Task task = new Task(nextId++, name);
        tasks.add(task);
        System.out.println("Vazifa qo'shildi: " + task);
    }


}
