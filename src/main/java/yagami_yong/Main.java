package yagami_yong;
public class Main {
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();

        todoList.addTask("Kitob o'qish");
        todoList.addTask("Kod yozish");

        System.out.println("\nBarcha vazifalar:");
        todoList.printTasks();

        todoList.updateTask(1, "Java kod yozish");

        System.out.println("\nYangilangan vazifalar:");
        todoList.printTasks();

        todoList.deleteTask(2);

        System.out.println("\nO'chirilganidan keyin vazifalar:");
        todoList.printTasks();
    }
}