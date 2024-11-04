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

    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
        System.out.println("ID " + id + " bilan vazifa o'chirildi.");
    }

    public void updateTask(int id, String newName) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setName(newName);
                System.out.println("Vazifa yangilandi: " + task);
                return;
            }
        }
        System.out.println("ID " + id + " bilan vazifa topilmadi.");
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Vazifalar ro'yxati bo'sh.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}
